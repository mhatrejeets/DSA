import java.util.*;
public class TrappedWaterProblem{

    public static int TRW(int height[],int width){
        int len = height.length;
        int lmax[] = new int [len];
        int rmax [] = new int [len];
        lmax[0]=height[0];
        //get auxiliary array formaximum of Left side boundary.
        for(int i=1;i<len;i++){
            lmax[i] = Math.max(lmax[i-1],height[i-1]);
        }
        //get auxiliary array formaximum of Left side boundary.
        rmax[len-1]= height[len-1];
        for(int i =len-2;i>=0;i--){
            rmax[i] = Math.max(rmax[i+1],height[i+1]);
        }
        int TrappedWater =0;
        for(int i=0;i<len;i++){
            int temp = Math.min(lmax[i],rmax[i]) - height[i];
            if(temp<0){
                temp=0;
            }
            TrappedWater += ((temp)*width);
        }


        return TrappedWater;
    }
    public static void main (String args[]){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the size of array : ");
        size = sc.nextInt();
        int height [] = new int [size];
        System.out.println("Enter the elements : ");

        for(int i=0;i<size;i++){
            height [i] = sc.nextInt();
        }

        System.out.println("Enter the width of each bar : ");
        int width = sc.nextInt();
        System.out.println("The trapped rainwater will be : "+ TRW(height, width));
        
        sc.close();
    }
}