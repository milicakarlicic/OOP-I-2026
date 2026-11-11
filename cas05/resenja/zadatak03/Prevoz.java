package cas05.zadatak03;

public abstract class Prevoz {
    protected String naziv;

    public Prevoz(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public abstract int izracunajCenu(int udaljenostKm);

}
