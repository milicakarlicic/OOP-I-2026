package cas03.zadatak05;

public class Main {

    static void main() {
        System.out.println("Broj novcanika: " + Novcanik.brojacNovcanika());

        Novcanik n1 = new Novcanik(
                "Ana", 1000);
        System.out.println("Broj novcanika: " + Novcanik.brojacNovcanika());

        Novcanik n2 = new Novcanik(
                "Marko", 5000);
        Novcanik n3 = new Novcanik(
                "Masa", 6000);
        System.out.println("Broj novcanika: " + Novcanik.brojacNovcanika());
    }

}
