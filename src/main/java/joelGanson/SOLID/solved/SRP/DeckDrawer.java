package joelGanson.SOLID.solved.SRP;

import java.util.Collections;
import java.util.List;

public class DeckDrawer {
    public static PlayingCard drawCard(DeckOfCards deck) {
        List<PlayingCard> cardsInDeck = deck.getCardsInDeck();
        PlayingCard drawnCard = cardsInDeck.get(0);
        cardsInDeck.remove(0);
        deck.setCardsInDeck(cardsInDeck);
        return drawnCard;
    }
}
