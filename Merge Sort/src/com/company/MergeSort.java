package com.company;

public class MergeSort {


    private int[] Array;
    private int[] Temp_Array;

    public MergeSort(int[] arr) {
        sort(arr);
    }

    public void sort(int[] Array) {

        this.Array = Array;
        this.Temp_Array = new int[Array.length];
        Divide(0, Array.length - 1);
    }

    public void Divide(int Lower_Index, int Higher_Index) {
        if (Lower_Index < Higher_Index) {

            int Middle = Lower_Index + (Higher_Index - Lower_Index) / 2;
            Divide(Lower_Index, Middle);
            Divide(Middle + 1, Higher_Index);
            Merge(Lower_Index, Middle, Higher_Index);
        }

    }

    public void Merge(int Lower_Index, int Middle, int Higher_Index) {
//        // same thing if we used
//        for (int i = Lower_Index; i <= Higher_Index; i++) {
//            Temp_Array[i] = Array[i];
//        }
        if (Higher_Index + 1 - Lower_Index >= 0)
            System.arraycopy(Array, Lower_Index, Temp_Array, Lower_Index, Higher_Index + 1 - Lower_Index);


        int i = Lower_Index;
        int j = Middle + 1;
        int k = Lower_Index;

        while (i <= Middle && j <= Higher_Index) {

            if (Temp_Array[i] <= Temp_Array[j]) {

                Array[k] = Temp_Array[i];
                i++;

            } else {

                Array[k] = Temp_Array[j];
                j++;
            }

            k++;
        }
        while (i <= Middle) {
            Array[k] = Temp_Array[i];
            k++;
            i++;
        }

    }

}
