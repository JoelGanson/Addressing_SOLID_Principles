package joelGanson.SOLID.violated.ISP;

import joelGanson.SOLID.solved.OCP.ICard;

public class Joker implements ICard {

    @Override
    public Boolean matchesRank(String rank) {
        return true;
    }
}
