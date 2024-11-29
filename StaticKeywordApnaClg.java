public class StaticKeywordApnaClg{
    public static void main(String args []){
        AB a1 = new AB();
        AB a2 = new AB();
        a1.incr();
        a2.incr();
        a1.incr();
        a2.incr();
        a1.incr();
        a2.incr();
        
    }
}

class AB {
    static int i;
    void incr(){
        i++;
        System.out.println(i);
    }
}