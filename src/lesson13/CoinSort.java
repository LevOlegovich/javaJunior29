package lesson13;

import java.util.Comparator;
import java.util.TreeSet;

public class CoinSort {

    public static void printCoinByMetall(TreeSet<Coin> coins) {

        TreeSet<Coin> coinsByMetall = new TreeSet<>(new SortByMetallComparator());
        coinsByMetall.addAll(coins);
        for (Coin coin : coinsByMetall) {
            System.out.println(coin);
        }

    }

    public static void printCoinByNominal(TreeSet<Coin> coins) {
        TreeSet<Coin> coinsByMetall = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if (o1.getNominal() != o2.getNominal()) {
                    return o1.getNominal() - o2.getNominal(); // или через инт компаре
                }
                if (o1.getDiametr() != o2.getDiametr()) {
                    return Double.compare(o1.getDiametr(), o2.getDiametr());
                }
                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getNominal();
                }

                if (!o1.getMetall().equals(o2.getMetall())) {
                    return o1.getMetall().compareTo(o2.getMetall());
                }

                return 0;
            }
        });
        coinsByMetall.addAll(coins);

        for (Coin coin : coinsByMetall) {
            System.out.println(coin);
        }


    }

    public static void printCoinByYearFromTo(TreeSet<Coin> coins) {

    }
}
