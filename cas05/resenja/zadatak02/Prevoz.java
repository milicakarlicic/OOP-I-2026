package cas05.zadatak02;

public class Prevoz {
    private String naziv;
    private int prosecnaBrzina;

    public Prevoz(String naziv, int prosecnaBrzina) {
        this.naziv = naziv;
        this.prosecnaBrzina = prosecnaBrzina;
    }

    public int proceniTrajanje(int udaljenostKm) {
        return udaljenostKm / prosecnaBrzina;
    }

    public String opis() {
        return "Naziv: " + naziv +
                ", prosecna brzina: " + prosecnaBrzina;
    }
}
