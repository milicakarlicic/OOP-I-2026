package cas06.zadatak02;

public class PlacanjeGotovinom implements NacinPlacanja {
    private double stanjeUNovcaniku;

    public PlacanjeGotovinom(double stanjeUNovcaniku) {
        this.stanjeUNovcaniku = stanjeUNovcaniku;
    }

    public double getStanjeUNovcaniku() {
        return stanjeUNovcaniku;
    }

    @Override
    public boolean plati(double iznos) {
        if (iznos <= stanjeUNovcaniku) {
            stanjeUNovcaniku -= iznos;
            return true;
        }
        return false;
    }
}
