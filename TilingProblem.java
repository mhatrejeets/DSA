public class TilingProblem{
    public static int totalWays(int n){
        if(n==0 || n==1){
            return 1;
        }

        int veryicalWays = totalWays(n-1);
        int horizontalWays = totalWays(n-2);

        int TotalWays = veryicalWays + horizontalWays;

        return TotalWays;
    }

    public static void main(String args[]){
        System.out.print("\nTotal ways : ");
        int n = 5;
        System.out.println(totalWays(n));
    }
}