package homeWorkSeminarTwo;

import homeWorkSeminarTwo.task.Task1;
import homeWorkSeminarTwo.task.Task2;

/*Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*/
public class Main {
    public static void main(String[] args) {
            int [] testArray = new int [] {11,2,33,14,155,6,0,8};

        Task1.sortedArrayBubble(testArray);
        Task1.printArray(testArray);

        Task2.printResultString();



    }
}
