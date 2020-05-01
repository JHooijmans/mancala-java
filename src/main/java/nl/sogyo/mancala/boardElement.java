package nl.sogyo.mancala;

public abstract class boardElement {
    /*This class is abstract because its' subclasses Kalaha and Bowl share behaviors
    but implement only some in the same way, and other shared behaviors in in different ways.
    Therefore this allows for the condensation of the shared same behaviors, whilst allowing for
    the shared different behaviors. It cannot be instantiated.
     */
    private int stones;
    private Player owner;
    private boardElement neighbour;
    public Bowl bowl1;

    public Player getOwner() {return this.owner;}

    public int getStones() {return this.stones;} //This might not be needed because stones is protected instead of private
    public void setStones(int newStones) {this.stones = newStones;}

    public static int counter = 0; //counter keeping track of how often constructor has been called

    public boardElement (String name1, String name2) { //constructor for bowl1
        counter++;
        this.stones = 4;
        this.owner = new Player(name1, name2);
        this.neighbour = new Bowl(neighbour, owner, 4);
    }

    public boardElement (boardElement neighbour, Player owner) { //constructor for the Kalaha's
        counter ++;
        if (counter == 14) {
            this.neighbour = bowl1; //bowl1 doesn't exist yet?, because this is still happening within the constructor stack of bowl1..
        }
        else this.neighbour = new Bowl(neighbour, owner.GetOpponent(), 4);
    }

    public boardElement (boardElement neighbour, Player owner, int stones) { //constructor for the other bowls
        counter++;

        if ((counter == 6) || (counter == 13)) {
            this.neighbour = new Kalaha(null, this.owner);
        }
        else  {
            this.neighbour = new Bowl(null, this.owner, 4); //still needs parameters pointing to the right constructor
        }
    }

    public abstract void AddAndPass();
}

