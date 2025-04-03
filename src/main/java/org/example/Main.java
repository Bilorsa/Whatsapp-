package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: "); //prompts user to insert username
        String username =
                scanner.nextLine();

        System.out.print("Enter password: "); //prompts user to insert password
        String password =
                scanner.nextLine();

        String cellphoneNumber;
        while (true) {

            System.out.print("Enter cellphone number: ");
            cellphoneNumber = scanner.nextLine();

            if
            (isValidCellphoneNumbeber(cellphoneNumber)) {
                break;

            } else {
                System.out.println("Invalid cellphone number. Please try again.");
            }

            System.out.print("Account successfully created!");

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Cellphone number: " + cellphoneNumber);

        }
    }

    private static boolean isValidCellphoneNumbeber(String cellphoneNumber) {
        String pattern = "^+27[0-9] {8}$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(cellphoneNumber);
        return m.find();
    }
}
