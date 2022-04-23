package lesson8;

public class Main {
    public static void main(String[] args) {
        Pramougolnik pramougolnik1 = new Pramougolnik(3, 5);
        Pramougolnik pramougolnik2 = new Pramougolnik(3, 5);
        int plPram1 = pramougolnik1.ploshad();
        System.out.println(plPram1);

        int perim2 = pramougolnik2.perimetr();
        System.out.println(perim2);
        System.out.println(pramougolnik1.equals(pramougolnik2));
       // System.out.println(pramougolnik1.equals(pramougolnik1));

        System.out.println(pramougolnik1.hashCode());
        System.out.println(pramougolnik2.hashCode());


        System.out.println(pramougolnik1.hashCode());
        System.out.println(pramougolnik1.hashCode());

        System.out.println (pramougolnik1.toString());


        //нужно создать тип:
        // овал,круг,прямоугольник,квадрат

        //фигура: название, и материал
        // от фигуры две ветки 1.круг и овал(определить наследование правильно) и 2.квадрат и прямоугольник
        

    }
}
