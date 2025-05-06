package edu.citytech.games.service;

import edu.citytech.games.model.Connect4;
import edu.citytech.games.model.Connect4Status;
import edu.citytech.games.repository.Connect4Repository;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class Connect4Service {

    private Connect4Repository repository = new Connect4Repository();

    public Connect4Status calculateWinner(String moves){



        String[] allMoves =  moves.split("");

        /*

        NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNOXXX  NO Winner
        ONNNNNNONNNNNNONNNNNNONNNNNNNNNNNNNNNNOXXX  0,7,14,21
        XXXXNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN  0,1,2,3


        NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXXXX  38,39,40,41
        NNNNNNNNNXNNNNNNNXNNNNNNNXNNNNNNNXNNNNNNNN	9,17,25,33
        ONNNNNNONNNNNNONNNNNNONNNNNNNNNNNNNNNNNNNN	0,7,14,21
        NNNNNNNNNNNNNXNNNNNNXNNNNNNXNNNNNNXNNNNNNN	13,20,27,34
        NNNNNNNNNNONNNNNNONNNNNNONNNNNNONNNNNNNNNN	10,17,24,31
         */

        var xOrOs =allMoves[38] + allMoves[39] + allMoves[40] + allMoves[41];

        boolean isWinner = xOrOs.equals("XXXX") || xOrOs.equals("OOOO");


        if(isWinner){
            int[] winningCombo = {38,39,40,41};
            return new Connect4Status(allMoves[38],winningCombo,isWinner);

        }

        xOrOs =allMoves[0] + allMoves[7] + allMoves[14] + allMoves[21];

        isWinner = xOrOs.equals("XXXX") || xOrOs.equals("OOOO");


        if(isWinner){
            int[] winningCombo = {0,7,14,21};
            return new Connect4Status(allMoves[7],winningCombo,isWinner);

        }
        xOrOs =allMoves[0] + allMoves[1] + allMoves[2] + allMoves[3];

        isWinner = xOrOs.equals("XXXX") || xOrOs.equals("OOOO");


        if(isWinner){
            int[] winningCombo = {0,1,2,3};
            return new Connect4Status(allMoves[1],winningCombo,isWinner);

        }

        xOrOs =allMoves[9] + allMoves[17] + allMoves[25] + allMoves[33];

        isWinner = xOrOs.equals("XXXX") || xOrOs.equals("OOOO");


        if(isWinner){
            int[] winningCombo = {9,17,25,33};
            return new Connect4Status(allMoves[25],winningCombo,isWinner);

        }

        xOrOs =allMoves[13] + allMoves[20] + allMoves[27] + allMoves[34];

        isWinner = xOrOs.equals("XXXX") || xOrOs.equals("OOOO");


        if(isWinner){
            int[] winningCombo = {13,20,27,34};
            return new Connect4Status(allMoves[20],winningCombo,isWinner);

        }
        xOrOs =allMoves[10] + allMoves[17] + allMoves[24] + allMoves[31];

        isWinner = xOrOs.equals("XXXX") || xOrOs.equals("OOOO");


        if(isWinner){
            int[] winningCombo = {10,17,24,31};
            return new Connect4Status(allMoves[24],winningCombo,isWinner);

        }

        xOrOs =allMoves[0] + allMoves[1] + allMoves[2] + allMoves[3];

        isWinner = xOrOs.equals("XXXX") || xOrOs.equals("OOOO");


        if(isWinner){
            int[] winningCombo = {0,1,2,3};
            return new Connect4Status(allMoves[24],winningCombo,isWinner);

        }

        xOrOs =allMoves[2] + allMoves[10] + allMoves[18] + allMoves[26];

        isWinner = xOrOs.equals("XXXX") || xOrOs.equals("OOOO");


        if(isWinner){
            int[] winningCombo = {2,10,18,26};
            return new Connect4Status(allMoves[2],winningCombo,isWinner);

        }

        return new Connect4Status();
    }

    public List<Connect4> finalAllWiningCombos(){
        return repository.finalAll();
    }
}
