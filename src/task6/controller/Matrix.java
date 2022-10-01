package src.task6.controller;

public class Matrix {
    public int[][] create(int[] vector){

        if (vector.length == 0)
            return new int[0][0];

        int matrixDim = vector.length;
        int[][] result = new int[matrixDim][matrixDim];
        System.arraycopy(vector, 0, result[0], 0, matrixDim);
        for (int i = 1; i < matrixDim; i++){
            System.arraycopy(result[i - 1], 1, result[i], 0, matrixDim - 1);
            result[i][matrixDim - 1] = result[i -1][0];
        }
        return result;
    }
}
