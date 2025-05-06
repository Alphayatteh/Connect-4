package edu.citytech.games.repository;

import edu.citytech.games.model.Connect4;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Connect4Repository {

    private static List<Connect4> List = new ArrayList<>();

    private final static String SQL = """
            select id, direction, number1, number2, number3, number4 from connect4
            """;
    //Developer Yatteh, Alpha
    static{
        try(Connection connection = new DataSourceUtilityProvider().getDataSource().getConnection();
            var stmt = connection.createStatement();
            var result = stmt.executeQuery(SQL);
        ){
            //populating the list
            while(result.next()){
                int id = result.getInt("id");
                String direction = result.getString("direction");
                int[] numbers = new int[4];
                numbers[0] = result.getInt("number1");
                numbers[1] = result.getInt("number2");
                numbers[2] = result.getInt("number3");
                numbers[3] = result.getInt("number4");
                var connect4 = new Connect4(id,direction,numbers);


                List.add(connect4);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public List<Connect4> finalAll(){
       return List;
    }
}
