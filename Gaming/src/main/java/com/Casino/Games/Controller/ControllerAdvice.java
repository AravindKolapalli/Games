package com.Casino.Games.Controller;

import com.Casino.Games.Exception.BetterLuckNextTimeException;
import com.Casino.Games.Exception.InsufficientAmountException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(InsufficientAmountException.class)
    public ResponseEntity<String> handleInsufficientAmountException(InsufficientAmountException e) {
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(e.getMessage());
    }
    @ExceptionHandler(BetterLuckNextTimeException.class)
    public ResponseEntity<String> handleBetterLuckNextTimeException(BetterLuckNextTimeException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
}
