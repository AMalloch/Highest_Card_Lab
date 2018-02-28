import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void countDeck(){
        deck.fillArray(card);
        assertEquals(52, deck.countDeck());
    }

}
