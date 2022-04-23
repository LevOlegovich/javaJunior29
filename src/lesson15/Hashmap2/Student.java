package lesson15.Hashmap2;

public class Student implements Comparable {

    private int id;
    private String name;
    private int course;


    public Student(int id, String name, int course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
