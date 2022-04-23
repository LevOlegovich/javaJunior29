package lesson10.militarybase;

public class Vehicle {
    private double tank_volume;
    private double petrol_amount;

    public Vehicle() {   //CONSTRUCTOR
    }

    public Vehicle(double petrol_amount, double tank_volume) {  //CONSTRUCTOR
        this.tank_volume = tank_volume;
        this.petrol_amount = petrol_amount;
    }

    public double getTank_volume() {
        return tank_volume;
    }

    public double getPetrol_amount() {
        return petrol_amount;
    }

    public void arrive() {
        Base.people_on_base++;
        Base.vehicles_on_base++;
    }

    public boolean leave() {
        if (Base.people_on_base < 1) {
            return false;
        }
        if (Base.vehicles_on_base < 1) {
            return false;
        }

        double needs_petrol = tank_volume-petrol_amount;
        if (needs_petrol > Base.petrol_on_base) {
            return false;
        }

        Base.people_on_base--;
        Base.vehicles_on_base--;
        Base.petrol_on_base = Base.petrol_on_base - needs_petrol;

        return true;
    }
}
