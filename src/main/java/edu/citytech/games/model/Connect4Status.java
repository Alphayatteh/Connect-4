package edu.citytech.games.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import io.micronaut.serde.annotation.Serdeable;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS;

@Serdeable
@JsonInclude(ALWAYS)
public class Connect4Status {

    private String whoWon = "N";

    private int[] winningCombination = new int[] {};

    private boolean isWinner = false;

    public Connect4Status() {
    }

    public Connect4Status(String whoWon, int[] winningCombination, boolean isWinner) {
        this.whoWon = whoWon;
        this.winningCombination = winningCombination;
        this.isWinner = isWinner;
    }

    public String getWhoWon() {
        return whoWon;
    }

    public int[] getWinningCombination() {
        return winningCombination;
    }

    public boolean isWinner() {
        return isWinner;
    }
}
