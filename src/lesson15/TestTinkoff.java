package lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestTinkoff {
    public static void main(String[] args) {

        Collection<Long> b = new HashSet<>();
        ArrayList c = new ArrayList();

        for (long k = 1; k <= 2019; k = k + 15) {
            b.add(k);

        }


        long corner = 1;
        long i = 7;
        boolean chek = true;


        System.out.println(b.size());


        do {

            if (i > 2019) {
                i = i - 2019;
            }
            corner = corner + 1;
            for (i = i; i <= 2019; i = i + 15) {
                if (b.contains(i)) {
                    System.out.println("успех " + i);
                    chek = false;
                }
                if (chek == false) {
                    System.out.println(corner);
                    System.out.println(b.size() * corner);
                    return;
                }

            }


        } while (true);


    }


}

