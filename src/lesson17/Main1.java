package lesson17;

public class Main1 {
    public static void main(String[] args) {
        Person person =new Person();
        try {
            person.setAge(1200);
        } catch (UncurrentAgeException2 e) {
            e.printStackTrace();
        }
        System.out.println("!!!");
    }
}
