
package chapter6classes;

import org.junit.Test;
import static org.junit.Assert.*;


public class MugTest {
    
    public MugTest() {
    }

    @Test
    public void testColor() {
        
        // Arrange
        String expectedColor = "blue";
        Mug mug = new Mug();
        
        // Act
        mug.setColor(expectedColor);
        String actualColor = mug.getColor();
        
        // Assert
        assertEquals(expectedColor, actualColor);
    }
    
    @Test
    public void testIsThermal() {
        // Arrange
        boolean expectedThermal = true;
        Mug mug = new Mug();
        
        // Act
        mug.setIsThermal(expectedThermal);
        boolean actualThermal = mug.getIsThermal();
        
        // Assert
        assertEquals(expectedThermal, actualThermal);
    }

    @Test
    public void testAddLiquid() {
        // Arrange
        int expectedCurrentVolumeOfLiquidInMililiters = 10;
        Mug mug = new Mug();
        mug.setMaxVolumeInMililiters(expectedCurrentVolumeOfLiquidInMililiters);
        
        // Act
        mug.addLiquid(expectedCurrentVolumeOfLiquidInMililiters);
        int actualCurrentVolumeOfLiquidInMililiters = mug.getCurrentVolumeOfLiquidInMililiters();
    
        // Assert
        assertEquals(expectedCurrentVolumeOfLiquidInMililiters, actualCurrentVolumeOfLiquidInMililiters);
    }
    
    

    @Test
    public void testSpill() {
        // Arrange
        int expectedCurrentVolumeOfLiquidInMililiters = 0;
        Mug mug = new Mug();
        mug.setMaxVolumeInMililiters(10);
        mug.addLiquid(10);
        
        // Act
        mug.spill();
        int actualCurrentVolumeOfLiquidInMililiters = mug.getCurrentVolumeOfLiquidInMililiters();
    
        // Assert
        assertEquals(expectedCurrentVolumeOfLiquidInMililiters, actualCurrentVolumeOfLiquidInMililiters);
    }

    @Test
    public void testDrink() {
        // Arrange
        int expectedCurrentVolumeOfLiquidInMililiters = 5;
        Mug mug = new Mug();
        mug.setMaxVolumeInMililiters(10);
        mug.addLiquid(10);
        
        // Act
        mug.drink(5);
        int actualCurrentVolumeOfLiquidInMililiters = mug.getCurrentVolumeOfLiquidInMililiters();
    
        // Assert
        assertEquals(expectedCurrentVolumeOfLiquidInMililiters, actualCurrentVolumeOfLiquidInMililiters);
   
    }
    
}
