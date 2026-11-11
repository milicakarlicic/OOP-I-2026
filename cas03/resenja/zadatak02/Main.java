package cas03.zadatak02;

public class Main {

    static void main() {
        Novcanik n = new Novcanik(
                "Ana", 1000);

        System.out.println(n.opis());
        System.out.println("Vlasnik: " + n.getVlasnik());
        n.setStanje(-100);
        System.out.println(n.opis());
    }

}
