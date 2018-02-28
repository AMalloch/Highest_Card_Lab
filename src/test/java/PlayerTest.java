import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    Hand hand;

    @Before
    public void before(){
        player = new Player("Gus");
    }

    @Test
    public void addHandToPlayer(){
        player.addHand(hand);
        assertEquals(1, player.hasHand());
    }
}
