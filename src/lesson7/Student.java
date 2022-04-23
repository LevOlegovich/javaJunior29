package lesson7;

public class Student {
    // 1 - переменные (поля класса), характеристики объекта

    private String name;
    private String surname;
    private int age;

   // 2 - конструкторы (особый метод, который вызывется в момент создания нового объекта,
    //после слова  new


    public Student(){

    }

    public Student( int age,String name, String surname){

    }




   // 3 - методы
    public void setAge(int age){
        // явный входящий параметр - age(14)
        // неявный входящий параметр - this(student1)

        this.age=age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
