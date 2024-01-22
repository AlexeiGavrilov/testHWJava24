package seminar3.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.*/

//Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
public class Task4 {

    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Mercury");

        ArrayList<Integer> countPlanets = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();
        for (String planet : planets) {
            int position = resultList.indexOf(planet);
            if(position>=0){
                countPlanets.set(position,countPlanets.get(position)+1);
            }else {
                resultList.add(planet);
                countPlanets.add(1);
            }
        }


        printPlanetCount(resultList,countPlanets);


        for (int i = 0; i < planets.size(); i++) {
            int pos = resultList.indexOf(planets.get(i));
            if(countPlanets.get(pos) > 1){
                planets.remove(planets.indexOf(planets.get(i)));
                countPlanets.set(pos,countPlanets.get(pos)-1);
                i--;
            }

        }


        System.out.println(planets);

        printPlanetCount(resultList,countPlanets);


    }

    private static void printPlanetCount(List<String> planets, List<Integer> counts) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i));
        }
    }


}
