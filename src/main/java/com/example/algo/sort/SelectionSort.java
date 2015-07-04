package com.example.algo.sort;

import static com.example.algo.util.GenericUtils.swap;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] array) {
        if (array.length == 0)
            return array;

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < array.length ; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            array = swap(array, i , min);
        }
        return array;
    }
}
