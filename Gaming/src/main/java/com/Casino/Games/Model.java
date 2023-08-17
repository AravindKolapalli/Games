package com.Casino.Games;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Model {
    private int selectNumber;
    private int totalAmount;
    private int betAmount;
    private boolean age;
}
