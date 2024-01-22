package homeWorkSeminarTwo.task;

/*Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*/
public class Task2 {

    public static String [] splitStringJson() {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        String line1 = json.replace("[", "");
        String line2 = line1.replace("]", "");
        String line3 = line2.replace("{", "");
        String line4 = line3.replace("}", "");
        String line5 = line4.replace("\"", "");
        String line6 = line5.replace(":", " ");
        String line7 = line6.replace(",", " ");

        String[] result = line7.split(" ");

        return result;

    }

    public static void printResultString() {
        String [] splitedJson = splitStringJson();
        StringBuilder builder = new StringBuilder();

        String[] listName = {" Студент ", " получил ", " по предмету "};
        for (int i = 1, j = 0; i < splitedJson.length; i += 2, j++) {
            if (j >= listName.length) j = 0;
            builder.append(listName[j]);
            builder.append(splitedJson[i]);
            if (splitedJson[i].equals("Математика") ||
                    splitedJson[i].equals("Информатика") ||
                    splitedJson[i].equals("Физика"))
                builder.append(".");

        }
        System.out.println(builder);

    }




}


