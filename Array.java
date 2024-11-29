import java.util.*;
public class Array{
    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]+=1;
        }
    }

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] + "\t");
        }
    }
    
    public static int binary_search(int arr[], int key){
        int i=0;
        int start =0;
        int end = arr.length -1;
        while (arr[i]!='\0'){
            int mid =(start + end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr [mid]>key){
                end = mid-1;
            }

            else{
                start = mid+1;
            }
            
        }
        return -1;
    }

    public static void reverseArray(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i]= arr[arr.length -i-1];
            arr[arr.length -i-1] = temp;
        }
    }
    public static void main(String args []){
        int arr [] = new int [5];
        Scanner sc = new Scanner (System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("\nEnter number " + i + " : ");
            arr[i]=sc.nextInt();
        }
        System.err.println("\nArray before : \n " );
        display(arr);
        update(arr);
        System.err.println("\nArray after : \n " );
        display(arr);
        reverseArray(arr);
        System.err.println("\nArray rev : \n " );
        display(arr);


        System.out.print("\nEnter the key : ");
        int key = sc.nextInt();
        int index = binary_search(arr, key);
        if(index == -1 ){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index : "+ index);
        }
       
        sc.close();
    }
}