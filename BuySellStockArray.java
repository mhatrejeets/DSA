import java.util.*;
public class BuySellStockArray {

    public static int BSS(int prices[]){
        int profit=0;
        int BP = prices[0];
        int SP = prices[0];
        if(prices.length <=1){
            System.out.println("\nIn adequate data.");
        }
        else{
            for(int i=1;i<prices.length;i++){
                SP=prices[i];
                if(SP>BP && profit<SP-BP ){
                    profit = SP-BP;
                }
                if(SP<BP){
                    BP=SP;
                }
            }
        }

        return profit;
    }
    public static void main(String args[]){
    System.out.println("Enter the size of array : ");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int prices [] = new int [size];
    System.out.println("Enter the elements array : ");
    for(int i=0;i<size;i++){
        prices[i] =sc.nextInt();
    }

    System.out.println("The maximum profit will be : "+ BSS(prices));

    sc.close();
    }

}