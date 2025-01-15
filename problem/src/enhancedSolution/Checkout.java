package enhancedSolution;

public class Checkout {

    private final ZahlungStrategie zahlungStrategie;

    public Checkout(ZahlungStrategie zahlungStrategie) {
        this.zahlungStrategie = zahlungStrategie;
    }

    public void zahlungVerarbeiten(double betrag) {
        zahlungStrategie.zahlungVerarbeiten(betrag);
    }
}


