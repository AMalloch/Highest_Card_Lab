import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {
    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void countDeck(){
        deck.createDeck();
        assertEquals(52, deck.countDeck());
    }

    @Test
    public void deal(){
        deck.createDeck();
        deck.deal(0);
        assertEquals(51, deck.countDeck());
    }

    @Test
    public void canGetRandomCard(){
        deck.createDeck();
        ArrayList results = deck.getCard();
        Card randomCard = deck.shuffleDeck();
        assertTrue(results.contains(randomCard));
    }

}
