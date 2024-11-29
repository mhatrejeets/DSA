import java.util.*;
class pattern3{
    public static void main(String args[]){
        int num1 , num2=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any number : ");
        num1 = sc.nextInt();
        int num3;
        while(num1>0){
            num3=num1%10;
            num2=num2*10+num3;
            num1/=10;
        }
        System.out.print(num2);
        sc.close();
    }
}