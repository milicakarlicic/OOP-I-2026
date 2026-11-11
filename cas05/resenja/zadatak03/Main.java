package cas05.zadatak03;

public class Main {

    static void main() {
        Autobus autobus = new Autobus("Bozur");
        Voz voz = new Voz("BG");
        Taksi taksi = new Taksi("Pink");

        System.out.println(autobus.izracunajCenu(100));
        System.out.println(voz.izracunajCenu(100));
        System.out.println(taksi.izracunajCenu(100));
    }
}
