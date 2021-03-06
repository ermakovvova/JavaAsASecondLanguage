package io.github.javaasasecondlanguage.homework04.ops.reducers;

import io.github.javaasasecondlanguage.homework04.Collector;
import io.github.javaasasecondlanguage.homework04.Record;
import io.github.javaasasecondlanguage.homework04.ops.Reducer;

import java.util.Map;

/**
 * Counts sum of values in a specified column for each group and returns a single record with a sum.
 */
public class SumReducer implements Reducer {

    public SumReducer(String inputColumn, String outputColumn) {
        throw new IllegalStateException("You must implement this");
    }

    @Override
    public void apply(Record inputRecord, Collector collector, Map<String, Object> groupByEntries) {
        throw new IllegalStateException("You must implement this");
    }

    @Override
    public void signalGroupWasFinished(Collector collector, Map<String, Object> groupByEntries) {
        throw new IllegalStateException("You must implement this");
    }

}
