public class CardPayment implements PaymentStrategy{
     public void pay(double amount){
        System.out.println("payment done using card " + amount);
    }
}
