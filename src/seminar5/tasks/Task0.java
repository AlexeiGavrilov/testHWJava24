package seminar5.tasks;

import java.util.HashMap;
import java.util.Map;

/*Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
*/
public class Task0 {

    public static void run() {
        Map<Integer,String> passportToName = new HashMap<>();
        passportToName.put(123456,"Иванов");
        passportToName.put(321456,"Васильев");
        passportToName.put(234561,"Петрова");
        passportToName.put(234432,"Иванов");
        passportToName.put(654321,"Петрова");
        passportToName.put(345678,"Иванов");

        System.out.println(passportToName);

        for (Map.Entry<Integer, String> integerStringEntry : passportToName.entrySet()) {
            if (integerStringEntry.getValue().equals("Иванов")){
                System.out.println(integerStringEntry);
            }
        }
       
        
    }
}
