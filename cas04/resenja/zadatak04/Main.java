package cas04.zadatak04;

public class Main {

    static void main() {
        Adresa adresa = new Adresa("Ugrinovacka", 20, "Beograd");
        Kupac kupac = new Kupac(
                "Marko", adresa
        );
        Porudzbina p = new Porudzbina(adresa);

        System.out.println(kupac.opis());
        System.out.println(p.opis());

        System.out.println("---------------------------");

        kupac.promeniAdresu(new Adresa("Cara Dusana", 25, "Beograd"));

        System.out.println(kupac.opis());
        System.out.println(p.opis());

    }

}
