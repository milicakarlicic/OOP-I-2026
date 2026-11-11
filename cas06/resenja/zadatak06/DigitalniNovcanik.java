package cas06.zadatak06;

public class DigitalniNovcanik implements NacinPlacanja {
    private double stanjeUNovcaniku;

    public DigitalniNovcanik(double stanjeUNovcaniku) {
        this.stanjeUNovcaniku = stanjeUNovcaniku;
    }

    @Override
    public boolean plati(double iznos) {
        if (iznos <= stanjeUNovcaniku) {
            stanjeUNovcaniku -= iznos;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "DigitalniNovcanik{" +
                "stanjeUNovcaniku=" + stanjeUNovcaniku +
                '}';
    }
}
