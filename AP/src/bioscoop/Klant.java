package bioscoop;

public class Klant {
    private String naam;
    private int leeftijd;

    public Klant(String nm, int lt) {
        naam = nm;
        leeftijd = lt;
    }

    public String getNaam() {
        return naam;
    }

    public String toString() {
        return naam + " en is "+leeftijd+ " jaar oud";
    }
}
