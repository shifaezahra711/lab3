import java.util.Scanner;

public class userinfo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Set your password: ");
        String savedPassword = scanner.nextLine();

        
        System.out.print("Enter your password to login: ");
        String enteredPassword = scanner.nextLine();

       
        if (enteredPassword.equals(savedPassword)) {
            System.out.println("Access Granted! Welcome.");
        } else {
            System.out.println("Access Denied! Incorrect password.");
        }

        scanner.close();
    }
}