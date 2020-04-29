package nl.sogyo.mancala;

public class Player {
    private boolean turn;
    private Player opponent; //is this a variable? if so, it probably shouldn't be an int?
    private String name;

    public Player() {
        this.turn = false;

    }

    public boolean isTurn() {return turn;}
}
