package cas06.zadatak01;

public class Main {

    // preopterecenje
    static void ispisi(Prevoz p) {
        System.out.println("Prevoz: " + p.getIme());
    }

    static void ispisi(Voz v) {
        System.out.println("Voz: " + v.getIme() +
                ", broj vagona: " + v.getBrojVagona());
    }

    static void main() {
        Prevoz prevoz = new Prevoz("P");
        Voz voz = new Voz("V", 15);
        Voz vozKopija = new Voz(voz);

        System.out.println(prevoz);

        System.out.println("------------------------");

        System.out.println(voz);
        System.out.println(vozKopija);

        vozKopija.setBrojVagona(10);
        System.out.println("------------------------");

        System.out.println(voz);
        System.out.println(vozKopija);
    }
}
