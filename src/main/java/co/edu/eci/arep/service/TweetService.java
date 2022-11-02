package co.edu.eci.arep.Service;

import co.edu.eci.arep.persistence.impl.InMemoryPersistence;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class TweetService {

    private InMemoryPersistence inMemoryPersistence = new InMemoryPersistence();



    public List consultStream() {
        return inMemoryPersistence.consultStream();
    }
}
