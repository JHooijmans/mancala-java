package nl.sogyo.mancala;

public class Mancala {

    public static void main (String[] args) {


        Player Player1 = new Player();
        Player Player2 = new Player();
        boardElement bowl1 = new Bowl(null, Player1, 0, 0);
    /*By labeling the new Bowl object as a boardElement, it can be called in conjunction with all
    Kalaha's by calling boardElement boardelement! This way, you still have the generality of lumping them
    under one umbrella and calling both bowls and kalaha's in one go/method.*/

    }
}
