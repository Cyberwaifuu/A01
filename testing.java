import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Product product1 = new Product("Sushi", 100, 2);
        Product product2 = new Product("DrinkS", 20, 5);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        System.out.println("Total price in cart: " + cart.calculateTotalPrice());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a payment method (1 for Black Card, 2 for Binance1): ");
        int choice = scanner.nextInt();

        PaymentStrategy paymentStrategy;
        if (choice == 1) {
            paymentStrategy = new BlackCardPayment("8-800-555-3535", "Biba Boba");
        } else if (choice == 2) {
            paymentStrategy = new BinancePaymentStrategy("1BvBMSEYstWetqTFn5Au4m4GFg7xJaNVN2");
        } else {
            System.out.println("Invalid choice. Exiting...");
            return;
        }

        cart.checkout(paymentStrategy);
    }
}
