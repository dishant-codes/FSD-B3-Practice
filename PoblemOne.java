
import java.util.Scanner;

public class PoblemOne {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // String username, password;

        // System.out.println("Login System");
        
        // System.out.println("Enter Username :");
        // username = scan.nextLine();

        // System.out.println("Enter Password :");
        // password = scan.nextLine();


        // if (username.equals("dishant87") && password.equals("pass")) {
        //     System.out.println("Access Granted");
        // }
        // else{
        //     System.out.println("Access Denied");
        // }


        int num = 3;

        if (num > 0) {
            System.out.println("Positive");
        }
        else if(num < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
