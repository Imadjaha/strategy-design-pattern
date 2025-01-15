package strategy_based;

public class Product {

    private final String type;
    private final double price;

    public Product(String type, double price) {
        this.type = type;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

}
