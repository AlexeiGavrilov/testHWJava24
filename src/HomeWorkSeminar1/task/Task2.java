package HomeWorkSeminar1.task;

public class Task2 {

    public static void outputSimpleNumbers(int number) {
        for (int i = 2; i < number; i++) {
            if (i == 2 || i == 3 || i == 5) {
                System.out.printf("%d ", i);
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.printf("%d ", i);

            }

        }

    }
}
