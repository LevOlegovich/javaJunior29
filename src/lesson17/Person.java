package lesson17;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws UncurrentAgeException2 {
        if (age < 0 || age > 150) {
//            throw new UncurrentAgeException("age < 0 || age > 150");
            throw new UncurrentAgeException2("age < 0 || age > 150");
        }

        this.age = age;
    }


}
