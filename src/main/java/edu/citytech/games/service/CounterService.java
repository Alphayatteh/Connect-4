package edu.citytech.games.service;

import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class CounterService {
    public List<String> getABC(){

        int charSize = 'Z' - 'A' + 1;
        List<String> alpha = new ArrayList<>(charSize);

        for(int i = 0; i < charSize; i++){
            var abc=(char)('A' + i) + "";
            alpha.add(abc);
        }
        return alpha;
    }

    public List<String> getAbc(){

        int charSize = 'z' - 'a' + 1;
        List<String> alpha = new ArrayList<>(charSize);

        for(int i = 0; i < charSize; i++){
            var abc=(char)('a' + i) + "";
            alpha.add(abc);
        }
        return alpha;
    }
    public List<String> getBothABC(){
        var abc = this.getAbc();
        var upperABC = this.getABC();
        abc.addAll(upperABC);
        return abc;
    }
}
