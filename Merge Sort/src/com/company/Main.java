package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] arr = {10, 5, 4, 20, 2, 3};

        System.out.println("Before Sorting!");
        System.out.println(Arrays.toString(arr));

        new MergeSort(arr);

        System.out.println("After Sorting!");
        System.out.println(Arrays.toString(arr));
    }
}
