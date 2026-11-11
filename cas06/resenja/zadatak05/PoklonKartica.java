package cas06.zadatak05;

public class PoklonKartica implements NacinPlacanja {
    private double stanjeNaKartici;

    public PoklonKartica(double stanjeNaKartici) {
        this.stanjeNaKartici = stanjeNaKartici;
    }

    @Override
    public boolean plati(double iznos) {
        if (iznos <= stanjeNaKartici) {
            stanjeNaKartici -= iznos;
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return "PoklonKartica{" +
                "stanjeNaKartici=" + stanjeNaKartici +
                '}';
    }
}
