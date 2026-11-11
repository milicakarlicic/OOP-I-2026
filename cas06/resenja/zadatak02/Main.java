package cas06.zadatak02;

public class Main {

    static void main() {
        PlacanjeKarticom p1 = new PlacanjeKarticom(15000);
        NacinPlacanja p2 = new PlacanjeGotovinom(3000);

        System.out.println(p1.plati(5000));
        System.out.println(p2.plati(5000));

        if (p1 instanceof PlacanjeKarticom) {
            PlacanjeKarticom pom = p1;
            System.out.println("Stanje na kartici:" + pom.getStanjeNaKartici());
        }
    }
}
