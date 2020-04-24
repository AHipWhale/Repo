package bioscoop;

public class Voedsel implements Item {
    private String naam;
    private double prijs;

    public Voedsel(String nm, double pr) {
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
