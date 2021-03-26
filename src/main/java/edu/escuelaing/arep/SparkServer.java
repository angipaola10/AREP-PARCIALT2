package edu.escuelaing.arep;

import com.google.gson.Gson;
import edu.escuelaing.arep.calculator.Calculator;
import edu.escuelaing.arep.model.Operation;

import static spark.Spark.*;

public class SparkServer {

     public static void main (String[] args){
        port(getPort());
        get("/asin", (req, res) ->{
            Double value = Double.valueOf(req.queryParams("value"));
            res.type("application/json");
            return (new Gson()).toJson(new Operation("asin", value, Calculator.asin(value).toString()));
        });
         get("/log", (req, res) ->{
             Double value = Double.valueOf(req.queryParams("value"));
             res.type("application/json");
             return (new Gson()).toJson(new Operation("log", value, Calculator.log(value).toString()));
         });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
