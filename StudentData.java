import java.util.*;
class StudentDetails{
    private String name;
    private String city;
    private int age;

    public StudentDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nENter the name of student : ");
        this.name = sc.next();
        System.out.print("\nENter the city of student : ");
        this.city = sc.next();
        System.out.print("\nENter the age of student : ");
        this.age = sc.nextInt();
    
    }

    public void printData(){
        System.out.print("\nTHe name of student is : "+ name);
        System.out.print("\nTHe city of student is : "+ city);
        System.out.print("\nTHe age of student is : "+ age);
    }
}

public class StudentData{
    public static void main(String args[]){
        System.out.println("Enter the details for First student : ");
        StudentDetails s1 = new StudentDetails();
        System.out.println("Enter the details for Second student : ");
        StudentDetails s2 = new StudentDetails();
        System.out.println("\n\nThe details for First student : ");
        s1.printData();
        System.out.println("\n\nThe details for Second student : ");
        s2.printData();
    


    }
}

