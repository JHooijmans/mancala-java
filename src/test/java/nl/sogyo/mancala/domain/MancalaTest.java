package nl.sogyo.mancala.domain;

import nl.sogyo.mancala.Bowl;
import nl.sogyo.mancala.boardElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MancalaTest {

    private Bowl bowl1;

    @Before
    public void setUp() {
        bowl1 = new Bowl("name1", "name2");
    }

    @After
    public void tearDown() {
        bowl1 = null;
    }

    @Test
    public void testInitialisationValues() { //These tests should be split into separate test methods
        Assert.assertEquals("Bowl should start with 4 stones`", 4, bowl1.getStones());
        Assert.assertEquals("Kalaha should start with 0 stones`", 0, bowl1.getNeighbour().getNeighbour().getNeighbour().getNeighbour().getNeighbour().getNeighbour().getStones());
        Assert.assertNotSame("bowl1 has the same owner as bowl8", bowl1.getOwner(), bowl1.getNeighbour().getNeighbour().getNeighbour().getNeighbour().getNeighbour().getNeighbour().getNeighbour().getOwner());
    }

    @Test
    public void testEmptyAndPass() {
        bowl1.EmptyAndPass();
        Assert.assertEquals("Bowl should be emptied but still contains stones", 0, bowl1.getStones());
        Assert.assertEquals("stones should have increased by one", 5, bowl1.getNeighbour().getStones());
    }

    @Test
    public void testPlayerChangeIfRoundEndsInBowl() {
        bowl1.EmptyAndPass();
        Assert.assertFalse("Player turn should change if distributing stones ends in a bowl", bowl1.getOwner().IsTurn());
    }

    @Test
    public void testPlayerTurnAgainIfRoundEndsInKalaha() {
        bowl1.getNeighbour().getNeighbour().EmptyAndPass();
        Assert.assertTrue("Bowl should be emptied but still contains stones", bowl1.getOwner().IsTurn());
    }


}

