public class Butterfly{
    public static void main(String args[]){
        int r = 8;
    
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(r-i)*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    
    for(int i=r;i>=0;i--){
            for(int j=i-1;j>=1;j--){
                System.out.print("*");
            }
            for(int j=((r-i)*2)+2;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
