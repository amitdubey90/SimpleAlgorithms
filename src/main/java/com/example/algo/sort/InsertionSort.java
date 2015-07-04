package com.example.algo.sort;

import static com.example.algo.util.GenericUtils.swap;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] array) {
        int sortedIndex = 0;
        while (sortedIndex != array.length - 1) {
            int compareIndex = sortedIndex;
            int currIndex = sortedIndex + 1;
            while (compareIndex >= 0) {
                if (array[currIndex] < array[compareIndex]) {
                    swap(array, currIndex, compareIndex);
                    compareIndex -= 1;
                    currIndex -= 1;
                } else {
                    break;
                }
            }
            sortedIndex += 1;
        }
        return array;
    }
}
