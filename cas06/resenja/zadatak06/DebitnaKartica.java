package cas06.zadatak06;

public class DebitnaKartica extends PlatnaKartica implements NacinPlacanja {
    private double stanjeNaKartici;

    public DebitnaKartica(String vlasnik, int poslednjeCetiriCifre, double stanjeNaKartici) {
        super(vlasnik, poslednjeCetiriCifre);
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
        return "DebitnaKartica{" +
                "stanjeNaKartici=" + stanjeNaKartici +
                '}';
    }
}
