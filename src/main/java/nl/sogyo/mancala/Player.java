package nl.sogyo.mancala;

public class Player {
    private boolean turn;
    private Player opponent;
    private String name;


    public Player(String name1, String name2) { //creates player 1, sets the name, opponent and it's turn to true
        this.turn = true;
        this.name = name1;
        this.opponent = new Player(name2);
        opponent.opponent = this;
    }

    public Player(String name2){
        this.turn = false;
        this.name = name2;
    }

    public boolean isTurn() {return turn;}
    public void changeTurn(boolean setTurn) {this.turn = setTurn;}

    public Player GetOpponent() {return this.opponent;}
}
