package cas06.zadatak04;

public class Main {

    static void main() {
        DigitalniNovcanik p1 = new DigitalniNovcanik(25000);
        NacinPlacanja p2 = new PoklonKartica(10000);

        System.out.println(p1);
        System.out.println(p1.plati(5000));
        System.out.println(p1);
        System.out.println(p1.dopuna(10000));
        System.out.println(p1);

        System.out.println("------------------------------------");

        System.out.println(p2);
        System.out.println(p2.plati(5000));
        System.out.println(p2);
    }
}
