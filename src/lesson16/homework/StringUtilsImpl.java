package lesson16.homework;

public class StringUtilsImpl implements StringUtils {


    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        return 0;
    }


    //
    @Override
    public int[] findWord(String text, String word) throws NullPointerException {

        String[] textMassiv = text.split(" ");
        int countWord = 0;
        int[] indexOfWord = new int[textMassiv.length];

        for (int i = 0; i < textMassiv.length; i++) {
            if (textMassiv[i].equalsIgnoreCase(word)) {
                countWord++;
                indexOfWord[countWord - 1] = i + 1;
                System.out.println(" Cовпадение  в слове под номером - " + (i + 1));
            }
        }


        if (countWord == 0) {
            System.out.println(" Нет такого слова!!! ");
            return new int[0];
        }


        int[] indexOfWordFormatted = new int[countWord];


        for (int i = 0; i < indexOfWord.length; i++) {

            for (int k = 0; k < indexOfWordFormatted.length; k++) {

                if (indexOfWord[i] != 0 && indexOfWordFormatted[k] == 0) {
                    indexOfWordFormatted[k] = indexOfWord[i];
                    k = indexOfWordFormatted.length;
                }

            }

        }

        return indexOfWordFormatted;

    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }


}
