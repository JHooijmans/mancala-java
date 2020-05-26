package nl.sogyo.mancala;

public class Player {
    private boolean turn;
    private Player opponent;
    private String name;


    public Player(String name1, String name2) {
        this.turn = true;
        this.name = name1;
        this.opponent = new Player(name2);
        opponent.opponent = this;
    }

    public Player(String name2){
        this.turn = false;
        this.name = name2;
    }

    public boolean IsTurn() {return turn;}
    public void ChangeTurn(boolean setTurn) {
        this.turn = setTurn;
        this.opponent.turn = !setTurn;
    }

    public Player GetOpponent() {return this.opponent;}
}
