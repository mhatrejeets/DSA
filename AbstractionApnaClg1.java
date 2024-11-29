public class AbstractionApnaClg1{
    public static void main(String args[]){
        Queen q1 = new Queen();
        q1.moves();

        Rook r1 = new Rook();
        r1.moves();

        Bishop b1 = new Bishop();
        b1.moves();
        

    }
}

interface ChessPices{
    void moves();    
}

class Queen implements ChessPices{
    public void moves(){
        System.out.println("Up Down Right Left  Diagonal in any dir");
    }
}

class Rook implements ChessPices{
    public void moves(){
        System.out.println("Up Down Right Left in any dir");
    }
}

class Bishop implements ChessPices{
    public void moves(){
        System.out.println("Diagonal in and dir");
    }
}