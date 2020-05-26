package nl.sogyo.mancala;

public abstract class boardElement {

    protected int stones;
    protected Player owner;
    protected boardElement neighbour;
    public Bowl bowl1;
    protected static int counter = 0;

    protected boardElement() {}

    public Player getOwner() {return this.owner;}

    public int getStones() {return this.stones;} //This might not be needed because stones is protected instead of private

    public boardElement getNeighbour() {
        return neighbour;
    }

    public abstract void AddAndPass(int counter);

    public abstract void EmptyAndPass();
}

