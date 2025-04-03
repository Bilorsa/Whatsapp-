package org.example;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//The AccouctCreation class is used for the user to register the account. The user is requested to insert thier username,password and South African cellphone number.
public class AccountCreation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter South African cell phone number: ");
        String phoneNumber = scanner.nextLine(); // You can add validation for phone number format if needed

        // Validate Username
        if (isValidUsername(username)) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
        }

        // Validate Password
        if (isValidPassword(password)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, and a number.");
        }

        scanner.close();
    }

    public static boolean isValidUsername(String username) {
        if (username.length() > 5 || !username.contains("_")) {
            return false;
        }
        return true;
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasCapital = false;
        boolean hasNumber = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasCapital = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }
        return hasCapital && hasNumber;
    }

    public class PhoneNumberValidator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter South African cell phone number with country code: ");
            String phoneNumber = scanner.nextLine();

            if (isValidPhoneNumber(phoneNumber)) {
                System.out.println("Cell phone number successfully added.");
            } else {
                System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            }

            scanner.close();
        }

        public static boolean isValidPhoneNumber(String phoneNumber) {
            // Regular expression to validate South African phone number with country code
            // Assumes country code is +27 (South Africa) followed by 9 digits.
            String regex = "^\\+27\\d{9}$";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(phoneNumber);

            return matcher.matches();
        }
        }
    }
