package com.example.algo.util;

public class GenericUtils {
    public static int[] swap(int array[], int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }
}
