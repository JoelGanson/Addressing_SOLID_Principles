package joelGanson.SOLID.solved.SRP;

import java.util.Collections;
import java.util.List;

public class DeckShuffler {
    static public void shuffleDeck(DeckOfCards deck) {
        List<PlayingCard> cardsInDeck = deck.getCardsInDeck();
        Collections.shuffle(cardsInDeck);
        deck.setCardsInDeck(cardsInDeck);
    }
}
