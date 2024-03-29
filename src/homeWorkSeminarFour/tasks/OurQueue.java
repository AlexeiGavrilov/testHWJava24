package homeWorkSeminarFour.tasks;

import java.util.LinkedList;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя.*/
public class OurQueue {

    private LinkedList<Integer> list;

    private int top;
    public  OurQueue(){
        list = new LinkedList<>();
        top=0;
    }

    public void enqueue(int value){
        list.addLast(value);
    }

    public int first(){
        return list.getFirst();
    }
    public int dequeue() {
        return list.pollFirst();
    }


    public int get(int index){
        return list.get(index);
    }


}
