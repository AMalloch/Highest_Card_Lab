import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {
    Hand hand;
    Card card;

    @Before
    public void before(){
        hand = new Hand();
    }

    @Test
    public void addCardToHand(){
        hand.addCard(card);
        assertEquals(1, hand.cardsInHand());
    }
}
