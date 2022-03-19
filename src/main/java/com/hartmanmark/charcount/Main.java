package com.hartmanmark.charcount;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException {

        Scanner scanner = new Scanner(System.in);
        String enteredString;
        System.out.println("Welcome to simple char-counter application. For output input [exit]");
        while (true) {
            System.out.print("Enter your string: ");
            enteredString = scanner.nextLine();
            if (enteredString.equals("exit")) {
                System.out.println("Bye bye");
                scanner.close();
                break;
            }
            Printer print = new Printer();
            print.pring(enteredString);
        }
    }
}