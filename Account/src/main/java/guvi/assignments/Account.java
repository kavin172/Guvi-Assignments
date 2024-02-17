package guvi.assignments;

public class Account {
    private double balance;
    public  Account(){
        balance = 0.0;
    }
    public  Account(double balance){
        this.balance = balance;
    }
    public void depositAmount(double amount){
        if(amount>0){
            this.balance+=amount;
        }
        else{
            System.out.println("Please add positive amount to the account");
        }
    }
    public void withdrawAmount(double amount){
        if(amount<=balance && amount>0){
            balance-=amount;
        }
        else if( amount>balance){
            System.out.println("Insufficient Balance in you account");
        }
        else{
            System.out.println("Please add positive amount to the account");
        }
    }
    public void displayBalance(){
        System.out.println("your balance is : "+balance);
    }
}
