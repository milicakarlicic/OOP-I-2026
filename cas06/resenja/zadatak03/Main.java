package cas06.zadatak03;

public class Main {

    static void main() {
        Kasa kasa = new Kasa(new PlacanjeGotovinom(1000));

        kasa.naplati(1500);
        kasa.setPlacanje(new PlacanjeKarticom(10000));
        kasa.naplati(1500);
    }
}
