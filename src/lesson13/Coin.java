package lesson13;

public class Coin implements Comparable<Coin> {
    private int year;
    private int nominal;
    private double diametr;
    private String metall;

    public Coin() {
    }

    public Coin(int year, int nominal, double diametr, String metall) {
        this.year = year;
        this.nominal = nominal;
        this.diametr = diametr;
        this.metall = metall;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }


    @Override
    public String toString() {
        return "Coin{" +
                "year=" + year +
                ", nominal=" + nominal +
                ", diametr=" + diametr +
                ", metall='" + metall + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (year != coin.year) return false;
        if (nominal != coin.nominal) return false;
        if (Double.compare(coin.diametr, diametr) != 0) return false;
        return metall != null ? metall.equals(coin.metall) : coin.metall == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = year;
        result = 31 * result + nominal;
        temp = Double.doubleToLongBits(diametr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (metall != null ? metall.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Coin o) {
        //сортировка по диаметру,далее по номиналу,далее по году, далее по металлу
        //
        //

        if (this.getDiametr() != o.getDiametr()) {
            return Double.compare(this.getDiametr(), o.getDiametr());
        }
        if (this.getNominal() != o.getNominal()) {
            return this.getNominal() - o.getNominal(); // или через инт компаре
        }

        if (this.getYear() !=o.getYear()){
            return this.getYear()-o.getNominal();
        }

        if (!this.getMetall().equals(o.getMetall())){
            return this.getMetall().compareTo(o.getMetall());
        }

            return 0;
    }
}


