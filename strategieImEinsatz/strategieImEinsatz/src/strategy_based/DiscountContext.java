package strategy_based;

public class DiscountContext {

    private final DiscountStrategy discountStrategy;

    public DiscountContext(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(Product product) {
        return discountStrategy.calculateDiscount(product);
    }


}
