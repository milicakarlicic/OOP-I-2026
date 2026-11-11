package cas04.zadatak04;

public record Adresa(String ulica, int broj, String grad) {
    public String opis() {
        return ulica + " " + broj + " " + grad;
    }
}
