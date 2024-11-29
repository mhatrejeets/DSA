import java.util.*;
class prime{
    public static void main(String args[]){
        System.out.println("Enter any number : ");
        int num;
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        int flag = 0;
        if(num==0 || num==1||num==2){
            flag=1;
        }
        else{
        for(int i= 2;i<num;i++){
            if(num%i==0){
                flag =1;
                break;
            }
        }
    }

    if(flag ==0){
        System.out.print("True");
    }
    else{
        System.out.print("False");
    }

    sc.close();
    }
}