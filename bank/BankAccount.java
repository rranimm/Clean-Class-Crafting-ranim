package bank;

/**
 *
 * @author Ranim
 */
public abstract class BankAccount {

    //fields
    private double balance;
    private int numberOfDeposits;
    private int numberOfWithdrawals;
    private double annualInterestRate;
    private double monthlyServiceCharges;

    //constructor 
    public BankAccount(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    // method for deposite
    public void deposit(double depositAmount) {
        balance += depositAmount;
        numberOfDeposits++;
    }

    //method for withdrawal
    public void withdraw(double withdrawalAmount) {
        balance -= withdrawalAmount;
        numberOfWithdrawals++;
    }

    // method for calculating interests
    public void calcInterest() {
        double monthlyInterestRate = annualInterestRate / 12.0;
        double monthlyInterest = monthlyInterestRate * balance;
        balance += monthlyInterest;
    }

    //method for monthly process
    public void monthlyProcess() {
        balance -= monthlyServiceCharges;
        calcInterest();
        numberOfDeposits = 0;
        numberOfWithdrawals = 0;
        monthlyServiceCharges = 0;
    }

    // a setter for the Annual interest	rate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // a setter for the monthly Service Charges
    public void setMonthlyServiceCharges(double monthlyServiceCharges) {
        this.monthlyServiceCharges = monthlyServiceCharges;
    }

    // a getter for the monthly Service Charges
    public double getMonthlyServiceCharges() {
        return monthlyServiceCharges;
    }

    // a getter for balance 
    public double getBalance() {
        return balance;
    }

    // a getter for number of diposits
    public int getNumberOfDeposits() {
        return numberOfDeposits;
    }

    // a getter for number of withdrawls
    public int getNumberOfWithdrawals() {
        return numberOfWithdrawals;
    }

}
