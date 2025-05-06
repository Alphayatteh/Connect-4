package edu.citytech.games.model;

import io.micronaut.serde.annotation.Serdeable;

import java.util.List;

@Serdeable
public class Counter {
    List<String> results;

    String developer;

    public Counter() {
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Counter(List<String> results, String developer) {
        this.results = results;
        this.developer = developer;
    }

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }


}
