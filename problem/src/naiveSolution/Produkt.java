package naiveSolution;


public class Produkt {

    private final String name;
    private final double preis;

    public Produkt(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    public double rechnePreis(Mitgliedschaft mitgliedschaft) {
        if (mitgliedschaft.equals(Mitgliedschaft.REGULAER)) {
            return preis;
        }
        else if (mitgliedschaft.equals(Mitgliedschaft.GOLD)) {
            return preis * 0.9; // 10 % discount
        }
        else if (mitgliedschaft.equals(Mitgliedschaft.PREMIUM)) {
            return preis * 0.8; // 20% discount
        }
        return preis;
    }

    public double getPreis() {
        return preis;
    }

    public String getName() {
        return name;
    }
}
