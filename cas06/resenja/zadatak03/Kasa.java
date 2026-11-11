package cas06.zadatak03;

public class Kasa {
    private NacinPlacanja placanje;

    public Kasa(NacinPlacanja placanje) {
        this.placanje = placanje;
    }

    public void setPlacanje(NacinPlacanja placanje) {
        this.placanje = placanje;
    }

    public void naplati(int iznos) {
        if (placanje.plati(iznos)) {
            System.out.println("Uspesna transakcija!");
        } else {
            System.out.println("Neuspesna transakacija!");
        }
    }
}
