package cas05.zadatak04;

public class Voz extends Prevoz {
    public Voz(String naziv) {
        super(naziv);
    }

    @Override
    public int izracunajCenu(int udaljenostKm) {
        return 250 + 8 * udaljenostKm;
    }

}
