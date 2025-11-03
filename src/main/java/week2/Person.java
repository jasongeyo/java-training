package week2;

public class Person implements Friendly , Polite {
    @Override
    public void printReceipt() {
        System.out.println("say:");
        Friendly.super.printReceipt();
        Polite.super.printReceipt();
    }
}
