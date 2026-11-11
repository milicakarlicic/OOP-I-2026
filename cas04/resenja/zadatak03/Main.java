package cas04.zadatak03;

public class Main {

    static void main() {
        Kupac k = new Kupac("Ana", "Markovic");
        Porudzbina p = new Porudzbina(k);

        p.dodajStavku(
                new StavkaPorudzbine(
                new Proizvod("cokolada", 200), 2));
        p.dodajStavku(
                new StavkaPorudzbine(
                new Proizvod("jogurt", 100), 1));
        p.dodajStavku(
                new StavkaPorudzbine(
                new Proizvod("zvake", 150), 3));

        System.out.println(p.opis());

        System.out.println(p.ukupnaCena());
    }
}
