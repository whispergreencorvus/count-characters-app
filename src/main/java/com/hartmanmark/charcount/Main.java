package com.hartmanmark.charcount;

import java.util.Scanner;
import com.hartmanmark.charcount.exception.InputDataIsEmptyException;

import com.hartmanmark.charcount.exception.InputDataIsEmptyException;
import com.hartmanmark.charcount.exception.InputDataIsNullException;

public class Main {

<<<<<<< HEAD
    public static void main(String[] args) throws InputDataIsEmptyException {
=======
    public static void main(String[] args) throws InputDataIsEmptyException, InputDataIsNullException {
>>>>>>> c674568511c9822678a241db75bf647e5f2ac4a5

        Scanner scanner = new Scanner(System.in);
        String enteredString;
        System.out.println("Welcome to simple char-counter application. For output input [exit]");
<<<<<<< HEAD
        Cache cache = new Cache();
        CharCounterService charCounterService = new CharCounterService(cache);
=======
        CharCounterService charCounterService = new CharCounterService();
>>>>>>> c674568511c9822678a241db75bf647e5f2ac4a5
        while (true) {
            System.out.print("Enter your string: ");
            enteredString = scanner.nextLine();
            if (enteredString.equalsIgnoreCase("exit")) {
                System.out.println("Bye bye");
                scanner.close();
                break;
            }
            try {
<<<<<<< HEAD
                System.out.println(charCounterService.charCount(enteredString));
            } catch (InputDataIsEmptyException e) {
                System.err.println(e.getMessage());
=======
                charCounterService.charCount(enteredString);
            } catch (InputDataIsEmptyException | InputDataIsNullException e) {
                System.out.println(e.getMessage());
>>>>>>> c674568511c9822678a241db75bf647e5f2ac4a5
            }
        }
    }
}
