package naiveSolution;

public class Main {
    public static void main(String[] args) {

        Produkt wallet = new Produkt("Wallet", 200.0);
        double walletPreis = wallet.rechnePreis(Mitgliedschaft.REGULAER);

        Produkt mobile = new Produkt("Mobile", 800.0);
        double mobilePreis = mobile.rechnePreis(Mitgliedschaft.PREMIUM);

        Produkt jacke = new Produkt("Jacke", 100.0);
        double jackePreis = jacke.rechnePreis(Mitgliedschaft.GOLD);


        Checkout checkout = new Checkout();
        System.out.println("\nWallet -> OriginalPreis: " + wallet.getPreis() + " ,Preis nach Ermäßigung: "+  walletPreis );
        checkout.zahlungVerarbeiten(walletPreis, Zahlungsmethode.VISA_KARTE);

        System.out.println("\nMobile -> OriginalPreis: " + mobile.getPreis() + " ,Preis nach Ermäßigung: "+  mobilePreis );
        checkout.zahlungVerarbeiten(mobilePreis, Zahlungsmethode.PAYPAL);

        System.out.println("\nJacke -> OriginalPreis: " + jacke.getPreis() + " ,Preis nach Ermäßigung: "+  jackePreis );
        checkout.zahlungVerarbeiten(jackePreis, Zahlungsmethode.BANK_UEBERWEISUNG);
    }
}