package edu.escuelaing.arep.calculator;

import java.io.Serializable;

public class Calculator implements Serializable {

    public static Double asin(Double value){
        return Double.valueOf(Math.asin(value));
    }

    public static Double log(Double value){
        return Double.valueOf(Math.log(value));
    }
}
