package nl.sogyo.mancala;

public class Kalaha extends boardElement {

    public Kalaha(Player owner) {
        counter ++;
        this.owner = owner;
        if (counter == 14) {
            this.neighbour = bowl1;
        }
        else this.neighbour = new Bowl(owner.GetOpponent());
    }

    public void AddAndPass(int counter) {
        if (counter > 0) {
            counter = counter - 1;
            this.stones = this.stones + 1;
            this.neighbour.AddAndPass(counter);
        }
        else {System.out.println("change turn now Kalaha");
            owner.ChangeTurn(true);}
    }

    public void EmptyAndPass() {
        System.out.println("Invalid move, cannot start a turn on a Kalaha");
    }

}