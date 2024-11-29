public class Bitwise2{

    public static int getithbit(int num,int i){
        int bitmask = 1<<i;
        int ithbit;
        if((num & bitmask) == 0){
            ithbit = 0;
        }
        else{
            ithbit = 1;
        }
        return ithbit;
    }

    public static int setithbit(int num,int i){
        int bitmask = 1<<i;
        return num|bitmask;
    }

    public static int clearbit(int num,int i){
        int bitmask = 1<<i;
        int notbitmask = ~(bitmask);
        return num & notbitmask;
    }

    public static int updateithbit(int num, int i, int newBit){
        if(newBit == 0){
            return clearbit(num,i);
        }
        else{
            return setithbit(num,i);
        }
    }
    public static void main(String args[]){
        int i=1;
        
        int num=10;
        //
        System.out.println("The "+i+"th bit will be : "+ getithbit(num,i));
        System.out.println("The setted ith bit num  is "+ setithbit(num,i));
        System.out.println("The cleared ith bit num  is "+ clearbit(num,i));
        System.out.println("The updated bit num is "+ updateithbit(num,i,1));
    }

    
}