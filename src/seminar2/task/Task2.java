package seminar2.task;

import java.io.FileWriter;
import java.io.IOException;

/*Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
который запишет эту строку в простой текстовый файл, обработайте исключения.*/
public class Task2 {

    public static void writeInFile() {

        try (FileWriter in = new FileWriter("test.txt");) {
            in.append(repeatHundredWord());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String repeatHundredWord() {
        return ("TEST".repeat(100));
    }
}
