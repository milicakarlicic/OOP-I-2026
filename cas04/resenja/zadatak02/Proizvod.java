package cas04.zadatak02;

public class Proizvod {
    private final String naziv;
    private double cena;

    public Proizvod(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }

    public String opis() {
        return naziv + " " + cena + " RSD";
    }
}
