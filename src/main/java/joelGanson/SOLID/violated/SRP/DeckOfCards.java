package joelGanson.SOLID.violated.SRP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private List<PlayingCard> cardsInDeck = new ArrayList<PlayingCard>();

    public DeckOfCards(List<PlayingCard> cardsInDeck) {
        this.cardsInDeck = cardsInDeck;
    }

    public DeckOfCards() {
        List<String> suits = new ArrayList<String>();
        suits.add("Clubs");
        suits.add("Diamonds");
        suits.add("Hearts");
        suits.add("Spades");
        List<String> ranks = new ArrayList<String>();
        ranks.add("Ace");
        ranks.add("1");
        ranks.add("2");
        ranks.add("3");
        ranks.add("4");
        ranks.add("5");
        ranks.add("6");
        ranks.add("7");
        ranks.add("8");
        ranks.add("9");
        ranks.add("Jack");
        ranks.add("Queen");
        ranks.add("King");
        for (String rank:
             ranks) {
            for (String suit:suits) {
                cardsInDeck.add(new PlayingCard(suit,rank));
            }
        }
    }

    public List<PlayingCard> getCardsInDeck() {
        return cardsInDeck;
    }

    public void setCardsInDeck(List<PlayingCard> cardsInDeck) {
        this.cardsInDeck = cardsInDeck;
    }

    public void shuffleDeck() {
        Collections.shuffle(cardsInDeck);
    }

    public PlayingCard drawCard() {
        PlayingCard card = cardsInDeck.get(0);
        cardsInDeck.remove(0);
        return card;
    }
}
