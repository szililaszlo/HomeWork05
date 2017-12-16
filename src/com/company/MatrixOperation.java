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

    ///kitöltve valamivel hogy lefusson az előző 2-es feladat
    public int[][] initMatrixWithRandomNumbers(int n, int m, int min, int max) {
        int a[][] = new int[][]{{1}, {2}};
        return a;
    }
}
