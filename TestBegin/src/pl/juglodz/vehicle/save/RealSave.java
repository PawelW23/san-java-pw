package pl.juglodz.vehicle.save;

import pl.juglodz.vehicle.Saveable;

public class RealSave implements Saveable {

    @Override
    public void save() {
        System.out.println("reale save to file");
    }

}
