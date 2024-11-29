class Blank {
    public String name;
    public String surname;
    public Blank(String name){
        this.name=name;
    }
        public Blank(String name, String surname){
            this.name=name;
            this.surname=surname;
    }
    public void printa()
    {
        System.out.println(name+"" + surname);
    }
}
public class Test {
    public static void main(String[] args) {
        Blank b=new Blank("Anshita","Nair");
        b.printa();
    }

    }