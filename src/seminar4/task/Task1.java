package seminar4.task;

import java.util.ArrayList;
import java.util.LinkedList;

/*1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
*/
public class Task1 {
    public static void time1() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arr.add(i);
        }
    }
    public static void time2() {
        LinkedList<Integer> arr = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            arr.add(i);
        }
    }

}
