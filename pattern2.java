import java.util.*;
class pattern2{
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        while(a>0){
            System.out.print(a%10);
            a/=10;
        }
        sc.close();
    }
}