package joelGanson.SOLID.solved.ISP;

import joelGanson.SOLID.solved.OCP.ICard;

public class Joker implements ICard {

    @Override
    public Boolean matchesRank(String rank) {
        return true;
    }
}
