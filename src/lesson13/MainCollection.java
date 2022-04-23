package lesson13;

import java.util.ArrayList;
import java.util.HashSet;

public class MainCollection {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(3);
        a.add(1);

        a.add(1);
        a.add(2);
//   a.add(3);
        a.add(4);

        a.add(2);
        a.add(0);


        HashSet<Integer> b = new HashSet<>();

        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);

        CollectionUtilImpl utils = new CollectionUtilImpl();

        System.out.println("Исходные две коллекции a и b:   " + a + " и " + b);
        System.out.println("Результаты методов: ");
        System.out.println("1. Collection<Integer> union(a, b): " + utils.union(a, b));
        System.out.println("2. Collection<Integer> intersection(a,b): " + utils.intersection(a, b));
        System.out.println("3. Set<Integer> unionWithoutDuplicate(a,b): " + utils.unionWithoutDuplicate(a, b));
        System.out.println("4. Set<Integer> intersectionWithoutDuplicate(a,b): " + utils.intersectionWithoutDuplicate(a, b));
        System.out.println("5. Collection<Integer> difference(a,b): " + utils.difference(a, b));

    }
}
