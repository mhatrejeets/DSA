public class PairingFriendRecursionApnaClg{

    public static void convertToString (int num , String arr []) {
        if(num ==0 ){
            return;
        }
        int lastDigit = num %10;
        convertToString(num/10, arr);
        System.out.print(arr[lastDigit]);
            
        
    }

/*public static int lengthOfString(String str, int index){
    if(str.charAt(index)=='\0'){
        return 1;
    }

    return (1 + lengthOfString(str, index+1));

}
*/
public static void printIndices (int arr[], int index,  int key){
    if(index == arr.length){
        return;
    }

    if(arr[index]== key){
        System.out.print(index+1 + " ");
    }
    printIndices(arr, index+1, key);
}
public static void printBinaryStr(int n , int lastPlace, String str){
    if(n==0){
        System.out.println(str);
        return;
    }
    printBinaryStr(n-1, 0, str+"0");
    if(lastPlace==0){
        printBinaryStr(n-1, 1, str+"1");
    }
}
    public static int retNoOfWays(int frnds , int tsum, int iter){
        if(frnds == 0){
            return 0;
        }

        if(iter ==1){
            tsum ++;
            return tsum + retNoOfWays(frnds, tsum,iter+1);
        }

        if(iter == frnds+1){

            return 0;
        }
        
        //even
        if(iter%2 == 0){
            tsum++;
            return tsum + retNoOfWays(frnds, tsum,iter+1);
        }

            return tsum + retNoOfWays(frnds, tsum,iter+1);
        
    
        
    }
    public static void main(String args[]){
        int frnds = 4;
        System.out.println(retNoOfWays(frnds, 0, 1));
        printBinaryStr(3, 0, "");
        int arr [] = {1,2,3,4,5,6,5,4,2,3,4,2,3,4 };
        printIndices(arr,0, 4);
        String numwords [] = {"zero " , "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
        int numbeeer = 6580;
        System.out.println();
        convertToString(numbeeer, numwords);
        String strr = "jeetsmhatre";
        //System.out.println(lengthOfString(strr,0));
    }
}