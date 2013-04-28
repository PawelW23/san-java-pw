
package pl.juglodz.vehicle;

/**
 * Klasa będzie klasą bazową dla pojazdów mechanicznych, 
 * parametry będą wyświetlane przez
 * {@link String}
 * 
 * @author saramak
 */
public abstract class BaseVehicle implements Displayable {

    protected String name;
    
    public BaseVehicle(String name) {
        this.name = name;
    }
    
    
}
