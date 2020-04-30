package nl.sogyo.mancala;

public class Kalaha extends boardElement {

    public Kalaha(boardElement neighbour, Player owner, int stones, int place) {
        super(neighbour, owner, stones, place);
        //Calling the overarching constructor in the abstract parent class boardElement
    }


//Player.isTurn(); //needs to get turn true or false from the player class
}