package cas05.zadatak06;

public class RezervacijaPrevoza {
    private Putnik putnik;
    private Relacija relacija;
    private Prevoz prevoz;

    public RezervacijaPrevoza(Putnik putnik, Relacija relacija, Prevoz prevoz) {
        this.putnik = putnik;
        this.relacija = relacija;
        this.prevoz = prevoz;
    }

    public int cenaRezervacije() {
        return prevoz.izracunajCenu(relacija.udaljenost());
    }

    public String opis() {
        return putnik.opis() + "\n" +
                relacija.opis() + "\n" +
                prevoz.opis() + "\n" +
                "Cena rezervacije: " + cenaRezervacije();
    }
}
