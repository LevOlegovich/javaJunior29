package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Fridj {

    private HashMap<String, Integer> products = new HashMap<>();

    public void putProduct(String product, int value) {

        if (products.containsKey(product)) {
            products.put(product, value + products.get(product));

        } else {
            products.put(product, value);

        }
    }

    public void prinAllProducts() {
        for (String product : products.keySet()) {
            System.out.println(product + " - " + products.get(product));
        }

    }

    public void getProduct(String product, int value) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта нет!!! - " + product);
            return;
        }

        if (products.get(product) < value) {
            System.out.println("Мы взяли только " + products.get(product) + " кг " + product);
            products.remove(product);
            return;
        }

        products.put(product, products.get(product) - value);
        System.out.println(" Взяли - " + product + ", " + value);

    }


    // Дз
    public boolean canCook(Recept recept) {

        HashMap<String, Integer> productsByRecept = recept.getIngridients();

        for (String key : productsByRecept.keySet()) {
            if (!products.containsKey(key)) {
                return false;
            }
            if (products.get(key) < productsByRecept.get(key)) {
                return false;
            }
        }

        return true;
    }


}

