import java.util.*;
public class Array4{
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
        int len = arr.length;
        int largest = Integer.MIN_VALUE;
        int prefix [] = new int [len];
        prefix [0]= arr[0];
        for(int i=1;i<len;i++){
            prefix[i] =prefix[i-1] + arr[i]; 
        }
        for(int i=0;i<len;i++){
            for(int j=i;j<len; j++){
                if(i==0 && prefix[j]>largest){
                    largest = prefix[j];
                }
                else if((prefix[j]- prefix[i-1])>largest){
                    largest = prefix[j]- prefix[i-1];
                }
            }
        }

        return largest;
    }

    public static int minOfSubarray(int arr[]) {
        int len = arr.length;
        int smallest = Integer.MAX_VALUE;
        int prefix[] = new int[len];
        prefix[0] = arr[0];
    
        for (int i = 1; i < len; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
    
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (i == 0) {
                    if (prefix[j] < smallest) {
                        smallest = prefix[j];
                    }
                } else {
                    if ((prefix[j] - prefix[i - 1]) < smallest) {
                        smallest = prefix[j] - prefix[i - 1];
                    }
                }
            }
        }
    
        return smallest;
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
        System.out.println("\nTHe min sum is : " + minOfSubarray(arr));
        sc.close();

    }

}