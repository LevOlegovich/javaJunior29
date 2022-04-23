package lesson13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> strings=new TreeSet<>();
        strings.add("qqq");
        strings.add("www");
        strings.add("rrr");
        strings.add("eee");
        strings.add("www");
        strings.add("www");


        System.out.println(strings);


        // проход с помощью итератора

        for (Iterator<String> iter=strings.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }

    }
}
