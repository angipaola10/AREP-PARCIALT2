package edu.escuelaing.arep;

import com.google.gson.Gson;
import edu.escuelaing.arep.calculator.Calculator;

import static spark.Spark.*;

public class SparkServer {

     public static void main (String[] args){
        port(getPort());
        get("/asin", (req, res) ->{
            Double value = Double.valueOf(req.queryParams("value"));
            System.out.println(Math.asin(3.1416));
            res.type("application/json");
            return (new Gson()).toJson("{\"res\":" + Calculator.asin(value) +"}");
        });
         get("/log", (req, res) ->{
             Double value = Double.valueOf(req.queryParams("value"));
             res.type("application/json");
             return (new Gson()).toJson("{\"res\":" + Calculator.log(value) +"}");
         });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
