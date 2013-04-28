package pl.juglodz.vehicle;

import pl.juglodz.vehicle.save.RealSave;

public class Car extends BaseVehicle implements Saveable {

    private final Saveable saveMethod;

    public Car(String name) {
        super(name);
        this.saveMethod = new RealSave();
    }
    
    @Override
    public void display() {
        System.out.println("Car " + getName());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void save() {
        saveMethod.save();
    }

   

}
