import java.util.*;
public class PrimeOptimized{

    public static boolean isPrime(int n){
        boolean a = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                a= false;
                break;
            }
        }
        return a;
    }

    public static void main(String args[]){
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("Is prime");
        }
        else{
            System.out.print("\nNot prime");
        }
        sc.close();
        
    }
}