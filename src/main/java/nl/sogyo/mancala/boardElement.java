package nl.sogyo.mancala;

public abstract class boardElement {
    /*This class is abstract because its' subclasses Kalaha and Bowl share behaviors
    but implement only some in the same way, and other shared behaviors in in different ways.
    Therefore this allows for the condensation of the shared same behaviors, whilst allowing for
    the shared different behaviors. It cannot be instantiated.
     */
    protected int stones;
    protected int owner; //should only be 1 or 2

    public int getOwner() {
        return this.owner;
    }

    public int getStones() {return this.stones;} //This might not be needed because stones is protected instead of private
    public void setStones(int newStones) {this.stones = newStones;}

    //private boardElement neighbour; //Apparently this doesn't need to be in the class..
    private int place;
    public boardElement[] gameBoard = new boardElement[14];
    //initialize an array containing all the boardelements to be filled in the constructor

    public boardElement(boardElement neighbour) {

        if (this.place == 13) {this.neighbour = gameBoard[0];}
        else {this.neighbour = gameBoard[this.place+1];}

//        this.neighbour = new Kalaha(null,0,0,0);
        /*does this work? Declaring the variable neighbour within an object to create a new object
        which is the neighbour(through the for loop below perhaps?)
        This part of the constructor is meant to set the neighbour variable of the objects, but also instantiate
        the next object (which is the neighbour of the current object) in one step.*/

    }

    public boardElement(boardElement neighbour, int owner) {
        this(null);

        for (int i=0; i<14; i++) {
            if (i <= 6) {this.owner = 1;}
            else {this.owner = 2;} //this is meant to set the owner of the objects, first 7 to owner 1, last 7 to 2
        }
    }

    public boardElement(boardElement neighbour, int owner, int stones, int place) {
        this(null,0);

        //Fill the boardElement array with bowl or kalaha objects according to position
        for (int i=0; i<14; i++) {
            if ((i == 6) || (i == 13)) {gameBoard[i] = new Kalaha(null,1,0,i);}
//            else if (i==13) {gameBoard[i] = new Kalaha();}
            else {gameBoard[i] = new Bowl(null,1,4,i);}

        }
    }
}

