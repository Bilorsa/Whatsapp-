package org.example;

import java.io.File;
import java.util.Scanner;

import static java.lang.System.in;

public class Login {

        private String username;
        private String password;

        public Login(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public boolean authenticate(String enteredUsername, String enteredPassword) {
            // Simple string comparison for demonstration. In real applications,
            // passwords should be hashed and compared securely.
            return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
        }

        public String getWelcomeMessage(String firstName, String lastName) {
            if (firstName == null || lastName == null || firstName.isEmpty() || lastName.isEmpty()) {
                return "Welcome User, it is great to see you again.";
            } else {
                return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
            }
        }

        public String getErrorMessage() {
            return "Username or password incorrect, please try again.";
        }

        public static void main(String[] args) {

            // Example usage:
            Login login = new Login("testuser", "password123");

            String enteredUsername = "testuser";
            String enteredPassword = "password123";

            if (login.authenticate(enteredUsername, enteredPassword)) {
                String welcomeMessage = login.getWelcomeMessage("John", "Doe"); // Replace with actual names
                System.out.println(welcomeMessage);
            } else {
                System.out.println(login.getErrorMessage());
            }

        }
}
