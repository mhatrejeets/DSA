public class Diamond{
    public static void main(String args []){
        int r=10;
        for(int i=0;i<r;i=i+2){
            for(int j=0;j<r-i;j=j+2){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i=r;i>0;i=i-2){
            for(int j=r-i;j>0;j=j-2){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}