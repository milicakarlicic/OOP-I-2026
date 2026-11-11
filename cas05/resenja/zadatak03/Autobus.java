package cas05.zadatak03;

public class Autobus extends Prevoz {
    public Autobus(String naziv) {
        super(naziv);
    }

    @Override
    public int izracunajCenu(int udaljenostKm) {
        return 150 + 7 * udaljenostKm;
    }

}
