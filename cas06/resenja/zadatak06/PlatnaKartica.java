package cas06.zadatak06;

public abstract class PlatnaKartica {
    private String vlasnik;
    private int poslednjeCetiriCifre;

    public PlatnaKartica(String vlasnik, int poslednjeCetiriCifre) {
        this.vlasnik = vlasnik;
        this.poslednjeCetiriCifre = poslednjeCetiriCifre;
    }

    @Override
    public String toString() {
        return "PlatnaKartica{" +
                "vlasnik='" + vlasnik + '\'' +
                ", poslednjeCetiriCifre=" + poslednjeCetiriCifre +
                '}';
    }
}
