package cas05.zadatak06;

public class Putnik {
    private String ime;

    public Putnik(String ime) {
        this.ime = ime;
    }

    public String opis() {
        return "Putnik: " + ime;
    }
}
