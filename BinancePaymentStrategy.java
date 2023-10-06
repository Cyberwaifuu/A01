public class BinancePaymentStrategy implements PaymentStrategy {
    String address;

    public BinancePaymentStrategy(String address) {
        this.address = address;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid by Binance Crypto Wallet");
    }
}