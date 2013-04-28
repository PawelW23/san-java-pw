package pl.juglodz.vehicle.save;

import pl.juglodz.vehicle.Saveable;

public class FakeSaveToFile implements Saveable {

    @Override
    public void save() {
        System.err.println("Fake save to file");
    }

}
