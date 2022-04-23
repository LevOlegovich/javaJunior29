package lesson4;

import java.util.Scanner;
//автоматически импортируются
import java.lang.*;

public class Main1 {
    public static void main(String[] args) {
        //программа с пользовательским интерфейсом

        System.out.println("Выберите фигуру:");
        System.out.println("1 - квадрат");
        System.out.println("2 - круг");
        System.out.println("3 - овал");
        System.out.println("4 - прямоугольник");
        System.out.println("5 - треугольник");

        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();
        //== используется только к примитивным типам!!!

        if (figura.equals("1") || figura.equalsIgnoreCase("квадрат")) {
            System.out.println("Площадь или периметр КВАДРАТА?");
            String action = scanner.nextLine();

            System.out.println("Введите сторону квадрата:");
            String storona = scanner.nextLine();
            int a = Integer.parseInt(storona);

            if(action.equalsIgnoreCase("Площадь")){
                System.out.println("Площадь квадарата = " +(a*a));
            }else {
                System.out.println("Периметр квадрата="+(a*4));
            }

        } else if (figura.equals("2") || figura.equalsIgnoreCase("круг")) {
            System.out.println("Площадь или периметр КРУГА?");
            String action=scanner.nextLine();

            System.out.println("Введите радиус круга:");
            String storona= scanner.nextLine();
            int r=Integer.parseInt(storona);

            if(action.equals("Площадь")){
                System.out.println("Площадь квадрата = "+ (3.14*r*r));
            }else {
                System.out.println("Периметр квадрата = "+2*3.14*r);
            }

        } else if (figura.equals("3") || figura.equalsIgnoreCase("овал")) {
            System.out.println("Площадь или периметр ОВАЛА?");
            String action=scanner.nextLine();

            System.out.println("Введите полуоси овала, а и b :");
            String storona1= scanner.nextLine();
            int a=Integer.parseInt(storona1);
            String storona2 = scanner.nextLine();
            int b=Integer.parseInt(storona2);


            if(action.equals("Площадь")){
                System.out.println("Площадь овала ( Пи*a*b) = "+ (3.14*a*b));
            }else {
                System.out.println("Периметр квадрата = ");
            }

        } else if (figura.equals("4") || figura.equalsIgnoreCase("прямоуголник")) {

        } else if (figura.equals("5") || figura.equalsIgnoreCase("треугольник")) {

        } else {

        }

    }
}
