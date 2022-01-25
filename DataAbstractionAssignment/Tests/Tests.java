import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class Tests {
    Customer customer;

    @Before
    public void setup() {
        customer = new Customer("", 1011, 100.0, 100.0);
    }

//SECTION Deposit
    //CODE Test deposit for checking account
    @Test
    public void testDepositChecking() throws Exception {
        // Get deposits list
        ArrayList<Deposit> deposits = new ArrayList<>(customer.getDeposits());
        // Make sure it starts empty
        assertTrue(deposits.isEmpty());
        // Create Deposit and add to list
        Deposit deposit = new Deposit(10.0, new Date(System.currentTimeMillis()), "Checking");
        customer.deposit(deposit.getAmount(), deposit.getDate(), deposit.getAccount());
        // Get new deposits list
        ArrayList<Deposit> newDeposits = customer.getDeposits();
        // Compare old deposits list with new deposits list to make sure deposit is inserted properly
        assertNotEquals(deposits, newDeposits);
        // Create custom arraylist with deposit
        ArrayList<Deposit> expectedDeposits = new ArrayList<>();
        expectedDeposits.add(deposit);
        // Ensure deposit is inserted by comparing it with another arraylist with same values
        assertFalse(newDeposits.isEmpty());
        assertEquals(newDeposits.get(0).getAmount(), expectedDeposits.get(0).getAmount(), 0.01);
        assertEquals(newDeposits.get(0).getAccount(), expectedDeposits.get(0).getAccount());
        assertEquals(newDeposits.get(0).getDate(), expectedDeposits.get(0).getDate());
    }
    //CODE Test deposit for saving account
    @Test
    public void testDepositSaving() throws Exception {
        // Get deposits list
        ArrayList<Deposit> deposits = new ArrayList<>(customer.getDeposits());
        // Make sure it starts empty
        assertTrue(deposits.isEmpty());
        // Create Deposit and add to list
        Deposit deposit = new Deposit(10.0, new Date(System.currentTimeMillis()), "Saving");
        customer.deposit(deposit.getAmount(), deposit.getDate(), deposit.getAccount());
        // Get new deposits list
        ArrayList<Deposit> newDeposits = customer.getDeposits();
        // Compare old deposits list with new deposits list to make sure deposit is inserted properly
        assertNotEquals(deposits, newDeposits);
        // Create custom arraylist with deposit
        ArrayList<Deposit> expectedDeposits = new ArrayList<>();
        expectedDeposits.add(deposit);
        // Ensure deposit is inserted by comparing it with another arraylist with same values
        assertFalse(newDeposits.isEmpty());
        assertEquals(newDeposits.get(0).getAmount(), expectedDeposits.get(0).getAmount(), 0.01);
        assertEquals(newDeposits.get(0).getAccount(), expectedDeposits.get(0).getAccount());
        assertEquals(newDeposits.get(0).getDate(), expectedDeposits.get(0).getDate());
    }
//!SECTION
//SECTION Withdraw
    //CODE Test withdraw for checking account
    @Test
    public void testWithdrawChecking() throws Exception {
        // Get withdraw list
        ArrayList<Withdraw> withdraws = new ArrayList<>(customer.getWithdraws());
        // Make sure it starts empty
        assertTrue(withdraws.isEmpty());
        // Create Withdraw and add to list
        Withdraw withdraw = new Withdraw(10.0, new Date(System.currentTimeMillis()), "Checking");
        customer.withdraw(withdraw.getAmount(), withdraw.getDate(), withdraw.getAccount());
        // Get new withdraw list
        ArrayList<Withdraw> newWithdraws = customer.getWithdraws();
        // Compare old withdraws list with new withdraws list to make sure withdraw is inserted properly
        assertNotEquals(withdraws, newWithdraws);
        // Create custom arraylist with withdraw
        ArrayList<Withdraw> expectedWithdraws = new ArrayList<>();
        expectedWithdraws.add(withdraw);
        // Ensure withdraw is inserted by comparing it with another arraylist with same values
        assertFalse(newWithdraws.isEmpty());
        assertEquals(newWithdraws.get(0).getAmount(), expectedWithdraws.get(0).getAmount(), 0.01);
        assertEquals(newWithdraws.get(0).getAccount(), expectedWithdraws.get(0).getAccount());
        assertEquals(newWithdraws.get(0).getDate(), expectedWithdraws.get(0).getDate());
    }
    //CODE Test checkOverdraft for checking account
    @Test
    public void testWithdrawCheckingOverdraft() {
        // Create Withdraw and add to list
        Withdraw withdraw = new Withdraw(1000.0, new Date(System.currentTimeMillis()), "Checking");
        // Check for the thrown exception
        Exception exception = assertThrows(Exception.class, () -> {
            customer.withdraw(withdraw.getAmount(), withdraw.getDate(), withdraw.getAccount());
        });
        String expectedMessage = "Check Overdraft";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    //CODE Test withdraw for saving account
    @Test
    public void testWithdrawSaving() throws Exception {
        // Get withdraws list
        ArrayList<Withdraw> withdraws = new ArrayList<>(customer.getWithdraws());
        // Make sure it starts empty
        assertTrue(withdraws.isEmpty());
        // Create Withdraw and add to list
        Withdraw withdraw = new Withdraw(10.0, new Date(System.currentTimeMillis()), "Saving");
        customer.withdraw(withdraw.getAmount(), withdraw.getDate(), withdraw.getAccount());
        // Get new withdraw list
        ArrayList<Withdraw> newWithdraws = customer.getWithdraws();
        // Compare old withdraws list with new withdraws list to make sure withdraw is inserted properly
        assertNotEquals(withdraws, newWithdraws);
        // Create custom arraylist with withdraw
        ArrayList<Withdraw> expectedWithdraws = new ArrayList<>();
        expectedWithdraws.add(withdraw);
        // Ensure withdraw is inserted by comparing it with another arraylist with same values
        assertFalse(newWithdraws.isEmpty());
        assertEquals(newWithdraws.get(0).getAmount(), expectedWithdraws.get(0).getAmount(), 0.01);
        assertEquals(newWithdraws.get(0).getAccount(), expectedWithdraws.get(0).getAccount());
        assertEquals(newWithdraws.get(0).getDate(), expectedWithdraws.get(0).getDate());
    }
    //CODE Test checkOverdraft for saving account
    @Test
    public void testWithdrawSavingOverdraft() {
        // Create Withdraw and add to list
        Withdraw withdraw = new Withdraw(1000.0, new Date(System.currentTimeMillis()), "Saving");
        // Check for the thrown exception
        Exception exception = assertThrows(Exception.class, () -> {
            customer.withdraw(withdraw.getAmount(), withdraw.getDate(), withdraw.getAccount());
        });
        String expectedMessage = "Check Overdraft";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
//!SECTION
}
