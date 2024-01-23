package seminar4.task;

import java.util.*;

/*Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.*/
public class Task4 {

    public static void run3() {


        int[] array = new int[]{1, 4, 5, 6, 12, 48};
        Stack<Integer> stack = new Stack<>();

        Deque<Integer> q = new ArrayDeque<>();


        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            q.push(array[i]);
        }

        System.out.println(stack);
        System.out.println(q);

    }
}
