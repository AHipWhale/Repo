package bioscoop;

public class Medewerker {
    private String naam;
    private String rol;

    public Medewerker(String nm, String rl) {
        naam = nm;
        rol = rl;
    }

    public String getNaam() {
        return naam;
    }

    public String getRol() {
        return rol;
    }

    public String toString() {
        return naam + " met de rol: " + rol;
    }
}
