package joelGanson.SOLID.solved.ISP;

import java.util.ArrayList;
import java.util.List;

public class PlayerInGameWithoutJokers implements IPlayerCanAskForCards,IPlayerCanDrawCards,IPlayerCanPlaySet {
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
}
