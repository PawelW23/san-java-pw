
package pl.juglodz.vehicle;

public class AirPlane extends BaseVehicle implements Saveable {

    private final Saveable saveMethod;

    public AirPlane(String name, Saveable saveMethod) {
        super(name);
        this.saveMethod = saveMethod;
    }

    @Override
    public void save() {
        saveMethod.save();
    }

    @Override
    public void display() {
        System.out.println("AirPlane " + getName());
    }

    @Override
    public String getName() {
        return name;
    }

}
