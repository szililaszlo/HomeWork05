package com.company;

public class Main {

    public static void main(String[] args) {
        //teszt array
        int[] array = {6, 3, 7, 9, 55, 1, 5};
        //pédányosítás
        Sort sort = new Sort();
        //rendezés
        sort.bubbleSort(array);
        //kiíratás
        printArray(array);

        //teszt mátrix
        int matrix[][]={{50,60,55,67,70},{72,66,77,80,69}};
        //pédányosítás
        MatrixOperation matrixOperation = new MatrixOperation();
        //mátrix kiíratás
        matrixOperation.printMatrix(matrix);

    }

    //tömb kiírató metódus
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
