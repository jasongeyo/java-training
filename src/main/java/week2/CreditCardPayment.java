package week2;

public class CreditCardPayment implements Payable{

    @Override
    public void pay(double amount) {
        System.out.println("pay"+amount+"by Credit Card");
    }
}
