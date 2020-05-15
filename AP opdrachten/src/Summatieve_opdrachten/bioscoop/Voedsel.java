package bioscoop;

public class Voedsel implements Item {
    private String naam;
    private double prijs;

    public Voedsel(String nm, double pr) {
        naam = nm;
        prijs = pr;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
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
