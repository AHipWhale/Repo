package bioscoop;

public class notMain {
    public static void main(String[] args) {
        Bioscoop b1 = new Bioscoop("Vue");
        Bioscoop b2 = new Bioscoop("Wolff");

        Zaal z1 = new Zaal(2335);
        Zaal z2 = new Zaal(2);
        b1.voegZalen(z1.getNummer());
        b1.voegZalen(z2.getNummer());

        Cafetaria c1 = new Cafetaria();
        Cafetaria c2 = new Cafetaria();

        Voedsel v1 = new Voedsel("kleine popcorn",3.60);
        Drankje d1 = new Drankje("Cola",3.60);
        Drankje d2 = new Drankje("Pepsi",1);

        b1.setCafetaria(c1);
        b2.setCafetaria(c2);

        c1.voegOmzet(d1.getPrijs());
        c1.voegOmzet(d2.getPrijs());
        c1.voegOmzet(v1.getPrijs());
        c2.voegOmzet(d2.getPrijs());

        Medewerker m1 = new Medewerker("Storm Joannes", "kassa");
        Medewerker m2 = new Medewerker("Marya dukmak", "popcorn machine");

        b1.voegMedewerker(m1);
        b1.voegMedewerker(m2);

        Klant k1 = new Klant("Charlie", 19);
        Klant k2 = new Klant("Thijme", 19);

        System.out.println(b1.toString());
        System.out.println(b2.toString());

        System.out.println("Klant1: "+k1.toString());
        System.out.println("Klant2: "+k2.toString());
    }
}
