package cas05.zadatak06;

public class Main {

    static void main() {
        RezervacijaPrevoza rezervacijaPrevoza =
                new RezervacijaPrevoza(
                  new Putnik("Marko"),
                  new Relacija("Beograd", "Novi Sad", 70),
                  new Voz("Voz")
                );

        System.out.println(rezervacijaPrevoza.opis());
    }
}
