package q4;

import java.util.Date;

/* @author Amaan Geelani Syed S2191704 */

public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    public String toString(){
        return String.format("%-35s%-15s%-15s%-15s%-15s\n", date,type,amount,balance,description.equals("") ? "-" : description);
    }
    
    
}
