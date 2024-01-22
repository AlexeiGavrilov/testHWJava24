package homeWorkSeminarThree.task;

import java.util.*;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task1 {
    public static Random rnd = new Random();

    public static void deleteEvenNum() {
        ArrayList<Integer> array = new ArrayList<>();
        fillArrayRandomNums(array);
        System.out.println(array);

        Iterator<Integer> iterator1 = array.iterator();
        while (iterator1.hasNext()){
            int next =  iterator1.next();
            if (next%2==0) iterator1.remove();
        }
        System.out.println(array);

    }


    public static void fillArrayRandomNums(ArrayList<Integer> array) {
        for (int i = 0; i < 15; i++) {
            array.add(rnd.nextInt(35));
        }
    }

}
