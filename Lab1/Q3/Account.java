import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account(){
        id = 0;
        balance = 0.0d;
        annualInterestRate = 0.0;
        // The no arg constructor for Date always has the system time
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
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
    
    public boolean withdraw(double amount){
        if(amount > balance)
            return false;
        else {
            balance -= amount;
            return true;
        }
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    
    
    public static void main(String[] args) {
        Account myAccount = new Account(1122,20000);
        myAccount.setAnnualInterestRate(4.5d);
        
        myAccount.withdraw(2500);
        myAccount.deposit(3000);
        System.out.println("The account balance is: $"+myAccount.getBalance());
        System.out.println("The monthly interest is: $"+myAccount.getMonthlyInterest());
        System.out.println("The account was created on: "+myAccount.getDateCreated());
    }
}
