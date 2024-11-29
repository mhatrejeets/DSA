import java.util.*;
public class Array5 {
    public static int maxOfSubarry(int arr[]){
        int cs=0;
        int ms = Integer.MIN_VALUE;
        int maxofarr = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            ms= Math.max(cs,ms);
        }
        if(ms==0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>maxofarr){
                    maxofarr = arr[i];
                }
            }
            ms = maxofarr;
        }
        return ms;
    }
    public static void main (String args []){
            int arr [] = new int [8];
            Scanner sc = new Scanner (System.in);
            for(int i=0;i<arr.length;i++){
                System.out.print("\nEnter number " + i + " : ");
                arr[i]=sc.nextInt();
            }
            System.out.println("\nThe max of sub-array is : "+ maxOfSubarry(arr));
            sc.close();


    }
}