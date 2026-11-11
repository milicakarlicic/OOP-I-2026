package cas04.zadatak01;

public class Adresa {
    private String ulica;
    private int broj;
    private String grad;

    public Adresa(String ulica, int broj, String grad) {
        this.ulica = ulica;
        this.broj = broj;
        this.grad = grad;
    }

    public String opis() {
        return ulica + " " + broj + " " + grad;
    }
}
