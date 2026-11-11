package cas06.zadatak01;

public class Prevoz {
    private String ime;

    public Prevoz(String ime) {
        this.ime = ime;
    }

    public Prevoz(Prevoz p) {
        this(p.ime);
    }

    public String getIme() {
        return ime;
    }

    @Override
    public String toString() {
        return "Prevoz: " + ime;
    }
}
