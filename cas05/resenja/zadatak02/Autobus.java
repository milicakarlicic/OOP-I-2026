package cas05.zadatak02;

public class Autobus extends Prevoz {
    private int brojSedista;

    public Autobus(String naziv, int prosecnaBrzina,
                   int brojSedista) {
        super(naziv, prosecnaBrzina);
        this.brojSedista = brojSedista;
    }
}
