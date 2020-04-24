package bioscoop;


import java.util.ArrayList;

public class Bioscoop {
    private String naam;
    private Zaal zaal;
    private Medewerker medewerker;
    private Cafetaria cafetaria;
    private ArrayList<Integer> zalen;
    private ArrayList<Medewerker> medewerkers;

    public Bioscoop(String nm){
        naam = nm;
        zalen = new ArrayList<>();
        medewerkers = new ArrayList<>();
    }

    public void setCafetaria(Cafetaria cf) {
        cafetaria = cf;
    }

    public Zaal getZaal() {
        return zaal;
    }

    public Medewerker getMedewerker() {
        return medewerker;
    }

    public Cafetaria getCafetaria() {
        return cafetaria;
    }

    public ArrayList<Integer> getZalen() {
        return zalen;
    }

    public void voegZalen(int zl) {
        zalen.add(zl);
    }

    public ArrayList<Medewerker> getMedewerkers() {
        return medewerkers;
    }

    public void voegMedewerker(Medewerker mw) {
        medewerkers.add(mw);
    }

    @Override
    public String toString() {
        String result = "";
        result += "Bioscoopnaam: " + naam + "\n";

        if (zalen.isEmpty() == false) {
            result += "Gebruikte zalen: " + zalen + "\n";
        }
        else {
            result += "Gebruikte zalen: Er zijn geen zalen gebruikt\n";
        }
        if (medewerkers.isEmpty() == false) {
            result += "Medewerker: " + medewerkers + "\n";
        }
        else {
            result += "Medewerker: Er zijn geen medewerkers\n";
        }
        result += cafetaria.toString() + "\n";

        return result;
    }
}
