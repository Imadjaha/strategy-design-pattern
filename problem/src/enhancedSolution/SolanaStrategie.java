package enhancedSolution;

public class SolanaStrategie implements ZahlungStrategie {

    @Override
    public void zahlungVerarbeiten(double betrag){
        System.out.println("Der Betrag " + betrag +  " wird mit Solana bezahlt");
    }
}
