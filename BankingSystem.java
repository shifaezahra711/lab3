package banking;

import utils.PinValidator;

public class BankingSystem {
   
    private static final String storedAccountNumber = "shifa123";
    private static final String storedAccountPin = "pk0011";
    
    // Static inner class LoginProcessor to authenticate
    public static class LoginProcessor {

        
        public static boolean authenticate(String accountNumber, String pin) {
          
            return accountNumber.equals(storedAccountNumber) && pin.equals(storedAccountPin);
        }
    }
}
