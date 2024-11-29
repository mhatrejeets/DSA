public class FindSubsetsUsingBacktracking{

    public static void findSubstrings(String str , String subString, int index){
        //base case
        if(index==str.length()){
            if(subString.length()==0){
                System.out.println("null");
                return;
                
            }
            else{
                System.out.println(subString);
                return;
            }
            
        }
        
        //recursion
        //Yes
        findSubstrings(str, subString + str.charAt(index), index+1);
        //No
        findSubstrings(str, subString, index+1);
        
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubstrings(str, "", 0);

    }
}