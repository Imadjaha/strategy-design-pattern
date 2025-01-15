package enhancedSolution;

public class GoldMitgliedschaftStrategie implements MitgliedschaftStrategie {

    @Override
    public double rechnePreis(double preis) {
        return preis * 0.9; // 10% discount
    }
}
