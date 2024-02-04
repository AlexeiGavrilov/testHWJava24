package homeworkSeminarSix;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

public class input {

    public static void scanner(Map<Integer, Laptop> laptopMap) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Выбрать по цвету, введите - 1\n" +
                    "Выбрать по бренду, введите - 2\n" +
                    "Для выхода, введите - 0");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Красный - 1\n Белый - 2\n Черный - 3");
                int input1 = scanner.nextInt();
                if (input1 < 0 || input1 > 3) {
                    System.out.println("Не корректные данные");
                }
                Filter.filterColor(laptopMap, input1);
            }
            if (input == 2) {
                System.out.println("HP - 1\n Lenovo - 2\n Mac - 3");
                int input2 = scanner.nextInt();
                if (input2 < 0 || input2 > 3) {
                    System.out.println("Не корректные данные");
                }
                Filter.filterBrand(laptopMap,input2);
            }
            if (input == 0) {
                flag = false;
                System.out.println("До свидания!");
            }
            if (input<0 || input >3){
                System.out.println("Не корректные данные");
            }

        }
    }
}