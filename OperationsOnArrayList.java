import java.util.ArrayList;
import java.util.Collections;
public class OperationsOnArrayList{
public  static void swaping (ArrayList <Integer> l1 , int index1 , int index2){
    int temp = l1.get(index1);
    l1.set(index1, l1.get(index2));
    l1.set(index2, temp);

    
}

    public static void main(String args []){
        ArrayList <Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);
        System.out.println(l1.get(1));
        l1.remove(1);
        System.out.println(l1);
        l1.set(1,10);
        l1.set(1,19);
        System.out.println(l1);
        System.out.println(l1.contains(11));
        System.out.println(l1.contains(1));
        l1.add(12);
        l1.add(33);
        l1.add(21);
        l1.add(65);
        l1.add(98);
        l1.add(87);
        l1.add(44);

        for(int i = l1.size()-1;i>=0;i--){
            System.out.print(l1.get(i) + " " );
        }
        int max = Integer.MIN_VALUE;
        for(int i =0 ;i<l1.size()-1;i++){
            if(max<l1.get(i)){
                max = l1.get(i);
            }
        }

        System.out.println("\nmax : "+max);
        System.out.println(l1);
        swaping(l1,3,5);
        System.out.println(l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println(l1);
        //Collections.reverseOrder(l1);
        //System.out.println(l1);

    }
}