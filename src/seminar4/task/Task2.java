package seminar4.task;

import javax.swing.text.html.parser.Parser;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.SortedMap;

/*Реализовать консольное приложение, которое:
Принимает от пользователя строку вида
text:num
Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.
*/
public class Task2 {


    public static void runSplitLinkedList() {
        LinkedList<String> resultList = new LinkedList<>();
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Чтобы выйти из программы напишите Exit");
            System.out.println("Введите ваш текст: \n");
            String text = scanner.next();
            String[] array = text.split(":");
            if (array[0].toLowerCase().equals("exit")) {
                System.out.println("До свидания");
                break;
            }
            if (array.length < 2 || array.length > 2 || !isDigit(array[1])) {
                System.out.println("Не корректные данные");
            } else {
                int index = Integer.parseInt(array[1]);
                if (index>resultList.size()){
                    for (int i = 0; i < index; i++) {
                        resultList.add(null);
                    }
                }
                if (array[0].equals("print")) {
                    System.out.println(resultList.get(index));
                    resultList.remove(index);
                } else {
                    resultList.add(index, array[0]);
                }
            }
            System.out.println(resultList);
        }

    }


    public static boolean isDigit(String a) {
        if (a == null) return false;
        try {
            int d = Integer.parseInt(a);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;

    }
}

