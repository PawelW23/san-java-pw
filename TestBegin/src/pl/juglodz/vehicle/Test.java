
package pl.juglodz.vehicle;

import java.util.LinkedList;
import java.util.List;

import pl.juglodz.vehicle.save.FakeSaveToFile;
import pl.juglodz.vehicle.save.RealSave;

public class Test {

    public static void main(String[] args) {
        
        List<BaseVehicle> array = new LinkedList<BaseVehicle>(); 
        Saveable realSave = new RealSave();
        Saveable fakeSave = new FakeSaveToFile();
        Car maluch = new Car("maluch");
        Car opel = new Car("opel");
        Car mercedes = new Car("mercedes");
        Bus solaris = new Bus("solaris");
        AirPlane air = new AirPlane("lot", fakeSave);
        
        array.add(maluch);
        array.add(opel);
        array.add(mercedes);
        array.add(solaris);
        array.add(air);
        for (BaseVehicle baseVehicle : array) {
            if (baseVehicle instanceof Saveable){
                Saveable s = (Saveable)baseVehicle; 
                s.save();                
            }
        }
        
         
    }
    
  
}
