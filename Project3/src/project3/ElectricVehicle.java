
package project3;

public class ElectricVehicle {
    private String make;
    private String model;
    private String color;
    private double kilometersPerKilowattHour;
    private double maxKilowattHoursInBattery;
    private double currentKilowattHoursInBattery;
    
    public ElectricVehicle( String make, String model, String color, 
            double kilometersPerKilowattHour, double maxKilowattHoursInBattery){
        this.make = make;
        this.model = model;
        setColor(color);
        this.kilometersPerKilowattHour = kilometersPerKilowattHour;
        this.maxKilowattHoursInBattery = maxKilowattHoursInBattery;
        currentKilowattHoursInBattery = 0;
    }
    
    public void charge(double kilowattHours){
        if ( kilowattHours > 0 ){
            currentKilowattHoursInBattery += kilowattHours;
            
            if ( currentKilowattHoursInBattery > maxKilowattHoursInBattery){
                currentKilowattHoursInBattery = maxKilowattHoursInBattery;
            }
        }
    }
    
    public boolean drive(double kilometers){
        if ( kilometers > 0 ) {
            double kilowattHoursRequired = kilometers / kilometersPerKilowattHour;
            currentKilowattHoursInBattery -= kilowattHoursRequired;
            
            if ( currentKilowattHoursInBattery < 0 ){
                currentKilowattHoursInBattery = 0;
                return false;
            }
            return true;
        }
        return false;
    }
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public double getKilometersPerKilowattHour(){
        return kilometersPerKilowattHour;
    }
    
    public double getMaxKilowattHoursInBattery(){
        return maxKilowattHoursInBattery;
    }
    
    public double getCurrentKilowattHoursInBattery(){
        return currentKilowattHoursInBattery;
    }
}
