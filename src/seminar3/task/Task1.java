package seminar3.task;

import java.util.*;

//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран
public class Task1 {
    static Random rnd = new Random();
    public static void createRandomSotredList (){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(rnd.nextInt(50));
        }
        System.out.println(list);
        System.out.println();
        Collections.sort(list);
        System.out.println(list);

    }
}
