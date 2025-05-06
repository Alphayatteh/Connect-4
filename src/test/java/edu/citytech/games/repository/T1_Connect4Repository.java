package edu.citytech.games.repository;

import javax.xml.crypto.Data;
import java.util.Date;

public class T1_Connect4Repository {

    public static void main(String[] args) {
        // Create an instance of Connect4Repository
        var c4 = new Connect4Repository();

        // Retrieve all Connect4 records and print them
        c4.finalAll().forEach(System.out::println);

        // Print developer's name and current date
        System.out.println("Yatteh, Alpha " + new Date());
    }
}
