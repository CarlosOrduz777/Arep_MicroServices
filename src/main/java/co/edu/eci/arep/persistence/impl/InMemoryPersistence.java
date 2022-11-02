package co.edu.eci.arep.persistence.impl;

import co.edu.eci.arep.persistence.TweetPersistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryPersistence implements TweetPersistence {
    //Map of all tweets in system
    private Map<String,String> tweets = new HashMap<>();


    public InMemoryPersistence(){

        List<String> defaultTweets = new ArrayList<>();
        String tweet1 = "Esta haciendo FRIO";
        String tweet2 = "Estamos en clase de AREP";
        String tweet3 = "Haciendo taller de microservicios";
        defaultTweets.add(tweet1);
        defaultTweets.add(tweet2);
        defaultTweets.add(tweet3);

        tweets.put("Anonimo1",tweet1);
        tweets.put("Anonimo2",tweet2);
        tweets.put("Anonimo3",tweet3);
    }

    @Override
    public void addTweet(String tweet) {
        tweets.put("Anonimo",tweet);
    }
}
