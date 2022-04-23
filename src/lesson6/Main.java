package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String level= ScannerUtils.getLevelFromUser();
        int[][] field= SaperUtils.createGameField(level);
        int countMines=SaperUtils.countMinesByLevel(level);
        int [][] fieldsWithMines= SaperUtils.feelRandomMine(field,countMines);
        SaperUtils.printMinesFromField(fieldsWithMines);
    }
}
