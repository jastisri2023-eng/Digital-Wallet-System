import java.util.*;

public class App {

    private static double balance = 0.0;

    public static void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public static void spendMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public static double getBalance() {
        return balance;
    }

    public static void resetBalance() {
        balance = 0.0;
    }

    public static void main(String[] args) {
        System.out.println("Digital Wallet System Running...");

        addMoney(1000);
        spendMoney(200);

        System.out.println("Current Balance: " + getBalance());

        while (true) {
        }
    }
}