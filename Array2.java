import java.util.*;
public class Array2{
    public static void pairs (int arr[]){
        for(int i=0;i<arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + arr[i] + "," + arr[j]+ ")");
            }
            System.out.println();
        }
    }

    public static void printSubArrays (int arr[]){
        for(int i=0;i<arr.length; i++){
            for(int j=i;j<arr.length;j++){
                for(int k =i; k<=j; k++){
                System.out.print(arr[k]);
                }
                System.out.print("\t");
                
            }
            System.out.println();
        }
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] + "\t");
        }
    }
    public static void main(String args []){
        int arr [] = new int [5];
        Scanner sc = new Scanner (System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("\nEnter number " + i + " : ");
            arr[i]=sc.nextInt();
        }

        System.out.print("\nThe array is : ");
        display(arr);
        System.out.println("\nThe pairs are :");
        pairs(arr);
        System.out.print("\nThe sub array are : ");
        printSubArrays(arr);
        sc.close();

    }

}