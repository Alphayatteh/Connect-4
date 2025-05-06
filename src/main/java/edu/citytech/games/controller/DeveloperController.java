package edu.citytech.games.controller;

import edu.citytech.games.model.Developer;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DeveloperController {

    @Get("/developer")
    @Produces(MediaType.TEXT_PLAIN)
    public String developer() {
        return "yatteh, alpha";
    }


    @Get("/developer/detail")
    public Developer developerDetail() {
        String name = "yatteh, alpha";
        List<String> list = new ArrayList<>();
        list.add("HTML");
        list.add("FXML");
        list.add("JSON");

        var dev = new Developer(name, list);
        return dev;
    }

}