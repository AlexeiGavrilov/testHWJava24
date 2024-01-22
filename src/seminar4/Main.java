package seminar4;

import seminar4.task.Task1;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Task1.time1();
        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);
        System.out.printf("Первый %d\n", duration);
        long startTime1 = System.currentTimeMillis();
        Task1.time2();
        long endTime1 = System.currentTimeMillis();
        long duration1 = (endTime1 - startTime1);
        System.out.printf("Второй %d", duration1);



    }
}
