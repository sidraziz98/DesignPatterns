public class CartTotal {
    private int amount;

    public CartTotal(int amount){
        this.amount = amount;
    }

    public void pay(PaymentStrategy ps){
        ps.pay(amount);
    }
}
