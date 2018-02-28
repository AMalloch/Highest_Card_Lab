import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public void createDeck(){
        for(SuitType suit : SuitType.values()) {
            for (ValueType value : ValueType.values()){
                Card card = new Card(suit, value);
                this.cards.add(card);
            }
        }
    }

    public int countDeck(){
        return this.cards.size();
    }

    public Card deal(int card){
        return this.cards.remove(card);
    }

    public Card shuffleDeck() {
        Collections.shuffle(cards);
        return cards.get(0);
    }

    public ArrayList<Card> getCard(){
        return new ArrayList<>(this.cards);
    }


}
