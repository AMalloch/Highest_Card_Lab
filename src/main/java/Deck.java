import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>(52);

    public Deck(){
        this.deck = deck;
    }

    public void fillArray(Card card){
        for(SuitType suit : SuitType.values()) {
            for (ValueType value : ValueType.values()) {
                for (int c = 0; c < 52; c++) {  // c for card
                    this.deck.add(card(suit, value));
                }
            }
        }
    }

    public int countDeck(){
        return this.deck.size();
    }

}
