package com.example.algo.sort;

import lombok.Data;

import static com.example.algo.util.GenericUtils.swap;

@Data
public class BubbleSort implements Sorter{

    @Override
    public int[] sort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j< array.length; j++) {
                if (array[i] > array[j]) {
                    array = swap(array, i , j);
                }
            }
        }
        return array;
    }
}
