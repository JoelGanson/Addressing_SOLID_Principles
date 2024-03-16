package joelGanson.SOLID.violated.ISP;

import java.util.ArrayList;
import java.util.List;

public class PlayerInGameWithoutJokers implements IPlayer{
    List<PlayingCard> hand = new ArrayList<PlayingCard>();

    @Override
    public void askForCards() {
        // TODO: Code for asking for cards
    }

    @Override
    public void playSet() {
        // TODO: Code for playing a set
    }

    @Override
    public void drawCardFromDeck() {
        // TODO: Code for drawing a card from the deck
    }

    @Override
    public void askForJokers() {
        throw new UnsupportedOperationException("PlayerInGameWithoutJokers does not support Jokers");
    }
}
