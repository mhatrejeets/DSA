public class Recursionnto1 {

    public static void printfunc(int n){
        if(n!=0){
            System.out.println(n);
            printfunc(n-1);
        }
    }

    public static void printfunc1(int i,int n){
        if(i==n){
            System.out.println(i);
            return;
       
        }
        System.out.println(i);
        i=i+1;
        printfunc1(i,n);
        

    }

    public static void main(String args[]){
        printfunc(10);
        printfunc1(1,10);
    }
}
