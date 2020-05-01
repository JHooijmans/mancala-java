package nl.sogyo.mancala;

public class Bowl extends boardElement {

    public Bowl(String name1, String name2) {
        super(name1, name2);
        //Calling the overarching constructor in the abstract parent class boardElement
    }

    public Bowl(boardElement neighbour, Player owner, int stones) {
        super(neighbour, owner, stones);
    }

    public void AddAndPass() {

    }

    public void EmptyAndPass() {

    }

    public void EmptyOpposite() {

    }

    public void CheckAndPass() {

    }

    public void GetOpposite() {

    }
}