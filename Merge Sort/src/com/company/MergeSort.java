package com.company;

public class MergeSort {


    private int[] array;
    private int[] tempArray;

    public MergeSort(int[] arr) {
        sort(arr);
    }

    public void sort(int[] Array) {

        this.array = Array;
        this.tempArray = new int[Array.length];
        Divide(0, Array.length - 1);
    }

    public void Divide(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {

            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            Divide(lowerIndex, middle);
            Divide(middle + 1, higherIndex);
            Merge(lowerIndex, middle, higherIndex);
        }

    }

    public void Merge(int lowerIndex, int middle, int higherIndex) {
//        // same thing if we used
//        for (int i = lowerIndex; i <= higherIndex; i++) {
//            Temp_Array[i] = Array[i];
//        }
        if (higherIndex + 1 - lowerIndex >= 0)
            System.arraycopy(array, lowerIndex, tempArray, lowerIndex, higherIndex + 1 - lowerIndex);


        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {

            if (tempArray[i] <= tempArray[j]) {

                array[k] = tempArray[i];
                i++;

            } else {

                array[k] = tempArray[j];
                j++;
            }

            k++;
        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }

    }

}
