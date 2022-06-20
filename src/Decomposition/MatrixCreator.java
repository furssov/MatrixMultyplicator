package Decomposition;

public class MatrixCreator {
    public static void fillWithRandom(Matrix matrix, int minValue, int maxValue){
        for (int i = 0; i < matrix.getVerticalLength(); i++){
            for (int j = 0; j < matrix.getHorizontalLength();j++){
                int value = (int) ((Math.random() * (maxValue - minValue)) + minValue);
                try {
                    matrix.setElement(i, j, value);
                } catch (MatrixException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
