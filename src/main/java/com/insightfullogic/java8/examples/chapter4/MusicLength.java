package com.insightfullogic.java8.examples.chapter4;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Track;

import java.util.IntSummaryStatistics;

public class MusicLength {

    public void printTackLengtStatistics(Album album) {


        IntSummaryStatistics intSummaryStatistics = album.getTracks().mapToInt(Track::getLength).summaryStatistics();
        System.out.printf("Max: %d, Min: %d, Ave: %f, Sum: %d",
                intSummaryStatistics.getMax(),
                intSummaryStatistics.getMin(),
                intSummaryStatistics.getAverage(),
                intSummaryStatistics.getSum());

    }
}
