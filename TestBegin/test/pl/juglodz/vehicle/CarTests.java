package pl.juglodz.vehicle;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CarTests extends TestCase {

    @Test
    public void testCarShouldHaveAName(){
        //GIVEN mam samochód o nazwie maluch   
        String expectedName = "Maluch";
        Car c = new Car("Maluch");
        //WHEN pobieram imie 
        String imieResult = c.getName();
        //THEN dostaje jego imie
        Assert.assertTrue(expectedName.equals(imieResult));
        
    }
    
}
