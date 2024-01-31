package seminar6;

import seminar6.tasks.Cat;
import seminar6.tasks.Owner;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Петр Васильевич", "+718282916");
        Cat firstCat = new Cat("Барсик",13,true,"Линяет",owner );
        Cat secondCat = new Cat("Барсик",13,true,"Линяет",owner );
        Cat threeCat = new Cat("Барсик",13,true,"Линяет",owner );
        Cat fourCat = new Cat("Тмигрик",13,true,"Линяет",owner );
        System.out.println(firstCat);

        Set<Cat> cats = new HashSet<>();
        cats.add(firstCat);
        cats.add(secondCat);
        cats.add(threeCat);
        cats.add(fourCat);

        System.out.println(cats);

    }


}



//        Map<String, Integer> map =
//                Map.of("Анна", 3, "Борис", 2, "Вова", 2, "Гена", 5, "Дима", 1);
//        Map<String, Integer> result = new LinkedHashMap<>();
//
//        List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
//        entries.sort(comparator); // Comparator.comparing(o -> (o.getValue())) OR Map.Entry.comparingByValue()
//
//
//        for (Map.Entry<String, Integer> entry: entries) {
//            result.put(entry.getKey(), entry.getValue());
//        }
//
//        System.out.println(result);




//    static Comparator<Map.Entry<String, Integer>> comparator = (o1, o2) -> o1.getValue().compareTo(o2.getValue());