package lesson10.militarybase;

public class Truck extends Vehicle {

    double currentLoad; // текущая загруженность машины
    double maxLoad; //грузоподъемность

    public Truck() {

    }

    public Truck(double load, double max_load, double petrol, double max_petrol) {
        super(petrol, max_petrol);
        this.currentLoad = load;
        this.maxLoad = max_load;
    }


    public double getCurrentLoad() {
        return currentLoad;
    }

    public double getMaxLoad() {
        return maxLoad;
    }


    @Override
    public void arrive() {
        super.arrive();
        Base.goods_on_base = Base.goods_on_base + currentLoad; // учет прибывшего груза
    }

    @Override
    public boolean leave() {
        if (Base.people_on_base < 1) {
            return false;
        }
        if (Base.vehicles_on_base < 1) {
            return false;
        }

        double needs_petrol = getTank_volume() - getPetrol_amount(); //горючее для полной заправки

        if (needs_petrol > Base.petrol_on_base) {
            return false;
        }

        Base.people_on_base--;   //вычет водителя автобуса(транспорта)
        Base.vehicles_on_base--; //вычет  автобуса,так как это тоже траспортное средство
        Base.petrol_on_base = Base.petrol_on_base - needs_petrol; // остаток горючего после запраки


        double needs_goods = maxLoad;
        if (Base.goods_on_base >= needs_goods) {
            Base.goods_on_base = Base.goods_on_base - needs_goods;

        } else {
            Base.goods_on_base = 0;
        }

        return true;
    }

}
