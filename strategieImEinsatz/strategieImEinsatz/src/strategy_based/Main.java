package strategy_based;

public class Main {
    public static void main(String[] args) {

        Product iphone = new Product("electronics", 600.0);

        DiscountContext discount = new DiscountContext(new ElectronicsStrategy());

        double applied_discount = discount.calculateDiscount(iphone);

        System.out.println("The applied discount is: " + applied_discount);


    }
}