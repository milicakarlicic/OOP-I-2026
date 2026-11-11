package cas04.zadatak04;

public class Porudzbina {
    private Adresa adresa;

    public Porudzbina(Adresa adresa) {
        this.adresa = adresa;
    }

    public String opis() {
        return "Porudzbina za adresu: " + adresa.opis();
    }
}
