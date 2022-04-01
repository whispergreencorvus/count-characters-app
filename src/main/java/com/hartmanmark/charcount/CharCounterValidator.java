package com.hartmanmark.charcount;

import com.hartmanmark.charcount.exception.InputDataIsEmptyException;
<<<<<<< HEAD

public class CharCounterValidator {

    public void verify(String inputString) throws InputDataIsEmptyException {
        if (inputString == null) {
            throw new NumberFormatException("Input data is null");
        }
        if (inputString.isEmpty()) {
            throw new InputDataIsEmptyException("Input string is empty. Try again. For output input [exit]");
=======
import com.hartmanmark.charcount.exception.InputDataIsNullException;

public class CharCounterValidator {

    public void verify(String inputString) throws InputDataIsEmptyException, InputDataIsNullException{

        if (inputString == null) {
            throw new InputDataIsNullException("Input data is null");
        }
        if (inputString.isEmpty()) {
            throw new InputDataIsEmptyException("Input string is empty");
>>>>>>> c674568511c9822678a241db75bf647e5f2ac4a5
        }
    }
}
