package non_strategy;

public class DiscountCalculator {

    double calculatorDiscount(Product product) {

        return switch (product.getType()) {
            case "electronics" -> product.getPrice() * 0.1;

            case "clothing" -> product.getPrice() * 0.2;

            case "books" -> product.getPrice() * 0.3;

            default -> 0.0;
        };
    }
}
