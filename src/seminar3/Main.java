package seminar3;

import seminar3.task.Task1;
import seminar3.task.Task2;
import seminar3.task.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Task1.createRandomSotredList();
        ArrayList<String> poetry = new ArrayList<>();
        poetry.add("Поэзия");
        poetry.add("Евгений Онегин");
        poetry.add("Облако в штанах");

        ArrayList<String> prose = new ArrayList<>();;
        prose.add("Проза");
        prose.add("Война и мир ");
        prose.add( "Накануне");
        Task2.fillLibrary(poetry);
        Task2.fillLibrary(prose);

        Task3.delet();





    }
}
