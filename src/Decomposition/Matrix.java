package Decomposition;

import java.util.Arrays;

public class Matrix {
   private int [][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int horizontal, int vertical) throws MatrixException {
        if (horizontal < 1 || vertical < 1) {
            throw new MatrixException("invalid data");
        } else {
            this.matrix = new int[horizontal][vertical];
        }
    }

    public int getVerticalLength(){
        return matrix.length;
    }

    public int getHorizontalLength()
    {
        return matrix[0].length;
    }

    public int getElement(int hPos, int vPos) throws MatrixException {
          if (checkRange(hPos, vPos)){
              return matrix[hPos][vPos];
          }
          else throw new MatrixException();
    }

    public void setElement(int hPos, int vPos, int value) throws MatrixException {
        if (checkRange(hPos, vPos)){
            matrix[hPos][vPos] = value;
        }
        else throw new MatrixException();

    }

    private boolean checkRange(int hPos, int vPos)  {
        if (hPos >= 0 && vPos >= 0 && hPos < matrix.length && vPos < matrix[0].length){
            return true;
        }
        else {
         return false;
        }
    }

    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder s = new StringBuilder("\nMatrix : " + matrix.length + "x"
                + matrix[0].length + "\n");
        for (int[] row : matrix) {
            for (int value : row) {
                s.append(value).append(BLANK);
            }
            s.append("\n");
        }

        return s.toString();
    }
}
