class Student1{
    public String name;
    public int roll_no;

    public void setdata (String studentname, int roll){
        name = studentname;
        roll_no = roll;
    }

    public void printdata (){
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll_no);
    }
}

public class STUDENT{
    public static void main(String args[]){
        
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

        s1.setdata("Jeet",1056);
        s2.setdata("Ketan",1057);

        s1.printdata();
        s2.printdata();
    }`

}