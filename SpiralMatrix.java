import java.util.*;
public class SpiralMatrix{

    public static void inputArr(int arr[][],int row,int col){
        Scanner scr = new Scanner (System.in);
        System.out.println("\nEnter the elements of the array : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("\nEnter element "+ i+" "+j+" :");
                arr[i][j]= scr.nextInt();
            }
        }
        //scr.close();
    }

    public static int diagonalSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];

            if(i != arr.length-i-1){
                sum+=arr[i][arr.length-i-1];
            }
        }
        return sum;
    }

    public static void displaySpiral(int arr[][],int row,int col){
        System.out.println("\nThe spiral matrix is : ");
        int i,j,k,l,m;
        for(i=0;i<row;i++){
            for(j=i;j<col;j++){
                System.out.print(arr[i][j]+" ");
        
            }

            for(k=j;k<row;k++){
                System.out.print(arr[k][j]+" ");
            }

            for(l=k;l>=i;l--){
                System.out.print(arr[k][l]+" ");
            }
            for(m=l;m<i;m--){
                System.out.print(arr[l][m]+" ");
            }
            row--;
            col--;
        }
    }

    public static void printSpiral(int arr[][]){
        System.out.println("\nThe spiral matrix is : ");
        int startrow =0,startcol=0;
        int endrow=arr.length-1;
        int endcol= arr[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<=endcol;j++){
                System.out.print(arr[startrow][j]+" ");
        
            }

            for(int k = startrow+1;k<=endrow;k++){
                System.out.print(arr[k][endcol]+" ");
            }

            for(int l = endcol-1;l>=startcol;l--){
                System.out.print(arr[endrow][l]+" ");
            }
            for(int m=endrow-1;m>=startrow+1;m--){
                System.out.print(arr[m][startcol]+" ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
    
        }
    }

    public static void display(int arr[][],int row,int col){
        System.out.println("\nThe elements of the array  are : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println("");
        }
    }

    public static boolean StairecaseSearch(int matrix[][],int key){
        int row = matrix.length;
        int column = matrix[0].length;
        int i=0;
        int j=column-1;
        while(i<row&&j>=0){
            if(key== matrix[i][j]){
                System.out.println("\nThe key is present at : "+i+" "+j);
                return true;
            }
            else if (key<matrix[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("\n Key not found.");
        return false;
    }
    public static void main(String args[]){
        System.out.println("Enter the rows and columns : ");
        Scanner sc = new Scanner (System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][]= new int [row][col];
        inputArr(arr,row,col);
        display(arr,row,col);
        printSpiral(arr);
        System.out.print("\nDiagonal SUM "+ diagonalSum(arr));
        System.out.println("ENter key : ");
        int key = sc.nextInt();
        System.out.println("Input exe");
        boolean a = StairecaseSearch(arr, key);
        sc.close();
    }
}