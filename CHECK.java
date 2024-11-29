// Assignment number 1.
import java.util.*;
public class CHECK{
    public static void main(String args[]){
        int[] arr = new int [4  ] ;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4;i++){
            System.out.print("\nEnter the number : ");
            arr[i]= sc.nextInt();
        }

        if(arr[0] == arr[1] &&arr[1]==arr[2]&&arr[2]== arr[3]){
            System.out.print("\n All four elements are same");
        }
        else{
            System.out.print("Not same.");
        }
        

        sc.close();
    }
}