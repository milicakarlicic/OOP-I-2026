package cas06.zadatak03;

public class PlacanjeKarticom implements NacinPlacanja {
    private double stanjeNaKartici;

    public PlacanjeKarticom(double stanjeNaKartici) {
        this.stanjeNaKartici = stanjeNaKartici;
    }

    public double getStanjeNaKartici() {
        return stanjeNaKartici;
    }

    @Override
    public boolean plati(double iznos) {
        if (iznos <= stanjeNaKartici) {
            stanjeNaKartici -= iznos;
            return true;
        }
        return false;
    }
}
