package lesson5;

import java.util.Scanner;

public class ToursUtils {


    public static void printToursByMoney(String[][] tours, String moneyToTrip) {
        //moneyToTrip - 100000

        int moneyFromUser = Integer.parseInt(moneyToTrip);

        for (int i = 0; i < tours.length; i++) {
            String tourCostStr = tours[i][1];
            int tourCostInt = Integer.parseInt(tourCostStr); // преобразование в ввденной строки в целочисленное
            if ((tourCostInt > moneyFromUser - 20000) && (tourCostInt < (moneyFromUser + 20000))) {
                System.out.printf("Typ: %s, %s руб, %s, транспорт - %s, отель - %s \n",
                        tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4]);
            }
        }
    }
    //

    public static void printAverageCost(String[][] tours) {
        int summa = 0;

        for (int i = 0; i < tours.length; i++) {
            String tourCostStr = tours[i][1];
            int tourCostInt = Integer.parseInt(tourCostStr);
            summa = summa + tourCostInt;
        }
        System.out.println("Средняя стоимость тура = " + summa / tours.length);
    }


//Домашнее задание. 2 - выбор тура по стране

    public static void printCountryTour(String[][] tours) {
        System.out.println("Введите страну для поиска направления тура:");
        Scanner countryStr = new Scanner(System.in);
        String country = countryStr.nextLine();

        System.out.println("Результат поиска:");
        int n = 0; //количество стран

        for (int i = 0; i < tours.length; i++) {

            if (country.equals(tours[i][0])) {
                n++;
                System.out.printf("Typ: %s, %s руб, %s, транспорт - %s, отель - %s \n",
                        tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4]);

            }
        }

        if (n == 0) {
            System.out.println("Нет такого направления");
        }

    }


// Домашнее задание. 4 - печать средняя стоимость тура в страну...

    public static void printAveragePriceOfCountry(String[][] tours) {

        System.out.println("Введите страну для расчета средней стоимости поездки: ");
        Scanner countryStr = new Scanner(System.in);
        String country = countryStr.nextLine();

        System.out.println("Результат поиска:");
        int n = 0; //количество стран
        int summa = 0;

        for (int i = 0; i < tours.length; i++) {

            if (country.equals(tours[i][0])) {
                String tourPrice = tours[i][1];
                int tourPriceInt = Integer.parseInt(tourPrice);

                n++;
                summa = summa + tourPriceInt;
                System.out.printf("Typ: %s, %s руб, %s, транспорт - %s, отель - %s \n",
                        tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4]);

            }
        }

        if (n == 0) {
            System.out.println("Нет такого направления");
        } else {
            System.out.println("Средняя стоимость тура в направлении  " + country + " равна " + summa / n);
        }

    }

//5 - печать туры от ... дней и более.

    public static void printDayTours(String[][] tours) {
        System.out.println("Введите минимальное количество дней тура (числовое значение): ");
        Scanner scan = new Scanner(System.in);
        int daysPress = scan.nextInt();


        int numbersOfLineInt = 0;    // цифры преобразованные в число в диапазоне 0-9,по умолчанию ноль.

        for (int i = 0; i < tours.length; i++) {
            String lineDaysOfMassiv = tours[i][2];
            String numbersOfLineStr = "";      // цифры найденные в строке lineDaysOfMassiv, по умолчанию пустая строка.

            for (int j = 0; j < lineDaysOfMassiv.length(); j++) {   //поиск цифр в строке по каждому элементу строки
                String symbolString = "" + lineDaysOfMassiv.charAt(j);

                for (int k = 0; k < 10; k++) {                 //генерация цифры от 0 до 9 и его сравнение с символом строки lineDaysOfMassiv .
                    String n = String.valueOf(k);
                    if (n.equals(symbolString)) {
                        numbersOfLineStr = numbersOfLineStr + symbolString;
                    }
                }
            }

            numbersOfLineInt = Integer.parseInt(numbersOfLineStr);

            if (numbersOfLineInt >= daysPress) {
                System.out.printf("Typ: %s, %s руб, %s, транспорт - %s, отель - %s \n",
                        tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4]);
            }

        }

        if (numbersOfLineInt == 0 || numbersOfLineInt < daysPress) {
            System.out.println("Ничего не найдено (:");
        }

    }

}
