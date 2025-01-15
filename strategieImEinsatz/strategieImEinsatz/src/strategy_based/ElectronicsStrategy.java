package strategy_based;

public class ElectronicsStrategy implements DiscountStrategy {

    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.1;
    }

}
