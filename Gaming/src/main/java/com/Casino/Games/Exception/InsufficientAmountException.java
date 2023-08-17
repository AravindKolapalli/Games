package com.Casino.Games.Exception;

public class InsufficientAmountException extends RuntimeException{
    public InsufficientAmountException(String message) {
        super(message);
    }
}
