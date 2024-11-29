public class StirngShortestPath{
    public static double getShortestPath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y+=1;
            }
            else if(str.charAt(i)=='W'){
                x-=1;
            }
            else if(str.charAt(i)=='E'){
                x+=1;
            }
            else if(str.charAt(i)=='S'){
                y-=1;
            }
        }
        double shortestpath = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return shortestpath;
    }
    public static void main(String args[]){
        String str = "WNEENESENNN";
        
        System.out.println("Shortest path is : "+ getShortestPath(str));
        

    }
}