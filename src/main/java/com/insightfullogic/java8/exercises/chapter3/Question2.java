package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Question2 {
    // Q3
    public static int countBandMembersInternal(List<Artist> artists) {


        return artists.stream()
                .map(artist -> artist.getMembers().count())
                .reduce(0L, (a, b) -> a + b).intValue();
//                .reduce(0L, (aLong, aLong2) -> aLong + aLong2).intValue();
//        return Exercises.replaceThisWithSolution();
    }
}
