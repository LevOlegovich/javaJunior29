package lesson8;

public class Pramougolnik {
    private int a;
    private int b;

    public Pramougolnik() {
    }

    public Pramougolnik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int ploshad(){

        //this -- не явный
        return this.a*this.b;
    }

    public int perimetr(){
        return (this.a+this.b)*2;
    }



    // переопределение метода
    //мы переписываем логику метода

    @Override //аннотация
    public boolean equals(Object o) {
        // о - pramougolnik2
        //   this --- pramougolnik1

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pramougolnik that = (Pramougolnik) o;  // переопределение типа ,внизходящее. занятие 2

        if (a != that.a) return false;
        return b == that.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }

    @Override
    public String toString() {
        return "Pramougolnik{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
