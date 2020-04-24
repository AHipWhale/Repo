package bioscoop;

import java.util.ArrayList;

public class Cafetaria {
    private Voedsel voedsel;
    private Drankje drankje;
    private ArrayList<Double>Omzet;

    public Cafetaria() {
        Omzet = new ArrayList<>();
    }

    public void setVoedsel(Voedsel vs) {
        voedsel = vs;
    }

    public void setDrankje(Drankje drk) {
        drankje = drk;
    }

    public Voedsel getVoedsel() {
        return voedsel;
    }

    public Drankje getDrankje() {
        return drankje;
    }

    public ArrayList<Double> getOmzet() {
        return Omzet;
    }

    public void setOmzet(ArrayList<Double> omzet) {
        this.Omzet = omzet;
    }
    public void voegOmzet(double omz) {
        Omzet.add(omz);
    }

    public float totaal() {
        float totaal = 0;
        for (double i : Omzet) {
            totaal += i;
        }
        return totaal;
    }
    //Bij het stukje van totaal() heb ik een born gebruikt. Namelijk: https://www.ict.social/java/oop/lists-in-java-course

    public String toString() {
        return "Omzet: "+totaal();
    }
}
