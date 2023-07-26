public class Main {
    public static void main(String[] args) {
        CartTotal ct = new CartTotal(5000);
        ct.pay(new CreditCardPayment());
        ct.pay(new PaypalPayment());
    }
}
