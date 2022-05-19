package lesson21;

public class Car {
    String model;
    String color;
    Integer maxSpeed;
    Engine engine;

    public Car(String model, String color, Integer maxSpeed, Engine engine) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        long horsePower;
        public Engine(long horsePower){
            System.out.println();
            this.horsePower=horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }



}

class Test {

}
