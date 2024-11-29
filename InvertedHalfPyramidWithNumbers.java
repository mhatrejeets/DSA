public class InvertedHalfPyramidWithNumbers{
    public static void main(String args[]){
        int r = 6;
        for(int i=0;i<r;i++){
            for(int j=0;j<r-i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}