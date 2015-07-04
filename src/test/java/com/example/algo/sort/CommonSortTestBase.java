package com.example.algo.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.fail;

public class CommonSortTestBase {
    protected static Sorter sorter = new BubbleSort();
    protected int maxElement = DEFAULT_MAX_ELEMENT;

    private static final int DEFAULT_MAX_ELEMENT = 20;

    protected int[] generateRandomIntegerList(int maxElement) {
        int randomSize = new Random().nextInt(maxElement);
        List<Integer> list = new ArrayList<Integer>(randomSize);
        for (int i = 0; i < randomSize; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        int output[] = new int[list.size()];
        for (int i = 0; i < output.length; i++) {
            output[i] = list.get(i);
        }
        return output;
    }

    @Test
    public void TestSort() {
        int[] output = sorter.sort(generateRandomIntegerList(maxElement));
        for (int index = 0 ; index < output.length ; index++) {
            if (output[index] != index) {
                fail();
            }
        }
    }
}
