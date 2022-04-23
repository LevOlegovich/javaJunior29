package lesson4;

public class Main3 {
    public static void main(String[] args) {
        //
        int[][] chees = new int[8][8];
        // вывести вторую диагональ зеркально

//первая диагональ,  сделано на уроке
        System.out.println("первая диагональ");

        for (int i = 0; i < chees.length; i++) {
            for (int j = 0; j < chees[i].length; j++) {
                if (i != j) {

                    System.out.print(chees[i][j] + " ");
                } else {

                    System.out.print("1" + " ");
                }
            }

            System.out.println();
        }

//  Домашнее задание , зеркальная диагональ
        System.out.println("Вторая диагональ,зеркальная.");

        for (int i = 0; i < chees.length; i++) {
            for (int j = 0; j < chees[i].length; j++) {
                if (i + j != chees.length - 1) {  // Формула действительна только для квадратной матрицы!

                    System.out.print(chees[i][j] + " ");
                } else {

                    System.out.print("1" + " ");
                }
            }

            System.out.println();
        }


    }
}
