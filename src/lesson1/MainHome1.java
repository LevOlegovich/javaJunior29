package lesson1;

public class MainHome1 {
    public static void main(String[] args) {
        int money = 1000;
        int pricePizza = 230;
        int priceGum = 26;
        double priceCandy = 2.5;

        int numberPizza=money/pricePizza;  //количество пицц
        int numberGum=money%pricePizza/priceGum;  // количество жвачек с применением остатка от деления
        int numberCandy=(int)(money%pricePizza%priceGum/priceCandy);  // приведение типа к int, количество конфет с применением остатка от деления
        double balance=money-pricePizza*numberPizza-priceGum*numberGum-priceCandy*numberCandy; // остаток денег после покупок



        System.out.println("На эти " +money+ " мы можем купить:\n" +
               "-"+numberPizza+" пиццы;\n"+
                "-"+numberGum+" конфеты;\n"+
                "-"+numberCandy+" жвачки.\n\n"+
                "Остаток денег: "+ balance);
    }
}
