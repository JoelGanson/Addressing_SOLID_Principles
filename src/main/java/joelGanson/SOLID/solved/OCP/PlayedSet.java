package joelGanson.SOLID.solved.OCP;

import java.util.ArrayList;
import java.util.List;

public class PlayedSet {
    static Boolean isValidSet(List<ICard> cards) {
        List<String> possibleRanks = new ArrayList<String>();
        possibleRanks.add("Ace");
        possibleRanks.add("1");
        possibleRanks.add("2");
        possibleRanks.add("3");
        possibleRanks.add("4");
        possibleRanks.add("5");
        possibleRanks.add("6");
        possibleRanks.add("7");
        possibleRanks.add("8");
        possibleRanks.add("9");
        possibleRanks.add("Jack");
        possibleRanks.add("Queen");
        possibleRanks.add("King");
        for(String rank:possibleRanks) {
            Boolean rankMatch=true;
            for (ICard card:cards) {
                if (!card.matchesRank(rank)) {
                    rankMatch=false;
                }
            }
            if(rankMatch) return true;
        }
        return false;
    }
}
