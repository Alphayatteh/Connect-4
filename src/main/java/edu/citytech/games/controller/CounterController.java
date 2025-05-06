package edu.citytech.games.controller;

import edu.citytech.games.model.Counter;
import edu.citytech.games.service.CounterService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller
public class CounterController {

    @Inject
    CounterService counterService;


    @Get("/counter/ABC")
    public Counter getABC() {
        var abcCounter = counterService.getABC();
        var dev = new DeveloperController();
        return new Counter(abcCounter,"Yatteh, Alpha");
    }

    @Get("/counter/abc")
    public Counter getAbc() {
        var abcCounter = counterService.getAbc();
        var dev = new DeveloperController();
        return new Counter(abcCounter, "Yatteh, Alpha");
    }

    @Get("/counter/bothabc")
    public Counter getBoth() {
        var abcCounter = counterService.getBothABC();
        var dev = new DeveloperController();
        return new Counter(abcCounter, "Yatteh, Alpha");
    }

}