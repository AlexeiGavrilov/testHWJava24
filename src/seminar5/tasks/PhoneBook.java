package seminar5.tasks;

import java.util.*;

/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.*/
public class PhoneBook {

    public static void addNumber(String key, String number, Map<String, ArrayList<String>> phoneBook) {
        if (phoneBook.containsKey(key)){
            phoneBook.computeIfAbsent(key, k -> new ArrayList<>()).add(number);
        }else {
            phoneBook.computeIfAbsent(key, k -> new ArrayList<>()).add(number);
        }
    }
    public static void deleteNumber(String key,Map<String, ArrayList<String>> phoneBook ){
        System.out.println("Какой номер хотите удалить? ");
        System.out.println(phoneBook.get(key));
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

    }





}
