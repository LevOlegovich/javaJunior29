package lesson6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperUtils {
    public static int[][] createGameField(String level) {
        if (level.equals("1") || level.equalsIgnoreCase("Новичок")) {
            return new int[9][9];
        }

        if (level.equals("2") || level.equalsIgnoreCase("Любитель")) {
            return new int[16][16];
        }

        if (level.equals("3") || level.equalsIgnoreCase("Профессионал")) {
            return new int[30][16];
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ширина: ");
        int cols = scanner.nextInt();

        System.out.println("Высота");
        int rows = Integer.parseInt(scanner.nextLine());
        return new int[rows][cols];

    }

    public static int[][] feelRandomMine(int[][] field, int countMines) {

        for (int i = 0; i < countMines; i++) {
return fellOneMine(field);

        }
        return field;
    }

    public static int[][] fellOneMine(int[][] field) {
        int randomRow = ThreadLocalRandom.current().nextInt(0, field.length);
        int randomCol = ThreadLocalRandom.current().nextInt(0, field[0].length);

        if (field[randomRow][randomCol]!=-1){
            field[randomRow][randomCol] = -1;

        } else{
            return fellOneMine(field);

        }
        return field;

    }


    public static int countMinesByLevel(String level) {
        if (level.equals("1") || level.equalsIgnoreCase("Новичок")) {
            return 10;
        }

        if (level.equals("2") || level.equalsIgnoreCase("Любитель")) {
            return 40;
        }

        if (level.equals("3") || level.equalsIgnoreCase("Профессионал")) {
            return 99;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кол-во мин: ");
        return Integer.parseInt(scanner.nextLine());


    }


    public static void printMinesFromField(int [][] field) {
        for (int i=0; i<field.length;i++){
            for (int j=0; j<field[i].length;j++){
                if (field[i][j]==-1){
                    System.out.print("%");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
