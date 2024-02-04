package homeworkSeminarSix;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    public static void filterColor(Map<Integer,Laptop> laptopMap, int input) {
        List<Laptop> result = new ArrayList<>();
        if (input == 1) {
            for (int i = 0; i < laptopMap.size(); i++) {
                if (laptopMap.get(i).getColor() == Color.RED) {
                    result.add(laptopMap.get(i));
                }
            }
            System.out.println(result);
        }
        if (input == 2) {
            for (int i = 0; i < laptopMap.size(); i++) {
                if (laptopMap.get(i).getColor() == Color.WHITE) {
                    result.add(laptopMap.get(i));
                }
            }
            System.out.println(result);
        }
        if (input == 3) {
            for (int i = 0; i < laptopMap.size(); i++) {
                if (laptopMap.get(i).getColor() == Color.BLACK) {
                    result.add(laptopMap.get(i));
                }
            }
            System.out.println(result);
        }


    }
    public static void filterBrand(Map<Integer,Laptop> laptopMap, int input) {
        List<Laptop> result = new ArrayList<>();
        if (input == 1) {
           for (Map.Entry<Integer,Laptop> entry : laptopMap.entrySet()){
               if (entry.getValue().getBrand() == Brand.HP) result.add(entry.getValue());
            }
            System.out.println(result);
        }
        if (input == 2) {
            for (Map.Entry<Integer,Laptop> entry : laptopMap.entrySet()){
                if (entry.getValue().getBrand() == Brand.LENOVO) result.add(entry.getValue());
            }
            System.out.println(result);
        }
        if (input == 3) {
            for (Map.Entry<Integer,Laptop> entry : laptopMap.entrySet()){
                if (entry.getValue().getBrand() == Brand.MAC) result.add(entry.getValue());
            }
            System.out.println(result);
        }

    }


}
