import java.util.*;
public class area{
    public static void main(String args[]){
        System.out.print("Enter the radius of the circle :");
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f* rad*rad;
        System.out.println(area);
        sc.close();
    }
}