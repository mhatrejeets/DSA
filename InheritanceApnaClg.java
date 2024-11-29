class Animal {
    private String color;
    private String type;

    public void eats(){
        System.out.println("\nAll animals can eat.");
    }

    public void move(){
        System.out.println("\nAll animals can move.");
    }

    public Animal(String color,String type){
    this.color = color;
    this.type = type;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void disp1(){
        System.out.println("Animal class " + color);
    }
}

class Bird extends Animal{
    private String name;
    public void fly() {
        System.out.println("Birds can fly");
    }
    Bird(String color,String type, String name){
        super(color,type);
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }    
    public void disp2(){
        System.out.println("Bird class " + name);
    }
    
}

class Parrot1 extends Bird{
    int legs;
    public Parrot1(String color,String type, String name,int legs){
        super(color, type, name);
        this.legs = legs;
    }
    public void disp3(){
        System.out.println("Parrot class " + legs);
    }
}



public class InheritanceApnaClg{
    public static void main (String args[]){
        Bird b1 = new Bird("Green","Bird","Parrot");
        b1.eats();
        b1.move();
        b1.fly();
        System.out.println("The color before is : " + b1.getColor());
        System.out.println("The  before is : " + b1.getName());
        b1.setColor("Brown");
        b1.setName("Monkey");
        System.out.println("The color after is : " + b1.getColor());
        System.out.println("The  after is : " + b1.getName());
        Parrot1 p1 = new Parrot1 ("Red","Good","Paaaaaroooot", 2);
        p1.eats();
        p1.move();
        p1.fly();
        p1.disp1();
        p1.disp2();
        p1.disp3();
    }
}

