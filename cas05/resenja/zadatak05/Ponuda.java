package cas05.zadatak05;

public class Ponuda {

    public static String ponuda(Prevoz p, int udaljenostKm) {
        return "Naziv: " + p.naziv + ", cena: " +
                p.izracunajCenu(udaljenostKm);
    }

}
