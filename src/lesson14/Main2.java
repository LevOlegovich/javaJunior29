package lesson14;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {

        Fridj fridj = new Fridj();
        fridj.putProduct("Бананы", 2);
        fridj.putProduct("Яблоко", 4);
        fridj.putProduct("Груша", 3);
        fridj.putProduct("Бананы", 4);
        fridj.putProduct("Соль", 2);
        fridj.putProduct("Мука", 4);
        fridj.putProduct("Картофель", 1);
        fridj.putProduct("Мясо", 1);
        fridj.putProduct("Лук", 1);



        fridj.getProduct("Яблоко", 2);
        System.out.println("****************");
        fridj.prinAllProducts();
        System.out.println("****************");

      // ДЗ
        Recept recept1 = new Recept("Жаркое");

        recept1.putIngridients("Картофель", 4);
        recept1.putIngridients("Соль", 1);
        recept1.putIngridients("Мясо", 1);
        recept1.putIngridients("Лук", 2);


        System.out.println(fridj.canCook(recept1));


    }


}
