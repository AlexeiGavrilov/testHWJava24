package homeWorkSeminarThree.task;

import java.util.ArrayList;
import java.util.Collections;

/*Реализовать разность массивов и симметрическую разность.*/
public class Task3 {

    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>();
        ArrayList<Integer> resultArray1 = new ArrayList<>();
        ArrayList<Integer> resultArray2 = new ArrayList<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr2.add(1);
        arr2.add(2);
        arr2.add(5);
        arr2.add(6);
        arr2.add(7);
        System.out.println(arr1);
        System.out.println(arr2);

        printDifferenceArray(arr1,arr2,resultArray1);
        printSymmetricalDifferenceArray(arr1,arr2,resultArray2);

    }


    /*В этом случае вы получите массив, содержащий все элементы arrA, которых нет в arrB,
    и наоборот, так что результат должен быть [2,3,4,6,7].*/

    public static void printSymmetricalDifferenceArray(ArrayList<Integer> array1,ArrayList<Integer> array2,
                                                       ArrayList<Integer>resultArray) {

        for (int i = 0; i < array1.size(); i++) {
            if (array2.contains(array1.get(i))!= true) resultArray.add(array1.get(i));
        }
        for (int i = 0; i < array2.size(); i++) {
            if (array1.contains(array2.get(i))!=true) resultArray.add(array2.get(i));

        }
        Collections.sort(resultArray);
        System.out.printf("Symmetrical difference Array\n");
        System.out.println(resultArray);


    }

//Разность будет выводить элементы из массива A, которых нет в массиве B.
    public static void printDifferenceArray(ArrayList<Integer> array1,ArrayList<Integer> array2,
                                            ArrayList<Integer>resultArray) {

        for (int i = 0; i < array1.size(); i++) {
            if (array2.contains(array1.get(i))!= true) resultArray.add(array1.get(i));
        }
        System.out.printf("Difference Array\n");
        System.out.println(resultArray);
    }
}
