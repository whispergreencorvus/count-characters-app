package com.hartmanmark.charcount.exception;

@SuppressWarnings("serial")
public class InputDataIsEmptyException extends Exception{

    public InputDataIsEmptyException(String message) {
        super(message);
    }
}
