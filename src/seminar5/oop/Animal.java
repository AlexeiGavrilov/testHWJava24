package seminar5.oop;

public class Animal {

    public String type;
    public String color;
    public int legCount;
    public int age;

    public Animal(String type){
        this.type = type;
        this.color = "white";
        this.legCount = 0;
        this.age = 1;
    }

    public Animal(String type,String color,int legCount, int age){
        this.type = type;
        this.color = color;
        this.legCount = legCount;
        this.age = age;
    }

}
