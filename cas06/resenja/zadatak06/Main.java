package cas06.zadatak06;

public class Main {

    static void main() {
        DebitnaKartica kartica = new DebitnaKartica("Marko", 1244,
                20000);
        DigitalniNovcanik novcanik = new DigitalniNovcanik(25000);

        System.out.println(kartica);
        System.out.println(kartica.plati(5000));
        System.out.println(kartica);

        System.out.println("-------------------------------");

        System.out.println(novcanik);
        novcanik.ispisiRezultat(novcanik, 5000);
        System.out.println(novcanik);
    }
}
