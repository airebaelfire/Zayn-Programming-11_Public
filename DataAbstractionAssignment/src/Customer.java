import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private String name;
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private static int accountNumberInc = 0;
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
        this.name = "";
        this.accountNumber = accountNumberInc;
        this.checkBalance = 0;
        this.savingBalance = 0;
        deposits = new ArrayList<>();
        withdraws = new ArrayList<>();
        accountNumberInc++;
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
        deposits = new ArrayList<>();
        withdraws = new ArrayList<>();
    }

    //Requires: double, Date, String account = "Checking" or "Saving"
    //Modifies: deposits, checkBalance, savingBalance
    //Effects: Adds deposit to arraylist of deposits
    public double deposit(double amt, Date date, String account) throws Exception {
        //your code here
        if (account.equals(CHECKING) || account.equalsIgnoreCase(SAVING)) {
            if (account.equals(CHECKING)) {
                checkBalance += amt;
            } else if (account.equals(SAVING)) {
                savingBalance += amt;
            }
            deposits.add(new Deposit(amt, date, account));
        } else {
            throw new Exception("Invalid string. Please enter \"Checking\" or \"Saving\"");
        }
        return 0;
    }
    //Requires: double, Date, String account = "Checking" or "Saving"
    //Modifies: withdraws, checkBalance, savingBalance
    //Effects: Adds withdraw to arraylist of withdraws if checkoverdraft is false, else throw exception
    public double withdraw(double amt, Date date, String account) throws Exception {
        //your code here
        if (account.equals(CHECKING) || account.equalsIgnoreCase(SAVING)) {
            if (!checkOverdraft(amt, account)) {
                if (account.equals(CHECKING)) {
                    checkBalance -= amt;
                } else if (account.equals(SAVING)) {
                    savingBalance -= amt;
                }
                withdraws.add(new Withdraw(amt, date, account));
            } else {
                throw new Exception("Check Overdraft");
            }
        } else {
            throw new Exception("Invalid string. Please enter \"Checking\" or \"Saving\"");
        }
        return 0;
    }
    //Requires: double, String account = "Checking" or "Saving"
    //Modifies: Nothing
    //Effects: returns true if amount is greater than balance in account, else return false
    private boolean checkOverdraft(double amt, String account) throws Exception{
        //your code here
        if (account.equals(CHECKING) || account.equalsIgnoreCase(SAVING)) {
            if (account.equals(CHECKING)) {
                return amt >= checkBalance - OVERDRAFT;
            } else if (account.equals(SAVING)) {
                return amt >= savingBalance - OVERDRAFT;
            }
        } else {
            throw new Exception("Invalid string. Please enter \"Checking\" or \"Saving\"");
        }
        return false;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

    //Requires: Nothing
    //Modifies: Nothing
    //Effects: Returns the deposits list
    public ArrayList<Deposit> getDeposits() {
        return this.deposits;
    }

    //Requires: Nothing
    //Modifies: Nothing
    //Effects: Returns the withdraws list
    public ArrayList<Withdraw> getWithdraws() {
        return this.withdraws;
    }
}
