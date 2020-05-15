package bioscoop;

public class Zaal {
    private int nummer;

    public Zaal(int nr) {
        nummer = nr;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getNummer() {
        return nummer;
    }

    public String toString() {
        return ""+nummer;
    }
}
