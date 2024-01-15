package seminar2.task;
/*Дано четное число N (>0) и строки c1 и c2, которые следует учитывать как 1 символ.
Написать метод, который вернет строку длины N*2, которая состоит из чередующихся последовательностей c1 и c2, начиная с c1.
*/
public class Task1 {

    public static void printString(int number,char first, char second) {
            StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= number*2; i++) {
            builder.append(first);
            builder.append(second);
        }
        System.out.println(builder.toString());
    }
}
