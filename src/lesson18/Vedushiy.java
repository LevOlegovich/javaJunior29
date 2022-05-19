package lesson18;

public class Vedushiy {
    public static void main(String[] args) {
        System.out.println("Начало концерта");
        Pevec1 pevec1=new Pevec1();
        pevec1.start();

        Pevec2 pevec2=new Pevec2();
        pevec2.start();

        System.out.println("конец концерта");


        while (pevec1.isAlive()){

        }




    }


}
