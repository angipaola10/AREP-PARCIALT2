package edu.escuelaing.arep.calculator;

public class Calculator {

    public static String asin(Double value){
        return "{\"res\":" + Math.asin(value) +"}";
    }

    public static String log(Double value){
        return "{\"res\":" + Math.log(value) +"}";
    }
}
