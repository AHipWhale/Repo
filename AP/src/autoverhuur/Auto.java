package autoverhuur;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double pPD) {
        type = tp;
        prijsPerDag = pPD;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    @Override
    public String toString() {
        return type + " met prijs per dag: " + prijsPerDag;
    }
}
