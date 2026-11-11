package cas04.zadatak01;

public class Kupac {
    // HAS-A
    private String ime;
    private String prezime;
    private Adresa adresa;

    public Kupac(String ime, String prezime, Adresa adresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
    }

    public String opis() {
        return ime + " " + prezime + ", adresa: " + adresa.opis();
    }
}
