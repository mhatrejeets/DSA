 class Car {
    public String name;
    public String model;
    public String color;

    public Car(){
        name = "Ferarri";
        model = "A1";
        color = "Black";
    }

    public Car(String cname){
        name = cname;
        model = "B1";
        color = "Blue";
    }

    public Car(String cname, String cmodel){
        name = cname;
        model = cmodel;
        color = "White";
    }

    public void printdata (){
        System.out.println("Name : " + name);
        System.out.println("model : " + model);
        System.out.println("color : "+ color);
        System.out.println();
    }

}

public class MyCar{
    public static void main(String args []){
        Car c1 = new Car() ;
        Car c2= new Car("Bugati");
        Car c3  = new Car("Audi", "D1");
        c1.printdata();
        c2.printdata();
        c3.printdata();


    }
}