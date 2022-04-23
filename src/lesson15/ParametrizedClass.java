package lesson15;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedClass {
    public static void main(String[] args) {
        Example<Integer, Double> stringExample = new Example<>();
        List<String> strings = new ArrayList<String>();
        strings.add("Hello");
        strings.add("Hello");
        strings.add("Hello");
stringExample.printEleventCollection(strings);


    }
}


class Example<T, E> {
    T value;
    E value1;

    public void showValue() {
        System.out.println(value);
        System.out.println(value1);
    }

    public <V> void printEleventCollection(List<V> values) {
        for (V v : values) {
            System.out.println(v);
        }
    }

//    public <R,L> R mapper(L from,R to){
//
//    }
}

class Example2<T extends Number> {
    T value;


    public void showValue() {
        System.out.println(value);

    }

    public <R> void printEleventCollection(List<R> values) {
        for (R v : values) {
            System.out.println(v);
        }
    }

//    public <R,L> R mapper(L from,R to){
//
//    }
}

