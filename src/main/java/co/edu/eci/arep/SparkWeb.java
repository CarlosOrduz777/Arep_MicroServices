package co.edu.eci.arep;
import co.edu.eci.arep.persistence.impl.InMemoryPersistence;
import co.edu.eci.arep.service.TweetService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import spark.Spark.*;

import java.util.stream.Collectors;

import static spark.Spark.*;

public class SparkWeb {


    public static void main(String[] args) {

        TweetService tweetService = new TweetService();
        staticFileLocation("static");
        port(getPort());
        post("/tweet",(req,resp)->{

            String myJSONString = req.body();
            JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);
            String tweet = jobj.get("tweet").toString();
            tweetService.addTweet(tweet);
            return "";
        });

        get("/stream", (req,resp)->{
            resp.type("application/json");
            String result = (String) tweetService.consultTweets().stream()
                    .map((v->String.valueOf(v)))
                    .collect(Collectors.joining("\n", "{", "}"));

            return tweetService.consultTweets().toString();
        });



    }


    public static int getPort(){
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
