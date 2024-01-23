package homeWorkSeminarFour.tasks;

import java.util.Collections;
import java.util.List;

/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.*/
public class Task1 {

    public static void reverseList(List<Integer> list) {
        Collections.reverse(list);
        System.out.println(list);
    }

}
