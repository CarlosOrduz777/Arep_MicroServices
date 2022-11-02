package co.edu.eci.arep;
import co.edu.eci.arep.Service.TweetService;
import co.edu.eci.arep.persistence.impl.InMemoryPersistence;
import spark.Spark.*;

import static spark.Spark.*;

public class SparkWeb {
    public static TweetService tweetService = new TweetService();


    public static void main(String[] args) {

        port(getPort());
        staticFileLocation("static");
        get("/stream",(req,res)->{
            res.type("application/json");
            return tweetService.consultStream();
        });




    }


    public static int getPort(){
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
