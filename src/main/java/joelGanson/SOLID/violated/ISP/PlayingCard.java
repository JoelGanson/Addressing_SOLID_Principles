package joelGanson.SOLID.violated.ISP;

public class PlayingCard implements ICard {
    private String suit;
    private String rank;

    public PlayingCard(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public Boolean matchesRank(String rank) {
        if (this.rank.equals(rank)) {
            return true;
        }
        return false;
    }
}
