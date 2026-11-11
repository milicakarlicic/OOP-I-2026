package cas03.zadatak03;

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

    public String getVlasnik() {
        return vlasnik;
    }

    public int getStanje() {
        return stanje;
    }

    public boolean uplata(int iznos) {
        // stanje + iznos > int_max
        // stanje > int_max - iznos
        // stanje + iznos
        if (iznos < 0 || stanje > Integer.MAX_VALUE - iznos) {
           return false;
        }
        stanje += iznos;
        return true;
    }

    public boolean plati(int iznos) {
        if (iznos < 0 || stanje < iznos) {
            return false;
        }
        stanje -= iznos;
        return true;
    }

    public String opis() {
         return "Vlasnik: " + vlasnik +
         ", stanje: " + stanje;
    }
}
