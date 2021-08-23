package project3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ElectricVehicleTest {

    public ElectricVehicleTest() {
    }

    @Test
    public void testConstructor() {
        // Arrange
        String make = "Chevy";
        String model = "Bolt";
        String color = "Grey";
        double kilometersPerKilowattHour = 4.8;
        double maxKilowattHoursInBattery = 48;
        double expectedCurrentKilowattHoursInBattery = 0;

        // Act
        ElectricVehicle vehicle = new ElectricVehicle(make, model, color,
                kilometersPerKilowattHour, maxKilowattHoursInBattery);
        String actualMake = vehicle.getMake();
        String actualModel = vehicle.getModel();
        String actualColor = vehicle.getColor();
        double actualKilometersPerKilowattHour = vehicle.getKilometersPerKilowattHour();
        double actualMaxKilowattHoursInBattery = vehicle.getMaxKilowattHoursInBattery();
        double actualCurrentKilowattHoursInBattery = vehicle.getCurrentKilowattHoursInBattery();

        // Assert
        assertEquals(make, actualMake);
        assertEquals(model, actualModel);
        assertEquals(color, actualColor);
        assertEquals(kilometersPerKilowattHour, actualKilometersPerKilowattHour, .00001);
        assertEquals(maxKilowattHoursInBattery, actualMaxKilowattHoursInBattery, .00001);
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, .00001);

    }

    @Test
    public void testCharge() {
        // Arrange
        double kilometersPerKilowattHour = 4.8;
        double maxKilowattHoursInBattery = 48;
        double expectedCurrentKilowattHoursInBattery = 20;

        // Act
        ElectricVehicle vehicle = new ElectricVehicle("", "", "",
                kilometersPerKilowattHour, maxKilowattHoursInBattery);
        vehicle.charge(expectedCurrentKilowattHoursInBattery);
        double actualCurrentKilowattHoursInBattery = vehicle.getCurrentKilowattHoursInBattery();

        // assert
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, .00001);

    }

    @Test
    public void testChargeOverMax() {
        // Arrange
        double kilometersPerKilowattHour = 4.8;
        double maxKilowattHoursInBattery = 48;
        double expectedCurrentKilowattHoursInBattery = maxKilowattHoursInBattery;

        // Act
        ElectricVehicle vehicle = new ElectricVehicle("", "", "",
                kilometersPerKilowattHour, maxKilowattHoursInBattery);
        vehicle.charge(maxKilowattHoursInBattery * 2);
        double actualCurrentKilowattHoursInBattery = vehicle.getCurrentKilowattHoursInBattery();

        // assert
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, .00001);

    }

    @Test
    public void testDrive() {
        // Arrange
        double kilometersPerKilowattHour = 4.8;
        double maxKilowattHoursInBattery = 48;
        double expectedCurrentKilowattHoursInBattery = 47;

        // Act
        ElectricVehicle vehicle = new ElectricVehicle("", "", "",
                kilometersPerKilowattHour, maxKilowattHoursInBattery);
        vehicle.charge(maxKilowattHoursInBattery);
        boolean result = vehicle.drive(kilometersPerKilowattHour);
        double actualCurrentKilowattHoursInBattery = vehicle.getCurrentKilowattHoursInBattery();

        // assert
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, .00001);
        assertTrue(result);
    }
    
    @Test
    public void testDriveOverMax() {
        // Arrange
        double kilometersPerKilowattHour = 4.8;
        double maxKilowattHoursInBattery = 48;
        double expectedCurrentKilowattHoursInBattery = 0;

        // Act
        ElectricVehicle vehicle = new ElectricVehicle("", "", "",
                kilometersPerKilowattHour, maxKilowattHoursInBattery);
        vehicle.charge(maxKilowattHoursInBattery);
        boolean result = vehicle.drive(kilometersPerKilowattHour * 1000);
        double actualCurrentKilowattHoursInBattery = vehicle.getCurrentKilowattHoursInBattery();

        // assert
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, .00001);
        assertFalse(result);
    }
    
    @Test
    public void testDriveNegative() {
        // Arrange
        double kilometersPerKilowattHour = 4.8;
        double maxKilowattHoursInBattery = 48;
        double expectedCurrentKilowattHoursInBattery = maxKilowattHoursInBattery;

        // Act
        ElectricVehicle vehicle = new ElectricVehicle("", "", "",
                kilometersPerKilowattHour, maxKilowattHoursInBattery);
        vehicle.charge(maxKilowattHoursInBattery);
        boolean result = vehicle.drive(-10);
        double actualCurrentKilowattHoursInBattery = vehicle.getCurrentKilowattHoursInBattery();

        // assert
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, .00001);
        assertFalse(result);
    }

}
