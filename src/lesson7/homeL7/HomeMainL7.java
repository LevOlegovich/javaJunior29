package lesson7.homeL7;

public class HomeMainL7 {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Green");
        Circle circle2= new Circle();
        circle1.getAreaCircle(3);

        circle2.setRadiusCircle(1);
        circle2.getAreaCircle(circle2.getRadiusCircle());

        System.out.println();


    }
}
