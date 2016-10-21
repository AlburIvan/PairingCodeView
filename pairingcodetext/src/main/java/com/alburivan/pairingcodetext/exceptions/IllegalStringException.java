package com.alburivan.pairingcodetext.exceptions;



public class IllegalStringException extends Exception {


    public IllegalStringException() {}

    public IllegalStringException(String message) {
        super(message);
    }

    public IllegalStringException(Throwable cause) {
        super(cause);
    }

    public IllegalStringException(String message, Throwable cause) {
        super(message, cause);
    }

}

