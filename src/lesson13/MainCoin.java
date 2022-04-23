package lesson13;

import java.util.HashSet;
import java.util.TreeSet;

public class MainCoin {
    public static void main(String[] args) {
        Coin coin1 = new Coin(1800,5,2.5,"Золото" );
        Coin coin2 = new Coin(1800,5,2.5,"Золото" );
        Coin coin3 = new Coin(1860,20,3,"Серебро" );
        Coin coin4 = new Coin(18200,10,7,"Олово" );
        Coin coin5 = new Coin(1900,1,2.5,"Золото" );

//        HashSet<Coin> coins=new HashSet<>();
//        coins.add(coin1);
//        coins.add(coin2);
//        coins.add(coin3);
//        coins.add(coin4);
//        coins.add(coin5);
//
//        for (Coin coi:coins){
//            System.out.println(coi);
//        }

        System.out.println("*********");

        TreeSet<Coin> coins2=new TreeSet<>();
        coins2.add(coin1);
        coins2.add(coin2);
        coins2.add(coin3);
        coins2.add(coin4);
        coins2.add(coin5);

//        for (Coin coi:coins2){
//            System.out.println(coi);
//        }

     //14
        System.out.println("***********");
        CoinSort.printCoinByMetall(coins2);

        System.out.println(coins2);
        System.out.println("**************");
        CoinSort.printCoinByNominal(coins2);
        System.out.println(coins2);

    }
}
