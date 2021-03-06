package Decomposition;

public class MatrixMultyplicator {
    public static Matrix multiply(Matrix p, Matrix q) throws MatrixException {
        int v = p.getVerticalLength();
        int h = q.getHorizontalLength();
        int controlSize = p.getHorizontalLength();
        if (controlSize != q.getVerticalLength()) {
            throw new MatrixException("incompatible matrices");
        }
        Matrix result = new Matrix(v, h);
        try {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < h; j++) {
                    int value = 0;
                    for (int k = 0; k < controlSize; k++) {
                        value += p.getElement(i, k) * q.getElement(k, j);
                    }
                    result.setElement(i, j, value);
                }
            }
        } catch (MatrixException e) {
          // log: exception impossible
        }
        return result;
    }
}
