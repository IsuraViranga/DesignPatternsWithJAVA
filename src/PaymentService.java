public class PaymentService {
    PaymentStrategy paymentStrategy;

    PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    void paymentProcess(double amount){
        paymentStrategy.pay(amount);
    }

}
