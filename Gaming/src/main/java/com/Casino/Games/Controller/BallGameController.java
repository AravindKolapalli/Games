package com.Casino.Games.Controller;

import com.Casino.Games.Service;
import com.Casino.Games.dto.Request;
import com.Casino.Games.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roulette")
public class BallGameController {
    @Autowired
    private Service service;

    @PostMapping(path ="/spin")
    public Response gameRoulette(@RequestBody Request request) {
        int selectNumber = request.getSelectNumber();
        int betAmount = request.getBetAmount();
        int totalAmount = request.getTotalAmount();
        boolean age = request.isAge();

        Response result = service.gameRoulette(selectNumber, betAmount, totalAmount, age);
        return result;
    }
}
