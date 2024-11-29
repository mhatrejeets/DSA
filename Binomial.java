import java.util.*;
public class Binomial{

    public static double factorial(float num){
        double fact=1;
        for(int i= 2; i<=num;i++){
            fact *= i;
        }
        return fact;
    }
    
    public static double findBinomial(float n , float r ){
        double ncr = factorial(n)/(factorial(r)  * factorial(n-r)); 
        return ncr;
    }

    public static void main(String args[]){
        System.out.print("\nEnter the value of n : ");
        Scanner sc = new Scanner(System.in);
        float n, r;
        n = sc.nextFloat();
        System.out.print("\nEnter the value of r : ");
        r = sc.nextFloat();
        System.out.println("The value of the binomial coefficient is :" + findBinomial(n,r));
         sc.close();
    }
}