package seminar4.task;

import java.util.*;

/*Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.*/
public class Task3 {

    public static void run2() {
        Deque<String> result1 = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Print, чтобы выводить строки наоборот");
        System.out.println("Введите Revert, чтобы удалить последнюю строку");
        System.out.println("Введите Exit, чтобы выйти из программы");
        while (true)
        {
            System.out.println("Вводите ваши строки сколько влезет");
            String text = scanner.nextLine();
            if(text.equalsIgnoreCase("print")){
                System.out.println(result1);
            } else if(text.equalsIgnoreCase("revert")) {
                System.out.println("Удаляем элемент " + result1.pop());
            } else if (text.equalsIgnoreCase("exit")) break;
            else {
                result1.push(text);
            }


        }
        System.out.println(result1);


    }
}
