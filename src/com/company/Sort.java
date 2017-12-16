package com.company;

public class Sort implements iSort {

    //buborék rendezés
    public void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                int helper;
                if (array[j] > array[j + 1]) {
                    helper = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = helper;
                }
            }
        }
    }


    public void insertionSort(int[] array) {

    }

    public void selectionSort(int[] array) {

    }

    public void mergeSort(int[] array) {

    }

    public void quickSort(int[] array) {

    }

}
