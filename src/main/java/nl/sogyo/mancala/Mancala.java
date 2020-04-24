package nl.sogyo.mancala;

public class Mancala {

    public Mancala {
        boardElement[] gameBoard = new boardElement[14]; //initialize an array containing all the boardelements and fill them with bowl or kalaha objects according to position
        for (int i=0; i<14; i++) {
            if ((i == 6) || (i == 13)) {gameBoard[i] = new Kalaha();}
//            else if (i==13) {gameBoard[i] = new Kalaha();}
            else {gameBoard[i] = new Bowl();}
        }
    }
}
