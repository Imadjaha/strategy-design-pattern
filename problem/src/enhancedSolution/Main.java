package enhancedSolution;

public class Main {
    public static void main(String[] args) {

        Produkt wallet = new Produkt("Wallet", 200.0, new RegulaerStrategie());
        double walletPreis = wallet.rechnePreis();

        Produkt mobile = new Produkt("Mobile", 800.0, new PremiumStrategie());
        double mobilePreis = mobile.rechnePreis();

        Produkt jacke = new Produkt("Jacke", 100.0, new GoldMitgliedschaftStrategie());
        double jackePreis = jacke.rechnePreis();


        Checkout visaCardCheckout = new Checkout(new VisaCardStrategie());
        System.out.println("\nWallet -> OriginalPreis: " + wallet.getPreis() + " ,Preis nach Ermäßigung: "+  walletPreis );
        visaCardCheckout.zahlungVerarbeiten(walletPreis);

        Checkout paypalCheckout = new Checkout(new PaypalStrategie());
        System.out.println("\nMobile -> OriginalPreis: " + mobile.getPreis() + " ,Preis nach Ermäßigung: "+  mobilePreis );
        paypalCheckout.zahlungVerarbeiten(mobilePreis);

        Checkout bankUeberweisungCheckout = new Checkout(new BankUeberweisungStrategie());
        System.out.println("\nJacke -> OriginalPreis: " + jacke.getPreis() + " ,Preis nach Ermäßigung: "+  jackePreis );
        bankUeberweisungCheckout.zahlungVerarbeiten(jackePreis);

        // Titanium + SolanaPayment
        Produkt laptop = new Produkt("Laptop", 2050.0, new TitaniumStrategie());
        double laptopPreis = laptop.rechnePreis();
        System.out.println("\nLaptop -> OriginalPreis: " + laptop.getPreis() + " ,Preis nach Ermäßigung: "+  laptopPreis );

        Checkout solanaCheckout = new Checkout(new SolanaStrategie());
        solanaCheckout.zahlungVerarbeiten(laptopPreis);
    }
}