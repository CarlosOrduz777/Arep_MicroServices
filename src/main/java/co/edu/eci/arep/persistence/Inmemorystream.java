package co.edu.eci.arep.persistence;

import co.edu.eci.arep.model.Tweet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inmemorystream implements Streampersistence{
    
    List<Tweet> streams = new ArrayList<>();

    public Inmemorystream(List<Tweet> streams) {
        Tweet tweet1 = new Tweet("holiiiii");
        streams.add(tweet1);
        Tweet tweet2 = new Tweet("holiiiii2");
        streams.add(tweet2);
        Tweet tweet3 = new Tweet("holiiiii3");
        streams.add(tweet3);
    }


    @Override
    public List<Tweet> getStreams() {
        if(streams.size() != 0) {
            return streams;
        }
        return null;
    }
}
