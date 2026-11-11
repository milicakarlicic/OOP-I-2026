package cas05.zadatak02;

public class Main {

    static void main() {
        Prevoz prevoz = new Prevoz("P", 50);
        Autobus autobus = new Autobus("A", 70, 50);
        Voz voz = new Voz("V", 110, 7);

        System.out.println(prevoz.opis());
        System.out.println(prevoz.proceniTrajanje(100));

        System.out.println(autobus.opis());
        System.out.println(voz.opis());
    }
}
