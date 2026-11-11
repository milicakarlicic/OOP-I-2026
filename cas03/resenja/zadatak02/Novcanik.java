package cas03.zadatak02;

public class Novcanik {
    private String vlasnik;
    private int stanje;

    public Novcanik(String vlasnik, int stanje) {
        this.vlasnik = vlasnik;
        if (stanje >= 0) {
            this.stanje = stanje;
        }
    }

    public Novcanik(String vlasnik) {
        this(vlasnik, 0);
    }

    // geteri - metode za dohvatanje vrednosti polja
    public String getVlasnik() {
        return vlasnik;
    }

    public int getStanje() {
        return stanje;
    }

    // seteri - metode za postavljanje vrednosti polja

    public void setStanje(int stanje) {
        if (stanje >= 0) {
            this.stanje = stanje;
        }
    }

    public String opis() {
         return "Vlasnik: " + vlasnik +
         ", stanje: " + stanje;
    }
}
