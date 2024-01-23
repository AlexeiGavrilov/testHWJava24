package homeWorkSeminarFour;

import homeWorkSeminarFour.tasks.OurQueue;
import homeWorkSeminarFour.tasks.Task1;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        System.out.println("\n" + list);
        Task1.reverseList(list);

        OurQueue ourQueue = new OurQueue();
        ourQueue.enqueue(5);
        ourQueue.enqueue(4);
        ourQueue.enqueue(43);
        ourQueue.enqueue(14);
        System.out.println(ourQueue.dequeue());
        System.out.println(ourQueue.first());

    }
}
