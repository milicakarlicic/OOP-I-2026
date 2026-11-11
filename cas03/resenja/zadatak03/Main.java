package cas03.zadatak03;

public class Main {

    static void main() {
        Novcanik n = new Novcanik(
                "Ana", 1000);

        System.out.println(n.opis());
        System.out.println(n.plati(500));
        System.out.println(n.opis());
        System.out.println(n.plati(1500));
        System.out.println(n.uplata(5000));
        System.out.println(n.opis());
        System.out.println(n.plati(1500));
    }

}
