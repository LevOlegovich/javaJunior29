package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class l12Main {

    public static void main(String[] args) {
        // int ---> Integer
        // Double ---> Double
        // char ---> Character

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);

        numbers.add(0,999);
        System.out.println(numbers);

        numbers.remove(0);
        System.out.println(numbers);

        numbers.set(0,444);
        System.out.println(numbers);


        System.out.println("****************");

        LinkedList<Integer> numbers2= new LinkedList<>();
        numbers2.add(4);
        numbers2.add(7);
        numbers2.add(9);

        numbers2.add(0,999);
        System.out.println(numbers2);

        numbers2.remove(0);
        System.out.println(numbers2);

        numbers2.set(0,444);
        System.out.println(numbers2);

    }
}
