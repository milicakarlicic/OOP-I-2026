package cas05.zadatak04;

public class Autobus extends Prevoz {
    public Autobus(String naziv) {
        super(naziv);
    }

    @Override
    public int izracunajCenu(int udaljenostKm) {
        return 150 + 7 * udaljenostKm;
    }

}
