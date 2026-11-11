package cas05.zadatak02;

public class Voz extends Prevoz {
    private int brojVagona;

    public Voz(String naziv, int prosecnaBrzina, int brojVagona) {
        super(naziv, prosecnaBrzina);
        this.brojVagona = brojVagona;
    }
}
