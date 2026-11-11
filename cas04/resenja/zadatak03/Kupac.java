package cas04.zadatak03;

public class Kupac {
    private final String ime;
    private final String prezime;

    public Kupac(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String opis() {
        return ime + " " + prezime;
    }
}
