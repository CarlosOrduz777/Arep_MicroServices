package co.edu.eci.arep.Controller;


import spark.Spark.*;

import static spark.Spark.*;

public class SparkWeb {

    public static void main(String[] args){
        port(getPort());
        staticFiles.location("public");

        get("/stream",(request, response) -> {
            return "hello";
        });
    }

    public static int getPort(){
        if(System.getenv("PORT") != null){
                return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
