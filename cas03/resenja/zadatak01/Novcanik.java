package cas03.zadatak01;

public class Novcanik {
    public String vlasnik;
    public int stanje;

    // konstruktor
    public Novcanik(String vlasnik, int stanje) {
        // this - referenca na tekuci objekat
        this.vlasnik = vlasnik;
        if (stanje >= 0) {
            this.stanje = stanje;
        }
    }

    public Novcanik(String vlasnik) {
        this(vlasnik, 0);
    }

    /**
     * ...
     * @return string reprezentaciju objekta klase
     */
    public String opis() {
         return "Vlasnik: " + vlasnik +
        ", stanje: " + stanje;
    }
}
