package nl.sogyo.mancala.domain;

import nl.sogyo.mancala.Bowl;
import nl.sogyo.mancala.boardElement;
import org.junit.Assert;
import org.junit.Test;

public class MancalaTest {

    @Test
    public void testApp()
    {
        Assert.assertTrue(true);
    }

    @Test
    public void testInitialization() {
        boardElement bowl1 = new Bowl("name1", "name2");
        Assert.assertEquals("Bowlstartswith4stones", 4, bowl1.getStones());

    }
}

