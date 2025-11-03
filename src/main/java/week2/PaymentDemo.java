package week2;

public class PaymentDemo {
    public static void main(String[] args) {
        Payable card = new CreditCardPayment();
        Payable cash = new CashPayment();

        card.pay(500);
        card.printReceipt(500);

        cash.pay(300);
        cash.printReceipt(300);

        //  呼叫介面靜態方法
        Payable.showSupporInfo();

        Person person = new Person();
        person.printReceipt();
    }
}
