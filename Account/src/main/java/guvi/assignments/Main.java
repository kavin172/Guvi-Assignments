package guvi.assignments;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Account account = new Account();
        account.displayBalance();
        Account account1 = new Account(100.0);
        account1.displayBalance();

        account.depositAmount(1000);
        account.withdrawAmount(500);
        account.displayBalance();

    }
}