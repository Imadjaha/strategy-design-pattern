package enhancedSolution;

public class PaypalStrategie implements ZahlungStrategie {

    @Override
    public void zahlungVerarbeiten(double betrag){
        System.out.println("Der Betrag " + betrag +  " wird mit PayPal bezahlt");
    }
}
