package com.cwtbatch.lesson;

import java.util.Arrays;

public class ArrayHW {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10},{11,12,13,14,15}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {

            }
            System.out.println(Arrays.toString(a[i]));
        }
    }
}