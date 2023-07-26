public class PaypalPayment implements PaymentStrategy {
    public void pay(int amount){
        System.out.println(amount + " paid with paypal.");
    }
}