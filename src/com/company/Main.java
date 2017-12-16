package com.company;

public class Main {

    public static void main(String[] args) {
        //1
        //teszt array
        int[] array = {6, 3, 7, 9, 55, 1, 5};
        //pédányosítás
        Sort sort = new Sort();
        //rendezés
        sort.bubbleSort(array);
        //kiíratás
        printArray(array);

        //2
        //teszt mátrix
        int matrix[][]={{50,60,55,67,70},{72,66,77,80,69}};
        //pédányosítás
        MatrixOperation matrixOperation = new MatrixOperation();
        //mátrix kiíratás
        matrixOperation.printMatrix(matrix);

        //3
        //a véletlen számokkal inicializált mátrix kiíratása
        matrixOperation.printMatrix( matrixOperation.initMatrixWithRandomNumbers(9,5,2,9));

    }

    //tömb kiírató metódus
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
