package lesson7.homeL7;

public class Circle {
    private int radiusCircle=0;
    private double areaCircle=0;
    private String color=" White (default)";

    public Circle() {
    }

    public Circle(String color) {
        this.color = color;
    }

    public int getRadiusCircle() {
        return radiusCircle;
    }

    public void setRadiusCircle(int radiusCircle) {
        this.radiusCircle = radiusCircle;
    }

    public double getAreaCircle(int radiusCircle) {
        //this.radiusCircle = radiusCircle;
        areaCircle = 3.14 *( radiusCircle * radiusCircle);
        return areaCircle;
    }



}
