public class StringCompress{

    public static String compressString(String str){
        String nstr="";
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length() - 1 &&str.charAt(i)==str.charAt(i+1) ){
                count++;
                i++;
            }
            nstr+=str.charAt(i);
            if(count > 1){
                nstr+=count.toString();
            }
        }

        return nstr;
    }
    public static void main(String args[]){
        String str ="abbbccccdddddd";
        System.out.print(compressString(str));

    }
}