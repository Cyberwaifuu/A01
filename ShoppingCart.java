import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> Items = new ArrayList<>();
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void addProduct(Product product) {
        Items.add(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product item : Items) {
            totalPrice += item.getPrice() * item.getNum();
        }
        return totalPrice;
    }

    public void checkout(PaymentStrategy paymentStrategy) {
        double total = calculateTotalPrice();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.processPayment(total);
    }
}