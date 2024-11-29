import java.util.*;
class pattern4{
    public static void main(String args[]){
        int n = 1;
        int num;
        Scanner sc = new Scanner(System.in);
        while(n==1){
            System.out.println("\nEnter any number");
            num = sc.nextInt();
            if(num%10 == 0){
                continue;
            }
            else if(num ==-1){
                break;
            }
            else{
                System.out.print(num);
            }
        }
        sc.close();
    }
}