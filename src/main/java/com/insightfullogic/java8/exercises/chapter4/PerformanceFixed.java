package com.insightfullogic.java8.exercises.chapter4;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

/**
 * A Performance by some musicians - eg an Album or Gig.
 */
public interface PerformanceFixed {

    public String getName();

    public Stream<Artist> getMusicians();

    public default Stream<Artist> getAllMusicians() {
        Stream<Artist> musicians = getMusicians();
        musicians.filter(artist -> artist.isSolo())
                .flatMap(artist -> artist.getMembers());


        return getMusicians().flatMap(artist -> concat(artist.getMembers(), Stream.of(artist)));
    }

}
