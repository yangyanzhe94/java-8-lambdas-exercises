package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Advanced Exercises Question 1
 */
public class MapUsingReduce {

    public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {

//        List<O> oList = new ArrayList<>();
//        stream.forEach(i -> {
//            oList.add(mapper.apply(i));
//        });

        return stream.reduce(new ArrayList<O>(), (os, i) -> {
            ArrayList<O> os1 = new ArrayList<>(os);
            os1.add(mapper.apply(i));
            return os1;
        }, (os, os2) -> {
            ArrayList<O> os1 = new ArrayList<>(os);
            os1.addAll(os2);
            return os1;
        });

//        return oList;


//        return Exercises.replaceThisWithSolution();
    }

}
