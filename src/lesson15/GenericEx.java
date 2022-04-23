package lesson15;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        List strings=new ArrayList();

        strings.add("Hello");
        strings.add(4);
        strings.add(new Car());

        for(Object string:strings){
            String s= new String();
        }

    }

}

class Car{

}
