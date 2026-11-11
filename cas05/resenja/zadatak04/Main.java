package cas05.zadatak04;

public class Main {

    static void main() {
        Prevoz[] niz = {
                new Autobus("Bozur"),
                new Voz("BG"),
                new Taksi("Pink"),
                new Taksi("BGTaxi")
        };

        for (Prevoz p : niz) {
            // polimorfizam
            System.out.println(p.izracunajCenu(100));
        }
    }
}
