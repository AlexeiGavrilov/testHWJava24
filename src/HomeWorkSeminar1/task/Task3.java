package HomeWorkSeminar1.task;

import java.util.Scanner;

//Реализовать простой калькулятор
public class Task3 {
    public static void simpleCalculater() {
        boolean flag = true;
        while (flag) {
            Scanner iScanner = new Scanner(System.in);

            System.out.println("Для сложения введите 1\n" +
                    "Для вычитания введите 2\n" +
                    "Для умножения введите 3\n" +
                    "Для деления введите 4\n" +
                    "Для выхода введите 5\n");
            String enterThree = iScanner.next();
            int operator = Integer.parseInt(enterThree);
            if (operator == 5) {
                System.out.println("До новых встреч!");
                flag = false;
            }else {
                System.out.println("Введите первое число: ");
                String enterOne = iScanner.next();
                int firstNumber = Integer.parseInt(enterOne);
                System.out.println("Введите второе число: ");
                String enterTwo = iScanner.next();
                int secondNumber = Integer.parseInt(enterTwo);
                if (operator == 1) System.out.printf("%d + %d = %d\n", firstNumber,secondNumber,firstNumber+secondNumber);
                if (operator == 2) System.out.printf("%d - %d = %d\n", firstNumber,secondNumber,firstNumber-secondNumber);
                if (operator == 3) System.out.printf("%d * %d = %d\n", firstNumber,secondNumber,firstNumber*secondNumber);
                if (operator == 4) System.out.printf("%d / %d = %d\n", firstNumber,secondNumber,firstNumber/secondNumber);
            }

        }

    }

}

