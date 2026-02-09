package bank;

/**
 *
 * @author Ranim
 */
public class SavingsAccount extends BankAccount {
    
    //fields 
    private boolean isActive;

    //constructor 
    public SavingsAccount(double balance, double annualInterestRate) {
        super(balance, annualInterestRate);
        if(super.getBalance() >= 25){
            isActive = true;
        } else {
            isActive = false;
        }           
    }
    // method for allowing withdraws
    @Override
    public void withdraw(double withdrawalAmount){
        if(isActive){
            super.withdraw(withdrawalAmount);
        }
        if (super.getBalance() < 25){
            isActive = false;
        }        
    }
    // a method for deposit process
    public void deposit(double depositAmount){
        super.deposit(depositAmount);
        if(!isActive){
            if(super.getBalance()>=25){
                isActive = true;
            } else {
                isActive = false;
            }            
        }
    }
    
    @Override
    public void monthlyProcess(){
        int count = super.getNumberOfWithdrawals();
        if(count > 4){
            super.setMonthlyServiceCharges(count-4);            
        }
        super.monthlyProcess();
        if(super.getBalance() >= 25){
            isActive = true;
        } else {
            isActive = false;
        }        
    }
}



