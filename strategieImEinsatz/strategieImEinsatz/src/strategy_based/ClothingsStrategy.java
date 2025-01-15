package strategy_based;

public class ClothingsStrategy implements DiscountStrategy {

    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.2;
    }
}
