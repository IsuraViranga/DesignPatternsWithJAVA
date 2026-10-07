public class PaypalPayment implements PaymentStrategy {
    public void pay(double amount){
        System.out.println("payment done using paypal " + amount);
    }

}
