package cas04.zadatak03;

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

    public double ukupnaCena() {
        double cena = 0;

        for (int i = 0; i < brojStavki; i++) {
            cena += korpa[i].cena();
        }

        return cena;
    }

    public String opis() {
        StringBuilder s = new StringBuilder();

        s.append("Kupac: ").append(kupac.opis());
        s.append("\nKorpa:");
        for (int i = 0; i < brojStavki; i++) {
            s.append("\n    ").append(korpa[i].opis());
        }

        return s.toString();
    }
}
