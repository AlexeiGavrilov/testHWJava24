package seminar5.tasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Иван Иванов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Иван Иванов
Мария Рыкова
Анна Крутова
Марина Лугова
Анна Владимирова
Петр Лыков
Иван Мечников
Петр Петин
Петр Лыков
Иван Ежов

Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.*/
public class RepeatAndSortEmploye {

    public static void run() {
        ArrayList<String> employers = new ArrayList<>();
        employers.add("Иван Иванов");
        employers.add("Иван Иванов");
        employers.add("Иван Иванов");
        employers.add("Иван sdfsdf");
        employers.add("asda Иванasdов");
        employers.add("Мария Рыкова");
        employers.add("Мария Рыкова");
        employers.add("Мария Рыкова");
        employers.add("Мария Рыков1231а");
        employers.add("Мари123123 Рыкова");

        Map<String,Integer> result = new HashMap<>();

        for (String employer : employers) {
            if (result.containsKey(employer)){
                result.put(employer,result.get(employer)+1);
            }else {
                result.put(employer,1);
            }

        }

        Map<String, Integer> sortedName = result.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));

        sortedName.entrySet().forEach(System.out::println);
    }

}
