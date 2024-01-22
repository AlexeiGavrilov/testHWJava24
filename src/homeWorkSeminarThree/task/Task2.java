package homeWorkSeminarThree.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.*/
public class Task2 {
    public static Random rnd = new Random();
    public static void printMaxValue(ArrayList<Integer> arr) {
        int max = arr.get(0);
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()){
            int variable = iterator.next();
            if (variable>max){
                max = variable;
            }
        }
        System.out.println();
        System.out.printf("%d - Max Value", max);

    }
    public static void printMinValue(ArrayList<Integer> arr) {
        int min = arr.get(0);
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()){
            int variable = iterator.next();
            if (variable<min){
                min = variable;
            }
        }
        System.out.println();
        System.out.printf("%d - Min Value", min);

    }

    public static void printAverageValue(ArrayList<Integer> arr) {
        int sum = 0;
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()){
            int variable = iterator.next();
            sum+=variable;
        }
        int result = sum/ arr.size();
        System.out.println();
        System.out.printf("%d - Average Value",result);

    }


    public static void fillArrayRandomNums1(ArrayList<Integer> array) {
        for (int i = 0; i < 8; i++) {
            array.add(rnd.nextInt(35));
        }
        System.out.println(array);
    }
}
