package seminar2.task;

/*Напишите метод, который сжимает строку.
Пример: aaaabbbcdd → a4b3cd2
*/
public class Task4 {
    public static String compressString(String someString) {

        StringBuilder builder = new StringBuilder();
        char first = someString.charAt(0);
        int count = 0;
        for (int i = 0; i < someString.length(); i++) {
            if (first == someString.charAt(i)) {
                count++;
            } else {
                if (count > 1) {
                    builder.append(first).append(count);
                } else {
                    builder.append(first);
                }
                count = 1;
                first = someString.charAt(i);
            }
        }
        if (count > 1) {
            builder.append(first).append(count);
        } else {
            builder.append(first);
        }
        return builder.toString();

    }
}
