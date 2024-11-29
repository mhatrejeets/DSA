    public class RemoveDuplicatesApnaCLgRecursion{
        public static void uniqueStr (String str, StringBuilder sb , int index, boolean map[]){
            if(index == str.length()){
                System.out.println("The new string is : " + sb);
                return;
            }
            char currChar = str.charAt(index);
            if(map[currChar - 'a'] == true ){
                uniqueStr(str,sb,index+1,map);
            }
            else{
               sb.append(currChar);
               map[currChar - 'a'] = true;
               uniqueStr(str,sb,index+1,map);
            }

        }
        public static void main(String args []){
            System.out.println("\nEnter the string : ");
            String str = "jeetsmhatre";
            boolean map [] = new boolean [26];
           
            StringBuilder sb = new StringBuilder("");
            int index = 0;
            uniqueStr(str,sb,index,map);
            

        }
    }