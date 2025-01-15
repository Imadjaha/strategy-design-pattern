package strategy_based;

public class BooksStrategy implements DiscountStrategy {

    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.3;
    }
}
