package OOP_pt1.Matrix;

public class main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setValue(0, 0, 1.0);
        matrix1.setValue(0, 1, 2.0);
        matrix1.setValue(1, 0, 3.0);
        matrix1.setValue(1, 1, 4.0);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setValue(0, 0, 5.0);
        matrix2.setValue(0, 1, 6.0);
        matrix2.setValue(1, 0, 7.0);
        matrix2.setValue(1, 1, 8.0);

        Matrix sumMatrix = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sumMatrix.print();

        Matrix scalarMatrix = matrix1.multiplyByScalar(2.0);
        System.out.println("Умножение первой матрицы на 2:");
        scalarMatrix.print();

        Matrix productMatrix = matrix1.multiply(matrix2);
        System.out.println("Умножение матриц:");
        productMatrix.print();

    }
}

