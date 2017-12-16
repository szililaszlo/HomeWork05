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

    }

    //tömb kiírató metódus
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
