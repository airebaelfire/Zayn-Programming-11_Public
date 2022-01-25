import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("John Doe", 12349876, 50, 50);
        customer.deposit(150.50, new Date(System.currentTimeMillis()), "Checking");
        customer.withdraw(10.50, new Date(System.currentTimeMillis()), "Saving");
        customer.displayDeposits();
        customer.displayWithdraws();
    }
}
