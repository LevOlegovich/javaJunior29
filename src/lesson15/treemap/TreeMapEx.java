package lesson15.treemap;

import lesson15.Hashmap2.Student;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        Student student = new Student(1, "Ivan", 4);
        Student student4 = new Student(1, "Ivan", 4);


        Student student1 = new Student(2, "Elena", 2);
        Student student2 = new Student(3, "Inna", 2);
        Student student3 = new Student(4, "Egor", 4);


        TreeMap<Student,Integer> treeMap=new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });


        treeMap.put(student3,4);
        treeMap.put(student1,6);
        treeMap.put(student2,4);
        treeMap.put(student4,21);
        System.out.println(treeMap);



    }
}
