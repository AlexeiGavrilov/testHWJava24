package seminar1.task;


import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

/*Написать программу, которая попросит пользователя ввести <Имя> в консоли.
Получит введенную строку и напечатает в консоль сообщение “Привет, <Имя>!”
*/
public class Task1 {

    public static void runHello() {
        Scanner iScanner = new Scanner(System.in);
        String s = iScanner.nextLine();
        System.out.printf("Првет, %s",s );
        System.out.println();
        System.out.println(LocalDateTime.now());
    }



}
