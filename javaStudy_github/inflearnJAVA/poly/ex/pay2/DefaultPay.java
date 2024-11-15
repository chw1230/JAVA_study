package poly.ex.pay2;

public class DefaultPay implements Pay {
    @Override
    public boolean pay(int amount) {
        return false;
    }
}
