package edu.citytech.games.model;

import io.micronaut.serde.annotation.Serdeable;

import java.util.List;

@Serdeable
public class Developer {
    String name;
    List<String> skills;


    public Developer(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
