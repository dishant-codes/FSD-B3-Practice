public class BankAccount {
    
    private int accountNumber;
    private String accountHolder;
    private int balance;


    BankAccount(int accountNumber, String accoutHolder, int balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accoutHolder;
        this.balance = balance;
    }

    public void deposit(int amount){

        if (amount < 0 ) {
            System.out.println("Deposit Should be Positive Amount");
            return;
        }

        this.balance += amount;
    }


    public void withdraw(int amount){

        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }

        this.balance -= amount;
    }

    public void checkBalance(){
        System.out.println("Account Balance :"+this.balance);
    }


    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount(1001, "Dishant", 1000000);

        System.out.print("Balance Before Withdraw :");
        account1.checkBalance();

        account1.withdraw(50000);

        System.out.print("Balance After Withdraw :");
        account1.checkBalance();

        System.out.println("-----------------------");

         System.out.print("Balance Before Deposit :");
        account1.checkBalance();

        account1.deposit(500);

        System.out.print("Balance After Deposit :");
        account1.checkBalance();



        
    }

}
