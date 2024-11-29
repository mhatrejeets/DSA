 class Animal1 {
    public static String color;
    public static String type;

    public void eats(){
        System.out.println("\nAll animals can eat.");
    }

    public void move(){
        System.out.println("\nAll animals can move.");
    }

    
}

class Bird1 extends Animal1{
    public String name;
    public void fly() {
        System.out.println("Birds can fly");
    }

    public void eats(){
        super.eats();
        System.out.println("Birds eats worms");
    }
    

    
    
}

class Fish extends Animal1{
    public String name;
    public String category;

    public void swim(){
        System.out.println("Fish can swim");
    }
}

class Paplet extends Fish {
    public String isGood;
    public void disp(){
        System.out.println("Yesssss");
    }
}




public class InheritanceApnaClg2{
    public static void main (String args[]){
        Bird1 b1 = new Bird1();
        b1.eats();
        b1.move();
        b1.fly();
        b1.color = "White";
        b1.name = "Panda";
        System.out.println("The color before is : " + b1.color);
        System.out.println("The  before is : " + b1.name);
        b1.color="Brown";
        b1.name="Monkey";
        System.out.println("The color after is : " + b1.color);
        System.out.println("The  after is : " + b1.name);
        Fish f1 = new Fish();
        System.out.println("Fname " + f1.name );
        System.out.println("Type "+ f1.category);
        System.out.println("Fname " + f1.color );
        
        f1.name = "tuna";
        f1.category = "BOny";
        System.out.println("Fname " + f1.name );
        System.out.println("Type "+ f1.category);

        Paplet p1 = new Paplet();
        p1.color = "Silver";
        b1.name = "Paplet";
        System.out.println("The color before is : " + p1.color);
        System.out.println("The  before is : " + p1.name);
        System.out.println("Fname " + p1.name );
        System.out.println("Type "+ p1.category);
        System.out.println("Fname " + p1.color );
        p1.isGood= "Good";
        System.out.println("is Good " + p1.isGood );
        p1.eats();
        p1.disp();
        p1.swim();

        b1.eats();

    }
}

