package cas03.zadatak06.model;

public class Brojac {
    private int vrednost;

    public void uvecaj() {
        vrednost++;
    }

    public int getVrednost() {
        return vrednost;
    }

    // public, private, [package]
    void resetuj() {
        vrednost = 0;
    }

    public String opis() {
        return "Vrednost: " + vrednost;
    }
}
