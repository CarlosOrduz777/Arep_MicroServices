package co.edu.eci.arep;
import co.edu.eci.arep.persistence.impl.InMemoryPersistence;
import co.edu.eci.arep.service.TweetService;
import spark.Spark.*;

import static spark.Spark.*;

public class SparkWeb {
    public TweetService tweetService = new TweetService();


    public static void main(String[] args) {


        staticFileLocation("static");
        port(getPort());
        /*
        post("/tweet",(req,resp)->{

        });
        */


    }


    public static int getPort(){
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
