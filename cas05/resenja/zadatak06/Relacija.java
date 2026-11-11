package cas05.zadatak06;

public record Relacija(String polaziste,
                       String odrediste,
                       int udaljenost) {

    public String opis() {
        return "Relacija: " + polaziste + " - "
                + odrediste + ", km = " + udaljenost;
    }
}
