package homeworkSeminarSix;

import java.util.*;

/*Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.

Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:

1 - бренд

2 -цвет

Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
СПОЙЛЕР:

1) создаете класс ноутбук (equals, hashCode)
2) создаете сет ноутбукоа
3) создаете и заполняете Map<Integer, Laptop>
4) запрашиваете через сканнер у пользователя критерий фильтрации
5) циклом проходите по Map.Entry<Integer, Laptop> entry: entries
6) В результирующий Set<Laptop> складываете ноутбуки entry.getValue() у которых
равны критерию пользователя*/
public class Main {

    public static void main(String[] args) {

        Laptop laptopOne = new Laptop(Color.BLACK,Brand.LENOVO);
        Laptop laptopTwo = new Laptop(Color.RED,Brand.LENOVO);
        Laptop laptopThree = new Laptop(Color.WHITE,Brand.MAC);
        Laptop laptopFour = new Laptop(Color.RED,Brand.HP);
        Laptop laptopFive = new Laptop(Color.BLACK,Brand.MAC);

        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptopOne,laptopTwo,laptopThree,laptopFour,laptopFive));
        Map <Integer,Laptop> collectionsLaptop = new HashMap<>();

        Iterator<Laptop> iterator= laptops.iterator();
        int i = 0;
        while (iterator.hasNext()){
            collectionsLaptop.put(i,iterator.next());
            i++;
        }

        input.scanner(collectionsLaptop);






    }

}
