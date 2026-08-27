class ATMMachine {

    private double balance;
    private int accountNo;
    private int PIN;

    public ATMMachine(int accountNo, double openningBalance, int PIN){
            this.accountNo = accountNo;
            this.balance = openningBalance;
            this.PIN = PIN;
    }

    public void displayBalance(){
        System.out.println("Account Balance is : Rs."+balance+"/-");
    }


    public void withdraw(int amount, int pin) {

        if (pin == PIN) {
            if (amount > balance) {
                System.out.println("Insulficient Balance");
                return;
            }

            balance -= amount; // balance = balance - amount

            System.out.println(amount + " is Withdraw Successfully...");
        }
        else{
            System.out.println("Invalid PIN");
        }

    }

    public void deposit(int amount, int pin) {
        if (pin == PIN) {
            balance += amount;
            System.out.println(amount + " is Deposit Successfully...");
        }
        else{
            System.out.println("Invalid PIN");
        }

    }

}

public class Methodz {

    public static void main(String[] args) {

        ATMMachine account = new ATMMachine(100001, 0, 1234);

        account.deposit(500, 0);

    }
}
