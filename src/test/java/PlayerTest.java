import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    Hand hand;
    Card card;

    @Before
    public void before(){
        player = new Player("Gus");
    }

    @Test
    public void addCardToPlayer(){
        player.addCard(hand, card);
        assertEquals(1, player.hasHand());
    }
}
