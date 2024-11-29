public class SolidRhombus{
    public static void main(String args []){
        int r=4;
        for(int i=0;i<r;i++){
            for(int j=0;j<r-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<r;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}