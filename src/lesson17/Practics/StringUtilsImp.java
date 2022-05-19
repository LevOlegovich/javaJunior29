package lesson17.Practics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImp implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1==null || number2==null");
        }

        double num1;
        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1 - не число!!!");
        }

        double num2;
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number2 - не число!!!");
        }

        if (num2 == 0.0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }

        return num1 / num2;


    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {

        String regularExpressionForDouble = "((\\d)+(\\.(\\d)+)?)";
        Matcher matcher = Pattern.compile(regularExpressionForDouble).matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        return new double[0];
    }
}
