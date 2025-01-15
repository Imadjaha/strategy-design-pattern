package naiveSolution;

public class Checkout {

    public void zahlungVerarbeiten(double betrag, Zahlungsmethode zahlungsmethode) {
        if (zahlungsmethode.equals(Zahlungsmethode.VISA_KARTE)) {
            System.out.println("Der Betrag " + betrag +  " wird mit Visa-Karte bezahlt");

        } else if (zahlungsmethode.equals(Zahlungsmethode.PAYPAL)) {
            System.out.println("Der Betrag " + betrag +  " wird mit PayPal bezahlt");

        } else if (zahlungsmethode.equals(Zahlungsmethode.BANK_UEBERWEISUNG)) {
            System.out.println("Der Betrag " + betrag +  " wird mit BankÜberweisung bezahlt");

        }
    }
}
