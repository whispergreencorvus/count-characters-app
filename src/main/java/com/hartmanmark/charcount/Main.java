package com.hartmanmark.charcount;

import java.util.Scanner;
import com.hartmanmark.charcount.exception.InputDataIsEmptyException;

public class Main {

    public static void main(String[] args) throws InputDataIsEmptyException {
        Scanner scanner = new Scanner(System.in);
        String enteredString;
        System.out.println("Welcome to simple char-counter application. For output input [exit]");
        CharCounter charCounter = new CharCounter();
        Cache cache = new Cache();
        CharCounterService charCounterService = new CharCounterService(charCounter, cache);
        while (true) {
            System.out.print("Enter your string: ");
            enteredString = scanner.nextLine();
            if (enteredString.equalsIgnoreCase("exit")) {
                System.out.println("Bye bye");
                scanner.close();
                break;
            }
            try {
                System.out.println(charCounterService.charCount(enteredString));
            } catch (InputDataIsEmptyException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
