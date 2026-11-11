package cas04.zadatak01;

public class Main {

    static void main() {
        Kupac k = new Kupac("Ana", "Markovic",
                new Adresa("Nikole Tesle", 25, "Beograd"));

        System.out.println(k.opis());
    }

}
