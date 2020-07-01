package com.github.ptrifonoff.java11.vartypes;

import java.util.function.BiFunction;

public class VarTypeInferenceInLambdas {

    public static void main(String[] args) {
        // TODO using var as lambda parameter wasn't possible with Java 11
        BiFunction<String, String, String> lambdaFunction = (var s, var s1) -> s + s1;
        System.out.println(lambdaFunction.apply("CON", "CAT"));
    }

}
