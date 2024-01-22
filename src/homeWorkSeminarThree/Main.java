package homeWorkSeminarThree;

import homeWorkSeminarThree.task.Task1;
import homeWorkSeminarThree.task.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      //  Task1.deleteEvenNum();

        ArrayList<Integer> array = new ArrayList<>();
        Task2.fillArrayRandomNums1(array);
        Task2.printMaxValue(array);
        Task2.printMinValue(array);
        Task2.printAverageValue(array);
        
    }
}
