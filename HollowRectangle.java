public class HollowRectangle{
    public static void main(String args []){
        int r=4;
        int c=5;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==r-1 || j==c-1 || i ==0 || j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}