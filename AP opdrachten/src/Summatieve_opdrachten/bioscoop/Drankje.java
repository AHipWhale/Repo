package bioscoop;

public class Drankje implements Item {
    private String naam;
    private double prijs;

    public Drankje(String nm, double pr) {
        naam = nm;
        prijs = pr;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public String toString() {
        return naam + prijs;
    }
}
