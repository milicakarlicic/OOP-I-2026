package cas04.zadatak02;

public class StavkaPorudzbine {
    private Proizvod proizvod;
    private int kolicina;

    public StavkaPorudzbine(Proizvod proizvod, int kolicina) {
        this.proizvod = proizvod;
        this.kolicina = kolicina;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public int getKolicina() {
        return kolicina;
    }

    public double cena() {
        return kolicina * proizvod.getCena();
    }

    public String opis() {
        return proizvod.opis() + " x " + kolicina;
    }
}
