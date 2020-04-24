package nl.sogyo.mancala;

public abstract class boardElement {
    protected int stones;
    protected int owner; //should only be 1 or 2

    public int getOwner() {
        return owner;
    }

    public int getStones() {
        return stones;
    }

    public boardElement() {

    }
}

