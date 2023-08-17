package com.Casino.Games;

import com.Casino.Games.Exception.BetterLuckNextTimeException;
import com.Casino.Games.Exception.InsufficientAmountException;
import com.Casino.Games.dto.Response;

import java.util.Random;

@org.springframework.stereotype.Service
public class Service {
    private final Random random = new Random();

    public Response gameRoulette(Integer selectNumber, int betAmount, int totalAmount, boolean age) {
        int winningAmount = 0;

        if (selectNumber == null || selectNumber == 0 || !age) {
            throw new BetterLuckNextTimeException("You must enter Valid Inputs.");
        }

        int rouletteNumber = random.nextInt(37);
        System.out.println("rouletteNumber is " + rouletteNumber);


        if (selectNumber == rouletteNumber) {
            winningAmount = betAmount * 36;
            totalAmount = winningAmount + betAmount;
        } else if (selectNumber != rouletteNumber && (totalAmount - betAmount) > 1) {
            int amount  = totalAmount - betAmount;
            return Response.builder()
                    .message("Your Number didn't match B L N T ")
                    .totalAmount(amount)
                    .winningAmount(0)
                    .build();
        } else if (selectNumber != rouletteNumber && (betAmount <= 1 || betAmount > totalAmount)) {
            return Response.builder()
                    .message("You cant bet Please Recharge. ")
                    .totalAmount(1)
                    .winningAmount(0)
                    .build();
        } return Response.builder()
                    .message("You Win ")
                    .totalAmount(totalAmount)
                    .winningAmount(winningAmount)
                    .build();
    }

    // Yet to develop
    public int thirdTime() {
        return 10;
    }
}