package cas05.zadatak05;

public class Main {

    static void main() {
        Autobus autobus = new Autobus("Bozur");
        Voz voz = new Voz("BG");
        Taksi taksi = new Taksi("Pink");

        System.out.println(Ponuda.ponuda(autobus, 100));
        System.out.println(Ponuda.ponuda(voz, 100));
        System.out.println(Ponuda.ponuda(taksi, 100));
    }
}
