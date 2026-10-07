public class PaypalAdapter implements Payment {
    Paypal paypal;

    PaypalAdapter(Paypal paypal){
        this.paypal=paypal;
    }

    @Override
    public void pay(){
        paypal.payPalPayment();
    }

}
