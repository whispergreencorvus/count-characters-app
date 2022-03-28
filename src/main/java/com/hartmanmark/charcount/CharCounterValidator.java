package com.hartmanmark.charcount;

import com.hartmanmark.charcount.exception.InputDataIsEmptyException;
import com.hartmanmark.charcount.exception.InputDataIsNullException;

public class CharCounterValidator {

    public void verify(String inputString) throws InputDataIsEmptyException, InputDataIsNullException{

        if (inputString == null) {
            throw new InputDataIsNullException("Input data is null");
        }
        if (inputString.isEmpty()) {
            throw new InputDataIsEmptyException("Input string is empty");
        }
    }
}
