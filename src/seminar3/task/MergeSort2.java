package seminar3.task;

import java.util.Arrays;

public class MergeSort2 {

    public static int[] MergeSort1(int[] array) {
        if (array.length <= 1) return array;
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, left.length, array.length);

        return merge(MergeSort1(left), MergeSort1(right));

    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int resIn = 0, leftIn = 0, rightIn = 0;

        while(leftIn<left.length && rightIn<right.length){
            if (left[leftIn]< right[rightIn]){
                    result[resIn] = left[leftIn];
                    leftIn++;
            } else{
                result[resIn] = right[rightIn];
                rightIn++;
            }
            resIn++;
        }
        while (resIn<result.length)
        {
            if (leftIn!=left.length) {
                result[resIn] = left[leftIn];
                leftIn++;
            }else {
                result[resIn] = right[rightIn];
                rightIn++;
            }
            resIn++;
        }
        return result;
    }


}
