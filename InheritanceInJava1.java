import java.util.*;
class Vehicle{
    private String regNo;
    private String color;
    private String vType;

    public Vehicle(String regNo, String color, String vType){
        this.regNo = regNo;
        this.color = color;
        this.vType = vType;

    }

    public String getregNo(){
        return regNo;
    }

    public String getcolor(){
        return color;
    }

    public String getvType(){
        return vType;
    }

    public void display(){
        System.out.print("\nRegistration number  : "+ regNo+"\nColor : "+ color +"\nVehicle Type : "+vType);
    }
}

class Car extends Vehicle {
    private String company;

    public Car(String regNo, String color, String vType, String company){
        super( regNo,  color, vType);
        this.company = company;
    }

    public String getcompany(){
        return company;
    }

    public void displayCompany(){
        System.out.print("\nCompany : "+ company);
    }


}

class Truck extends Vehicle{
    private String cc;

    public Truck (String regNo , String color , String vType , String cc){
        super (regNo,color,vType);
        this.cc = cc;
    }

    public String getcc (){
        return cc;
    }

    public void displaycc(){
        System.out.print("\nCC : "+ cc);
    }
}

class Motorcycle extends Vehicle{
    private String fuelType;
    public Motorcycle (String regNo , String color , String vType , String fuelType){
        super (regNo,color,vType);
        this.fuelType= fuelType;
    }

    public  String getfuelType(){
        return fuelType;
    }

    public void displayFuelType(){
        System.out.print("\nFuel Type : " + fuelType);
    }
}

public class InheritanceInJava1{
    public static String inputatr(){
        System.out.println("Enter the attribute : ");
        Scanner scr = new Scanner(System.in);
        String atr= scr.next();
        return atr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice =0;
        do{
        System.out.println("\n\n\nENter 1: For Car\n2: For Truck\n3: For Motorcycle.\n4:Exit");
        System.out.print("\nEnter the choice : ");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("\nFor car enter 1.Reg no 2.color 3.Vehicle type 4. company");
                Car c1 = new Car(inputatr(),inputatr(),inputatr(),inputatr());
                c1.display();
                c1.displayCompany();
                break;

            case 2:
                System.out.println("\nFor Truck enter 1.Reg no 2.color 3.Vehicle type 4. cc");
                Truck t1 = new Truck(inputatr(),inputatr(),inputatr(),inputatr());
                t1.display();
                t1.displaycc();
                break;

            case 3:
                System.out.println("\nFor car enter 1.Reg no 2.color 3.Vehicle type 4. company");
                Motorcycle m1 = new Motorcycle(inputatr(),inputatr(),inputatr(),inputatr());
                m1.display();
                m1.displayFuelType();
                break;

            default:
                System.out.println("\nInvalid Entry.");

        }
        }while(choice !=4);
        System.out.println("\nThank You.");
        sc.close();
        
        

    }
}