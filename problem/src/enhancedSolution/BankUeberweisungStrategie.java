package enhancedSolution;

public class BankUeberweisungStrategie implements ZahlungStrategie {

    @Override
    public void zahlungVerarbeiten(double betrag) {
        System.out.println("Der Betrag " + betrag +  " wird mit BankÜberweisung bezahlt");
    }
}
