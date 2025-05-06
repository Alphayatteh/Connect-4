package edu.citytech.games.model;

import io.micronaut.serde.annotation.Serdeable;

import java.util.Arrays;

@Serdeable
public class Connect4 {
    private int id;

    private String direction;

    private int[] numbers;

    public Connect4(int id, String direction, int[] numbers) {
        this.id = id;
        this.direction = direction;
        this.numbers = numbers;
    }

    public int getId() {
        return id;
    }

    public String getDirection() {
        return direction;
    }

    public int[] getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "Connect4{" +
                "id=" + id +
                ", direction='" + direction + '\'' +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
