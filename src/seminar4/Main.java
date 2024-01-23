package seminar4;

import seminar4.task.*;

public class Main {
    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        Task1.time1();
//        long endTime = System.currentTimeMillis();
//
//        long duration = (endTime - startTime);
//        System.out.printf("Первый %d\n", duration);
//        long startTime1 = System.currentTimeMillis();
//        Task1.time2();
//        long endTime1 = System.currentTimeMillis();
//        long duration1 = (endTime1 - startTime1);
//        System.out.printf("Второй %d", duration1);

//        Task2.runSplitLinkedList();

//        Task3.run2();
//        Task4.run3();

        OurNewStack stack = new OurNewStack();

        stack.push(5);
        stack.push(52);
        stack.push(2);
        stack.push(3);
        stack.push(1);

        for (int i = 0; i < stack.getCapacity()-1; i++) {
            System.out.println(stack.pop());
        }
        for (int i = 0; i < stack.getCapacity()-1; i++) {
            System.out.println(stack.pop());
        }

    }
}
