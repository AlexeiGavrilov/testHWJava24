package seminar2.task;
/*Напишите метод, который принимает на вход строку (String)
и определяет является ли строка палиндромом (возвращает boolean значение).
 */
public class Task5 {
    public static boolean isStringPolindrom(String someString) {
        someString.toLowerCase();
        Character [] array = new Character[someString.length()];
        fillCharacterArray(someString, array);
        int count = 0;
        for (int i = 0, j = 1; i < array.length/2; i++,j++) {
            if (array[i].equals(array[array.length-j])){
                count++;
            }
        }
        if (count== array.length/2) return true;

        return false;
    }

    public static void fillCharacterArray (String n, Character [] ch){
        for (int i = 0; i < ch.length; i++) {
            ch[i] = n.charAt(i);
        }
    }


}
