package q4;

import java.util.ArrayList;
import java.util.Date;

public class Account1 {
    private int id;
    private String customerName;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    
    public Account1(){
        id = 0;
        balance = 0.0d;
        annualInterestRate = 0.0;
        // The no arg constructor for Date always has the system time
        dateCreated = new Date();
    }

    public Account1(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account1(int id, String customerName, double balance) {
        this.id = id;
        this.customerName = customerName;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/12.0d;
    }
    
    public double getMonthlyInterest(){
        return balance * this.getMonthlyInterestRate() / 100;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    
    
    public boolean withdraw(double amount){
        if(amount > balance)
            return false;
        else {
            balance -= amount;
            Transaction withdrawl = new Transaction('W',amount,balance,"");
            transactions.add(withdrawl);
            return true;
        }
    }
    
    public boolean withdraw(double amount, String description){
        if(amount > balance)
            return false;
        else {
            balance -= amount;
            Transaction withdrawl = new Transaction('W',amount,balance,description);
            transactions.add(withdrawl);
            return true;
        }
    }
    
    public void deposit(double amount){
        balance += amount;
        Transaction deposit = new Transaction('D',amount, balance, "");
        transactions.add(deposit);
    }
    
    public void deposit(double amount, String description){
        balance += amount;
        Transaction deposit = new Transaction('D',amount, balance, description);
        transactions.add(deposit);
    }
    
    public static void main(String[] args) {
        
        Account1 account = new Account1(1122,"George", 1000);
        
        account.setAnnualInterestRate(1.5d);
        
        account.deposit(30);
        account.deposit(40, "from salary");
        account.deposit(50);
        
        account.withdraw(5);
        account.withdraw(4, "for dinner party");
        account.withdraw(2);
        
        System.out.println("Name: " + account.getCustomerName());
        System.out.println("Annual interest rate: " + account.getAnnualInterestRate());
        System.out.println("Balance: " + account.getBalance());
        
        System.out.println("Transaction History");
        System.out.printf("%-35s%-15s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance","Description");
        
        for(Transaction t : account.getTransactions()){
            System.out.print(t.toString());
        }
    }
}
