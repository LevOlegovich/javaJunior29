package lesson16.homework;

import java.util.Arrays;

public class MainString {
    public static void main(String[] args) {

        StringUtilsImpl stringUtils = new StringUtilsImpl();
        String text1 = "белый красный синий желтый оранжевый синий зеленый синий серый синий ";


        int[] a;
        int[] b;

        System.out.println("Результаты: ");
        a = stringUtils.findWord(text1, "синий");
        System.out.println("int[] findWord: " + Arrays.toString(a));




    }


}
