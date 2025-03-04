package main;

import banking.BankingSystem;
import utils.PinValidator;
import java.io.Console;

public class BankApplication {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.out.println("Console is not available. Run the program in a terminal.");
            return;
        }

        System.out.print("Enter Account Number: ");
        String accountNumber = console.readLine();

        System.out.print("Enter PIN: ");
        char[] pinArray = console.readPassword();
        String pin = new String(pinArray);

        
        if (!PinValidator.isValid(pin)) {
            System.out.println("Invalid PIN! It must be exactly 4 digits.");
            return;
        }

        // Use the BankingSystem.LoginProcessor to authenticate the user
        if (BankingSystem.LoginProcessor.authenticate(accountNumber, pin)) {
            System.out.println("Access Granted! Welcome to your account.");
        } else {
            System.out.println("Invalid Account Number or PIN.");
        }
    }
}
