package co.edu.eci.arep.service;

import co.edu.eci.arep.persistence.impl.InMemoryPersistence;

public class TweetService {

    private InMemoryPersistence inMemoryPersistence = new InMemoryPersistence();

    /**
     * Metodo para añadir un tweet a la memoria
     * @param tweet que se irá añadir
     */
    public void addTweet(String tweet){
        inMemoryPersistence.addTweet(tweet);
    }
}
