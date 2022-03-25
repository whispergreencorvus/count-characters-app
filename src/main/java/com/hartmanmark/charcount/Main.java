package com.hartmanmark.charcount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String enteredString;
        System.out.println("Welcome to simple char-counter application. For output input [exit]");
        Cache cache = new Cache();
        while (true) {
            System.out.print("Enter your string: ");
            enteredString = scanner.nextLine();
            if (enteredString.equalsIgnoreCase("exit")) {
                System.out.println("Bye bye");
                scanner.close();
                break;
            }
            cache.countNumbersOfCharInString(enteredString);
        }
    }
}
