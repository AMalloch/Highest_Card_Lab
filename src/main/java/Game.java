import java.awt.print.Book;
import java.util.ArrayList;

public class Game {
    private String name;
    private ArrayList<Deck> player1;
    private ArrayList<Deck> player2;

    public Game(String name) {
        this.name = name;
        this.player1 = new ArrayList<Deck>();
        this.player2 = new ArrayList<Deck>();
    }
}
