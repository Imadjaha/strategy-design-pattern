package enhancedSolution;

public class Produkt {

    private final String name;
    private final double preis;

    private final MitgliedschaftStrategie mitgliedschaftStrategie;

    public Produkt(String name, double preis, MitgliedschaftStrategie mitgliedschaftStrategie) {
        this.name = name;
        this.preis = preis;
        this.mitgliedschaftStrategie = mitgliedschaftStrategie;
    }

    public double rechnePreis() {
        return mitgliedschaftStrategie.rechnePreis(preis);
    }


    public double getPreis() {
        return preis;
    }


}
