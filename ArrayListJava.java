import java.util.*;
public class ArrayListJava{
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list);
        System.out.println(list.get(5));
        System.out.println(list.remove(4));
        System.out.println(list);
        System.out.println(list.set(3,55));
        System.out.println(list);
        System.out.println(list.contains(45));
        System.out.println(list);


    }
}