package Controller;

import Decomposition.Matrix;
import Decomposition.MatrixCreator;
import Decomposition.MatrixException;
import Decomposition.MatrixMultyplicator;

public class Main {
    public static void main(String[] args) throws MatrixException {
        Matrix matrix1 = new Matrix(4,4);
        Matrix matrix2 = new Matrix(4,4);
        MatrixCreator.fillWithRandom(matrix1,10,1000);
        MatrixCreator.fillWithRandom(matrix2,10,1000);
        System.out.println(MatrixMultyplicator.multiply(matrix1, matrix2));
    }
}
