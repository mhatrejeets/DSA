public class String1{
    public static boolean checkPalindrome(String str){
        for(int i=0, j=str.length()-1;i != str.length()/2;i++,j--){
            if(str.charAt(i)!= str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "level1";
        if(checkPalindrome(str)==true){
            System.out.println("Is Palindrime");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}