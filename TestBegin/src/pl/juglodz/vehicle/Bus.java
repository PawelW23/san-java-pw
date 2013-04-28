package pl.juglodz.vehicle;

public class Bus extends BaseVehicle {
    
    public Bus(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Bus " + getName());
    }

    @Override
    public String getName() {
        return name;
    }
}
