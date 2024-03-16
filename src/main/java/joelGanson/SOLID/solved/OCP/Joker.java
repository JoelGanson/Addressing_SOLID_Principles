package joelGanson.SOLID.solved.OCP;

public class Joker implements ICard{

    @Override
    public Boolean matchesRank(String rank) {
        return true;
    }
}
