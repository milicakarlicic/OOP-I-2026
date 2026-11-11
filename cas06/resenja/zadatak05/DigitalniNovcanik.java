package cas06.zadatak05;

public class DigitalniNovcanik implements NacinPlacanja, Dopunjiv {
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
    public boolean dopuna(double iznos) {
        if (stanjeUNovcaniku <= Double.MAX_VALUE - iznos) {
            stanjeUNovcaniku += iznos;
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
