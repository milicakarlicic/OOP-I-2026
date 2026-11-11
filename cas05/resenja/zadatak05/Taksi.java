package cas05.zadatak05;

public class Taksi extends Prevoz {
    public Taksi(String naziv) {
        super(naziv);
    }

    @Override
    public int izracunajCenu(int udaljenostKm) {
        return 300 + 95 * udaljenostKm;
    }

}
