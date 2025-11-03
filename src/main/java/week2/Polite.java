package week2;

public interface Polite {
    default void printReceipt() {
        System.out.println("Receipt Polite");
    }
}
