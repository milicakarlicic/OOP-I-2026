package cas06.zadatak01;

public class Voz extends Prevoz {
    private int brojVagona;

    public Voz(String ime, int brojVagona) {
        super(ime);
        this.brojVagona = brojVagona;
    }

    public Voz(Voz v) {
        this(v.getIme(), v.brojVagona);
    }

    public int getBrojVagona() {
        return brojVagona;
    }

    public void setBrojVagona(int brojVagona) {
        this.brojVagona = brojVagona;
    }

    @Override
    public String toString() {
        return super.toString() + ", broj vagona: " + brojVagona;
    }
}
