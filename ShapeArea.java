import java.util.Scanner;

abstract class Shape{
    public String name;
    
    abstract double  area();
    public Shape(String name){
        this.name = name;
    }
}

class Circle extends Shape {
    public Circle(){
        super("Circle");

    }

    public double area() {
        float radius;
        System.out.println("ENter the radius ");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();
        double areaofcircle = 3.142*radius*radius;
        return areaofcircle;


    } 
    
}

class Rectangle extends Shape {
    public Rectangle(){
        super("Rectangle");

    }

    public double area() {
        float l,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth : ");

        l = sc.nextFloat();
        b = sc.nextFloat();
        
        double areaofrectangle = l*b;
        return areaofrectangle;
        

    } 
    
}

class Triangle extends Shape {
    public Triangle(){
        super("Triangle");

    }

    public double area() {
        float h,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height and base : ");

        h = sc.nextFloat();
        b = sc.nextFloat();
        
        double areaoftriangle =0.5* h*b;
        return areaoftriangle;
        

    } 
    
}

public class ShapeArea {
    public static void main(String args[]){
        Circle c1 = new Circle();
        System.out.println(c1.area());
        Triangle t1 = new Triangle();
        System.out.println(t1.area());
        Rectangle r1 = new Rectangle();
        System.out.println(r1.area());
    }
}