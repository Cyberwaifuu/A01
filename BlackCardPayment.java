public class BlackCardPayment implements PaymentStrategy{
    String cardNum;
    String fullName;
    public BlackCardPayment(String cardNum, String fullName){
        this.cardNum = cardNum;
        this.fullName = fullName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid by Ultimate Black Card :o");
    }
}