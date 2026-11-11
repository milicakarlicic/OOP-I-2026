package cas03.zadatak01;

public class Main {

    static void main() {
        Novcanik n = new Novcanik(
                "Ana", 1000);

        System.out.println(n.opis());
        n.stanje = -100;
        System.out.println(n.opis());
    }

}
