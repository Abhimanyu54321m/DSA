package company.Java;

public class Interfaces {
    public static void main(String[] args) {
      Queen q = new Queen();
      q.moves();
    }
}

interface Herbivore {

}

interface Carnivore {

}

class Bear implements Herbivore, Carnivore {

}
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, right, left, diagonal (in all 4 direction)");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, right, left");
    }
}

class King implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, right, left, diagonal (in all 4 direction)");
    }
}