package lesson14;

import java.util.HashMap;

public class Recept {

    private String name;
    private HashMap<String, Integer> ingridients = new HashMap<>();


    public Recept(String name) {
        this.name = name;

    }


    public HashMap<String, Integer> getIngridients() {
        return ingridients;
    }

    public void putIngridients(String product, int value) {
        if (ingridients.containsKey(product)) {
            ingridients.put(product, value + ingridients.get(product));

        } else {
            ingridients.put(product, value);
        }
    }


}
