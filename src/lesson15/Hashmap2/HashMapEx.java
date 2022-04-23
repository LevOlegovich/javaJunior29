package lesson15.Hashmap2;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Student student = new Student(1, "Ivan", 4);
        Student student4 = new Student(1, "Ivan", 4);


        Student student1 = new Student(2, "Elena", 2);
        Student student2 = new Student(3, "Inna", 2);
        Student student3 = new Student(4, "Egor", 4);





        Map<Student, Double> studentMap = new HashMap<>(32,75);
        studentMap.put(student,7.9);
        studentMap.put(student4,6.7);
        studentMap.putIfAbsent(student,5.0);


        System.out.println(studentMap);
        System.out.println(studentMap.get(student));
        System.out.println("**********");



    }
}
