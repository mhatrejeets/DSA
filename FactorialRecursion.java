public class FactorialRecursion {

    public static int nNaturalNum(int n){
        if(n == 1){
            return 1;
        }
        return n + nNaturalNum(n-1);
    }

    public static int Factorial(int n){
        if(n == 0 || n== 1){
            return 1;
        }
        else {
            return n * Factorial(n-1);
        }
    }

    public static int Fibonacci(int n){
     if(n==0||n==1){
        return n;
     }

     return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static boolean CheckArray(int arr[],int ptr){
        if(ptr == 0){
            return true;
        }

        if(arr[ptr]>=arr[ptr-1]){
        return CheckArray(arr, ptr-1);
        }
        else{
            return false;
        }
        
    }

    public static int firstOccurance(int arr [],int i,int key){
        if(i>arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, i+1,key);
        
    }

    public static int lastOccurance(int arr[], int key, int i){
        if(i<0){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }

        return lastOccurance(arr,key,i-1);
    }

    public static int xpown(int x, int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        return x*xpown(x,n-1);
    }

    public static int xtothepower(int x, int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }

        if(n%2==0){
            return xtothepower(x,n/2)*xtothepower(x,n/2);
        }
        return x*xtothepower(x,n/2)*xtothepower(x,n/2);

    }

    public static void main (String args[]){
        int n = 5;
        int fact = Factorial(n);
        System.out.println(fact);
        System.out.println(nNaturalNum(n));
        System.out.println(Fibonacci(3));
        int array [] = {6,8,9,10,11,15,18,11,20};
        System.out.println(CheckArray(array,array.length-1));
        System.out.println(firstOccurance(array,0,11));
        System.out.println(lastOccurance(array,11,array.length-1));
        System.out.println(xpown(2,7));
        System.out.println(xtothepower(2,7));
                
    }
}

