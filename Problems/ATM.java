import java.util.Scanner;

class ATMMachine{

    private int pin;
    private double balance;
    Scanner sc = new Scanner(System.in);

    ATMMachine(int pin, double balance){
        this.pin = pin;
        this.balance = balance;
    }

    public void changePin(int pin){
        this.pin = pin;
        System.out.println("PIN Changed Successfully...");
    }

    public void deposit(double amount){        
        this.balance = balance + amount;
        System.out.println(amount+" is Deposit Successfully.. ");
    }

    public void withdrawal(){

        System.out.println("Enter Your PIN :");
        int inputPIN = sc.nextInt();
        if (this.pin == inputPIN) {
            System.out.println("Enter Amount : ");
            int amount = sc.nextInt();
            
             if (amount > balance) {
                    System.out.println("Insuficient Balance");
                    return;
                }
                this.balance = balance - amount;

                System.out.println("Withdrawal Successfully...");
                System.out.println("Remaining Balance is "+balance);

        }
        else{
            System.out.println("Wrong PIN");
        } 
       
    }

    public void checkBalance(){
        System.out.println("Current Balance :"+this.balance);
    }
}


/**
 * ATM
 */
public class ATM {

    public static void main(String[] args) {
        

        ATMMachine atmMachine = new ATMMachine(1001, 50.25);


        atmMachine.checkBalance();

        atmMachine.withdrawal();

    }
}