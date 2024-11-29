public class BitwiseEvenOdd{
    public static void main(String args[]){
        int a=4;
        int bitmask = 1;
        if((a & bitmask) == 0){
            System.out.print("Is even");
        }
        else{
            System.out.print("Odd");
        }
    }
}