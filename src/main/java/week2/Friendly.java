package week2;

public interface Friendly {
    default void printReceipt() {
        System.out.println("Receipt Friendly");
    }
}
