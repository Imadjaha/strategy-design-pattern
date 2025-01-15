package non_strategy;

public class Main {

    public static void main(String[] args) {

        Product iphone = new Product("electronics", 600.0);

        DiscountCalculator discount = new DiscountCalculator();

        double applied_discount = discount.calculatorDiscount(iphone);

        System.out.println("The applied discount is: " + applied_discount);

    }

}
