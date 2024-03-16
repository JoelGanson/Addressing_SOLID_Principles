package joelGanson.SOLID.violated.OCP;

import java.util.List;

public class PlayedSet{


    static public Boolean isValidSet(List<Card> cards) {
        String rank ="";
        for(Card card:cards) {
            if (card instanceof PlayingCard) {
                if (rank.isEmpty()) {
                    rank = ((PlayingCard) card).getRank();
                }
                else if (!rank.equals(((PlayingCard) card).getRank())) {
                    return false;
                }
            }
            if (card instanceof Joker) {
                // no need to do anything
            }
        }
        return true;
    }
}
