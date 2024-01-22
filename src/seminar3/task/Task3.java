package seminar3.task;

import java.util.ArrayList;

/*Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа
*/
public class Task3 {

    public static void delet() {
        ArrayList test = new ArrayList<String>();
        test.add("Hello");
        test.add(56);
        test.add(192);
        test.add(19312);
        test.add("sdds");
        test.add(50);
        System.out.println(test);

        for (int i = 0; i < test.size(); i++) {
            if (test.get(i) instanceof Integer) {
                test.remove(i);
                i--;
            }
            System.out.println(test);
        }

    }
}
