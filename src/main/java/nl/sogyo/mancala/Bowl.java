package nl.sogyo.mancala;

public class Bowl extends boardElement {

    public Bowl (String name1, String name2) {
        counter++;
        this.stones = 4;
        this.owner = new Player(name1, name2);
        this.neighbour = new Bowl(owner);
    }

    public Bowl(Player owner) {
        counter++;
        this.stones = 4;
        this.owner = owner;
        if ((counter == 6) || (counter == 13)) {
            this.neighbour = new Kalaha(this.owner);
        }
        else  {
            this.neighbour = new Bowl(this.owner);
        }
    }

//    public void MakeMove() {
//
//    }

    public void AddAndPass(int counter) {
        if (counter > 0) {
            counter--;
            this.stones++;
            this.neighbour.AddAndPass(counter);
        }
        else {System.out.println("change turn now Bowl");
            owner.ChangeTurn(false);}
    }

    public void EmptyAndPass() {
        int counter = this.stones;
        this.stones = 0;
        this.neighbour.AddAndPass(counter);
    }

    public void EmptyOpposite() {

    }

    public void CheckAndPass() {

    }

    public void GetOpposite() {

    }
}