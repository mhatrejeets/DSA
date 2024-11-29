public class Flyods01Triangle{
    public static void main(String args[]){
        int r = 5;
        int counter =1;
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print(counter%2);
                counter++;
            }
            System.out.println();
        }
    }
}