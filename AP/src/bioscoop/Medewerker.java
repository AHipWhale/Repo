package bioscoop;

public class Medewerker {
    private String naam;
    private String rol;

    public Medewerker(String nm, String rl) {
        naam = nm;
        rol = rl;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setRol(String rol) {
        this.rol = rol;
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
