import java.util.*;
class Student2{
    public String name;
    public int age;
    public Sting city;
    Scanner sc = new Scanner(System.in);


    public Student2 (){
        System.out.print("\nEnter your name : ");
        name = sc.next();
        System.out.print("\nEnter your age : ");
        age = sc.nextInt();
        System.out.print("\nEnter your city : ");
        city = sc.next();
    }

    
    public void printdata (){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("City : " + city);
    }
}

public class STUDENT{
    public static void main(String args[]){
        
        Student1 s1 = new Student2();
        Student1 s2 = new Student2();

        

        s1.printdata();
        s2.printdata();
    }

}