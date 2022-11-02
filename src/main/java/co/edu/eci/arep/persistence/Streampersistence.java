package co.edu.eci.arep.persistence;

import co.edu.eci.arep.model.Tweet;

import java.util.List;

public interface Streampersistence {

    public List<Tweet> getStreams();
}
