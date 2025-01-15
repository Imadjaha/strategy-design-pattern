package enhancedSolution;

public class TitaniumStrategie implements MitgliedschaftStrategie {

    @Override
    public double rechnePreis(double preis){
        return preis * 0.5; // 50% discount
    }
}
