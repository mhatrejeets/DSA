import java.util.*;
public class PrimeInRange{

    public static boolean isPrime(int n){
        boolean a = true;
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                a= false;
                break;
            }
        }
        return a;
    }

    public static void printPrime(int start , int end){
        for(int i= start;i<=end; i++){
            if(isPrime(i)){
                System.out.print(i+"\t");
            }
        }
    }

    public static void main(String args[]){
        System.out.println("Enter the start of range : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter the end of range : ");
        int num2 = sc.nextInt();
        System.out.println("THe primes in the range are : ");
        printPrime(num1,num2);
        sc.close();
        
    }
}