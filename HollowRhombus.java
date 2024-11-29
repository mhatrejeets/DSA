public class HollowRhombus{
    public static void main(String args []){
        int r=4;
        for(int i=0;i<r;i++){
            for(int j=0;j<r-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<r;j++){
                if(i==0 || i==r-1 ||j==0 ||j==r-1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}