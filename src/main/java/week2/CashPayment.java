package week2;

public class CashPayment implements Payable{
    @Override
    public void pay(double amount) {
        System.out.println("pay"+amount+"by Cash");
    }
}
