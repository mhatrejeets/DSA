
abstract class Animal2{
    public String color;
    abstract void walk();
    public Animal2(String color){
        this.color = color;
    }

}

class Horse extends Animal2{
    public  Horse(){
        super("Brown");
    }
    void walk(){
        System.out.println("Horse walks on 2 legs.");
    }
}

public class AbstractionApnaClg{
    public static void main(String args[]){
        Horse h1 = new Horse();
        System.out.println(h1.color);
        h1.walk();
    }
}