package co.edu.eci.arep.persistence.impl;

import co.edu.eci.arep.model.Tweet;
import co.edu.eci.arep.persistence.TweetPersistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryPersistence implements TweetPersistence {
    //Map of all tweets in system
    private Map<String, Tweet> tweets = new HashMap<>();


    public InMemoryPersistence(){

        List<String> defaultTweets = new ArrayList<>();
        /**
        String tweet1 = "Esta haciendo FRIO";
        String tweet2 = "Estamos en clase de AREP";
        String tweet3 = "Haciendo taller de microservicios";
        defaultTweets.add(tweet1);
        defaultTweets.add(tweet2);
        defaultTweets.add(tweet3);
        **/
        Tweet tweet1 = new Tweet("Esta haciendo FRIO");
        Tweet  tweet2 = new Tweet("Estamos en clase de AREP");

        tweets.put("Anonimo1:",tweet1);
        tweets.put("Anonimo2:",tweet2);

    }



    @Override
    public List consultStream() {
        System.out.printf(String.valueOf(tweets.values()));
        return new ArrayList<>(tweets.values());

    }
}
