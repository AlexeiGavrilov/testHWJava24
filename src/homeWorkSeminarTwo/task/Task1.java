package homeWorkSeminarTwo.task;

import seminar2.task.Log;
import seminar2.task.Task3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    private static final Logger LOG = Log.log(Task3.class.getName());

    public static void printArray (int [] array) {
        for (int i : array) {
            System.out.printf("%d ",i);
        }
    }

    public static void sortedArrayBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    LOG.log(Level.INFO,"Поменяли местами");

                }
            }
        }
    }
}
