package HomeWorkSeminar1.task;

public class Task1 {
    public static void calculationTriangularNumber (int number){
        System.out.println((number*(number+1))/2);
    }

    public static int calculationFactorialNumber(int number){
        if (number==1) return 1;
        else return number * calculationFactorialNumber(number-1);
    }

}
