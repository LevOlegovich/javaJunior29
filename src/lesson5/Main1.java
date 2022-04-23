package lesson5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String[][] tours = {{"Италия", "40000", " 7 дней", "самолет", "4 звезды"},
                {"Франция", "50000", " 5 дней", "самолет", "4 звезды"},
                {"Норвегия", "86000", " 6 дней", "автобус", "3 звезды"},
                {"Норвегия", "110000", " 7 дней", "самолет", "5 звезды"},
                {"Мальдивы", "200000", " 3 дней", "самолет", "4 звезды"},
                {"Мальдивы", "250000", " 8 дней", "автобус", "3 звезды"},
                {"Италия", "60000", " 11 дней", "самолет", "4 звезды"},
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("На какой бюджет рассчитываете");
        String moneyToTrip = scanner.nextLine();

        ToursUtils.printToursByMoney(tours, moneyToTrip);
        ToursUtils.printAverageCost(tours);

        //Домашка
        //2 - выбор тура по стране. (дома)
        //3 - печать средняя стоимость тура куда угодно. (на уроке)
        //4 - печать средняя стоимость тура в страну...(дома)
        //5 - печать туры от ... дней и более. (дома)


//                      ДЗ

        System.out.println();
        System.out.println("          Домашнее задание");

//ДЗ. Результат поиска по стране
        ToursUtils.printCountryTour(tours);

//ДЗ. Средняя стоимость тура в страну

        ToursUtils.printAveragePriceOfCountry(tours);

//ДЗ. Результат поиска по продолжительности тура
        ToursUtils.printDayTours(tours);


    }
}
