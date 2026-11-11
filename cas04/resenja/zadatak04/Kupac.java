package cas04.zadatak04;

public class Kupac {
    private final String ime;
    private Adresa adresa;

    public Kupac(String ime, Adresa adresa) {
        this.ime = ime;
        this.adresa = adresa;
    }

    public void promeniAdresu(Adresa adresa) {
        this.adresa = adresa;
    }

    public String opis() {
        return ime + ", adresa: " + adresa.opis();
    }
}
