package edu.citytech.games.controller;

import edu.citytech.games.model.Connect4;
import edu.citytech.games.model.Connect4Status;
import edu.citytech.games.service.Connect4Service;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

import java.util.List;


@Controller
public class Connect4Controller {


    @Inject
    Connect4Service connect4Service;

    /*http://localhost:9215/connect4/status*/

    @Get("/connect4/status/{moves}")
    public Connect4Status getConnect4Status(String moves) {
        System.out.println(moves);

        return connect4Service.calculateWinner(moves);
    }
    @Get("/connect4/combo")
    public List<Connect4> getAllWiningCombo() {
        return connect4Service.finalAllWiningCombos();

    }

}