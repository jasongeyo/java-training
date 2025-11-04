package week2;

public interface Payable {
    void pay (double amount);

    default void printReceipt (double amount) {
        System.out.println("Payment of $" + amount + " completed.");
    }

    default void printReceipt (String name,double amount) {
        System.out.println(name +"Payment of $" + amount + " completed.");
    }

    static void showSupporInfo() {
        System.out.println("Suppor Info");
    }
}
