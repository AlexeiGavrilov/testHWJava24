package seminar1.task;

/*Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.*/
public class Task2 {
    public static void outputNumbers(int[] arr) {

//        int max = 0;
//        int i = 0;
//        boolean flag = true;
//        while (flag) {
//            int count = 0;
//            while (arr[i] == 1) {
//                count++;
//                i++;
//                if (i == arr.length) {
//                    flag = false;
//                    break;
//                }
//            }
//            i++;
//            if (count > max) max = count;
//
//        }
        int count = 0;
        int max = 0;
        for (int i : arr) {
            if (i ==1) count++;
            else count =0;
            if(count>max) {
                max = count;
            }
        }
        System.out.println("1 ".repeat(max));
    }
}
