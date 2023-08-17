package com.Casino.Games.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    private String message;
    private int winningAmount;
    private int totalAmount;
}
