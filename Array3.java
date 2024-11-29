import java.util.*;
public class Array3{
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

    public static int maxOfSubarry (int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            for(int j=i;j<arr.length;j++){
                int sum =0;
                for(int k =i; k<=j; k++){
                sum+= arr[k];
                }
                if(sum>largest){
                    largest = sum;
                }
                
            }
           
        }
        return largest;
    }

    public static int minOfSubarry (int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length; i++){
            for(int j=i;j<arr.length;j++){
                int sum =0;
                for(int k =i; k<=j; k++){
                sum+= arr[k];
                }
                if(sum<min){
                    min = sum;
                }
                
            }
            
        }
        return min;
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
        System.out.println("\nTHe max sum is : " + maxOfSubarry(arr));
        System.out.println("\nTHe min sum is : " + minOfSubarry(arr));
        sc.close();

    }

}