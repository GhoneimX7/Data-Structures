package com.company;

public class Main {

    public static void main(String[] args) {


        int[] Array = {10, 5, 4, 20, 2, 3};
        MergeSort M = new MergeSort(Array);

        for (int j : Array) {
            System.out.print(j + "\t");
        }
    }
}
