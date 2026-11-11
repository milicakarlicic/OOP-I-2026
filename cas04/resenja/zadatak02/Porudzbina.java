package cas04.zadatak02;

public class Porudzbina {
    private Kupac kupac;
    private StavkaPorudzbine[] korpa;
    private int brojStavki;

    private static final int KAPACITET = 100;

    public Porudzbina(Kupac kupac) {
        this.kupac = kupac;
        this.brojStavki = 0;
        this.korpa = new StavkaPorudzbine[KAPACITET];
    }

    public boolean dodajStavku(StavkaPorudzbine stavkaPorudzbine) {
        if (brojStavki >= KAPACITET) {
            return false;
        }
        korpa[brojStavki++] = stavkaPorudzbine;
        return true;
    }
}
