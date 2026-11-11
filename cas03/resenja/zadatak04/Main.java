package cas03.zadatak04;

public class Main {

    static void main() {
        Novcanik n1 = new Novcanik(
                "Ana", 1000);
        Novcanik n2 = new Novcanik(
                "Marko", 5000);
        Novcanik n3 = new Novcanik(
                "Masa", 6000);

        System.out.println(n1.opis());
        System.out.println(n2.opis());
        System.out.println(n3.opis());
    }

}
