package co.edu.eci.arep.persistence;

import java.util.List;

public interface TweetPersistence {

    void addTweet(String tweet);
    List consulttweets();
}
