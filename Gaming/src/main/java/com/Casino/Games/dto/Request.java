package com.Casino.Games.dto;

import lombok.Data;

@Data
public class Request {
       private int selectNumber;
       private int totalAmount;
       private int betAmount;
       private boolean age;
}
