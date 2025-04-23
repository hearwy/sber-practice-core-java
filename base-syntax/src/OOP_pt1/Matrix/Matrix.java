package OOP_pt1.Matrix;

public class Matrix {
    private double[][] array;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        array = new double[rows][cols];
    }

    public void setValue(int i, int j, double value) {
        if (i >= 0 && i < rows && j >= 0 && j < cols) {
            array[i][j] = value;
        } else {
            throw new IndexOutOfBoundsException("Индексы выходят за пределы матрицы.");
        }
    }

    public Matrix add(Matrix other) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setValue(i, j, this.array[i][j] + other.array[i][j]);
            }
        }
        return result;
    }

    public Matrix multiplyByScalar(double scalar) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setValue(i, j, this.array[i][j] * scalar);
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix multiply(Matrix other) {
        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                double sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.array[i][k] * other.array[k][j];
                }
                result.setValue(i, j, sum);
            }
        }
        return result;
    }
}



