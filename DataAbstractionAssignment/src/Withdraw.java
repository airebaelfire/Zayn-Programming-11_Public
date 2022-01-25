import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    //Requires: Nothing
    //Modifies: Nothing
    //Effects: Sets the string value that is returned when the object is printed.
    public String toString(){
        //your code here
        return "Withdraw of: " + amount + " Date: " + date + " from account: " + account;
    }

    //Requires: Nothing
    //Modifies: Nothing
    //Effects: Returns the amount
    public double getAmount() {
        return this.amount;
    }

    //Requires: Nothing
    //Modifies: Nothing
    //Effects: Returns the date
    public Date getDate() {
        return this.date;
    }

    //Requires: Nothing
    //Modifies: Nothing
    //Effects: Returns the account
    public String getAccount() {
        return this.account;
    }
}
