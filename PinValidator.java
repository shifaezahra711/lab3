package utils;

public class PinValidator {

   
    public static boolean isValid(String pin) {
        return pin.length() == 4 && pin.matches("\\d+");
    }
}
