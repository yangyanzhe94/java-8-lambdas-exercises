package com.insightfullogic.java8.exercises.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Advanced Exercises Question 2
 */
public class FilterUsingReduce {

    public static <I> List<I> filter(Stream<I> stream, Predicate<I> predicate) {
        List<I> initial = new ArrayList<>();

        return stream.reduce(initial, (is, i) -> {

            if (predicate.test(i)) {
                ArrayList<I> is1 = new ArrayList<>(is);
                is1.add(i);
                return is1;
            }

            return is;
        }, FilterUsingReduce::combineLists);


//        return Exercises.replaceThisWithSolution();
    }


    private static <E> List<E> combineLists(List<E> is, List<E> is2) {
        ArrayList<E> os1 = new ArrayList<>(is);
        os1.addAll(is2);
        return os1;
    }

}
