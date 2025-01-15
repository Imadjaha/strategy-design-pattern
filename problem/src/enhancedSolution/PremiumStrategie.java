package enhancedSolution;

public class PremiumStrategie implements MitgliedschaftStrategie {

    @Override
    public double rechnePreis(double preis) {
        return preis * 0.8; // 20% discount
    }
}
