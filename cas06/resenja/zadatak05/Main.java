package cas06.zadatak05;

public class Main {

    static void main() {
        NacinPlacanja p1 = new DigitalniNovcanik(25000);

        System.out.println(p1);
        p1.ispisiRezultat(p1, 5000);
        System.out.println(p1);
        p1.ispisiRezultat(p1, 20000);
        System.out.println(p1);
        p1.ispisiRezultat(p1, 5000);
    }
}
