import java.util.*;
public class StackApnaCollege{
    public static void main(String args []){
        Stack <Integer> stk = new Stack<>();
        stk.push(0);
        stk.push(99);
        stk.push(55);
        stk.push(3);
        System.out.println(stk);
        Queue <Integer> q = new LinkedList<>();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        //
        q.remove();
        System.out.println(q);
        System.out.println(q.peek()); 

    }
}