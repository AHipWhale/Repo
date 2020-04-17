package autoverhuur;

public class AutoHuur {
    private int aantalDagen;
    private Auto auto;
    private Klant klant;
    private int prijs;

    public AutoHuur() {
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setGehuurdeAuto(Auto ga) {
        auto = ga;
    }

    public Auto getGehuurdeAuto() {
        return auto;
    }

    public void setHuurder(Klant k) {
        klant = k;
    }

    public Klant getHuurder() {
        return klant;
    }

    public double totaalPrijs() {
        double totaalprijs;
        double korting;
        korting = (100 - klant.getKorting()) / 100;
        totaalprijs = (aantalDagen * auto.getPrijsPerDag()) * korting;
        return totaalprijs;
    }

    @Override
    public String toString() {
        if (auto == null && klant != null) {
            String auto = "er is geen auto bekend";
            return "\n  autotype: " + auto +
                    "\n  op naam van: " + klant +
                    "\n  aantal dagen: " + aantalDagen +
                    " en dat kost " +"0.0"+ "\n";
        }

        else if (klant == null && auto != null) {
            String klant = "er is geen huurder bekend";
            return "\n  autotype: " + auto +
                    "\n  op naam van: " + klant +
                    "\n  aantal dagen: " + aantalDagen +
                    " en dat kost " +"0.0"+ "\n";
        }
        else if (klant == null && auto == null) {
            String klant = "er is geen huurder bekend";
            String auto = "er is geen auto bekend";
            return "\n  autotype: " + auto +
                    "\n  op naam van: " + klant +
                    "\n  aantal dagen: " + aantalDagen +
                    " en dat kost " +"0.0"+ "\n";
        }

        return "\n  autotype: " + auto +
                "\n  op naam van: " + klant +
                "\n  aantal dagen: " + aantalDagen +
                " en dat kost " +totaalPrijs()+ "\n";
    }
}
