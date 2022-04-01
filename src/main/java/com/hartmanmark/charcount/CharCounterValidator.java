package com.hartmanmark.charcount;

import com.hartmanmark.charcount.exception.InputDataIsEmptyException;

public class CharCounterValidator {

    public void verify(String inputString) throws InputDataIsEmptyException {
        if (inputString == null) {
            throw new NumberFormatException("Input data is null");
        }
        if (inputString.isEmpty()) {
            throw new InputDataIsEmptyException("Input string is empty. Try again. For output input [exit]");
        }
    }
}
