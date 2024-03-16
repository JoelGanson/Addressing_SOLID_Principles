package joelGanson.SOLID.solved.ISP;

import java.util.ArrayList;
import java.util.List;

public class PlayerInGameWithJokers implements IPlayerCanAskForCards,IPlayerCanDrawCards,IPlayerCanPlaySet,IPlayerCanAskForJokers {

    List<ICard> hand = new ArrayList<ICard>();

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
        // Todo: Code to ask for jokers
    }
}
