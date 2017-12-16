package com.company;

public class MatrixOperation implements IMatrixOperation {

    //2
    //mátrix kiíratás
    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //3
    //mátrix inicializálás

    public int[][] initMatrixWithRandomNumbers(int n, int m, int min, int max) {
        //új 2d-s tömb deklarálása n*m-es méretbe
        int [][] matrix = new int[n][m];
        //for cilus segítségével feltöltöm a mátrixot
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]= (int) (Math.random()* (max-min+1)+min);
            }
        }
        return matrix;
    }
}
