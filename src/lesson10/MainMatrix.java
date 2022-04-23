package lesson10;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainMatrix {
    public static void main(String[] args) {
        double[][] nums1 = {
                {2, 1, 5, 4},
                {1, 3, 6, 6},
                {5, 6, 4, 8}
        };

        double[][] nums2 = {
                {2, 1, 5, 4},
                {1, 3, 6, 6},
                {5, 6, 4, 8}
        };

        Matrix matrix1 = new Matrix(nums1);
        Matrix matrix2 = new Matrix(nums2);
        IMatrix matrixSumm;


        System.out.println(matrix1.getRows());
        System.out.println(matrix1.getColumns());
        System.out.println(matrix1.getValueAt(0, 0));
        System.out.println("*****************************************");


        System.out.println("Матрица после замены элемента:");
        matrix1.setValueAt(0, 0, 10);
        printMatrix(matrix1);
        System.out.println("*****************************************");


        System.out.println("Сложение матриц:");
        matrixSumm = matrix2.add(matrix2);
        printMatrix(matrixSumm);        //Вывод результата после сложения
        System.out.println("*****************************************");


        System.out.println("Вычитание матриц:");
        matrixSumm = matrix2.sub(matrix2);
        printMatrix(matrixSumm);
        System.out.println("*****************************************");


    }


    private static void printMatrix(IMatrix matrixSumm) { // Метод вывода элементов матрицы
        if (matrixSumm != null) {
            for (int i = 0; i < matrixSumm.getRows(); i++) {
                for (int j = 0; j < matrixSumm.getColumns(); j++) {
                    System.out.print(" | " + matrixSumm.getValueAt(i, j));
                }
                System.out.println();
            }
        }
    }


}

