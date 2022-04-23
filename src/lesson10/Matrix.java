package lesson10;

public class Matrix implements IMatrix {

    private double[][] matrix;


    public Matrix(int rows, int cols) {
        matrix = new double[rows][cols];
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    // На уроке
    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }


    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex >= this.getRows() || rowIndex < 0) {
            System.out.println("Неверный индекс строки");
            return -1;
        }

        if (colIndex >= this.getColumns() || colIndex < 0) {
            System.out.println("Неверный индекс колонки");
            return -1;
        }
        return matrix[rowIndex][colIndex];
    }


//                Дз

    ///////////////   Замена
    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex >= this.getRows() || rowIndex < 0) {
            System.out.println("Неверный индекс строки");

        }

        if (colIndex >= this.getColumns() || colIndex < 0) {
            System.out.println("Неверный индекс колонки");

        }

        if ((rowIndex < this.getRows() && rowIndex >= 0)
                && (colIndex < this.getColumns() && colIndex >= 0)) {
            matrix[rowIndex][colIndex] = value;

        } else {
            System.out.println("не удалось заменить элемент");
        }
    }

    ////////////////////  Сумма
    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        if (otherMatrix == null) {
            System.out.println("Ошибка! Аргрумент равен null");
            return null;

        }

        if (matrix.length == otherMatrix.getRows() && matrix[0].length == otherMatrix.getColumns()) {
            double[][] summ = new double[matrix.length][matrix[0].length];
            Matrix matrixNew = new Matrix(summ);

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    summ[i][j] = matrix[i][j] + otherMatrix.getValueAt(i, j);
                }

            }
            return matrixNew;

        } else {
            System.out.println("Ошибка!Неравенство размеров матриц. Сравните строки и колонки. ");
            return null;
        }
    }

    /////////////    Разность
    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (otherMatrix == null) {
            System.out.println("Ошибка! Аргрумент равен null");
            return null;

        }

        if (matrix.length == otherMatrix.getRows() && matrix[0].length == otherMatrix.getColumns()) {
            double[][] summ = new double[matrix.length][matrix[0].length];
            Matrix matrixNew = new Matrix(summ);

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    summ[i][j] = matrix[i][j] - otherMatrix.getValueAt(i, j);
                }

            }
            return matrixNew;

        } else {
            System.out.println("Ошибка!Неравенство размеров матриц. Сравните строки и колонки. ");
            return null;
        }
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {

    }
}
