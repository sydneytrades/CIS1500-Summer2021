package chapter6classes;

public class Mug {

    // list of instance attributes
    private String color;
    private int maxVolumeInMililiters;
    private int currentVolumeOfLiquidInMililiters;
    private boolean isThermal;

    // a bunch of methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        // this means my instance
        this.color = color;
    }

    private int getMaxVolumeInMililiters() {
        return maxVolumeInMililiters;
    }

    private void setMaxVolumeInMililiters(int maxVolumeInMililiters) {
        if (maxVolumeInMililiters < 0) {
            this.maxVolumeInMililiters = 0;
        } else {
            this.maxVolumeInMililiters = maxVolumeInMililiters;
        }

    }

    public int getCurrentVolumeOfLiquidInMililiters() {
        return currentVolumeOfLiquidInMililiters;
    }

    public boolean getIsThermal() {
        return isThermal;
    }

    public void setIsThermal(boolean isThermal) {
        this.isThermal = isThermal;
    }
    
    public void addLiquid(int mililitersOfLiquidToAdd){
         if (mililitersOfLiquidToAdd > 0) {
            currentVolumeOfLiquidInMililiters += mililitersOfLiquidToAdd;

            if (currentVolumeOfLiquidInMililiters > maxVolumeInMililiters) {
                currentVolumeOfLiquidInMililiters = maxVolumeInMililiters;
            }
        }
    }
    
    public void spill(){
        currentVolumeOfLiquidInMililiters = 0;
    }

    public void drink(int mililitersToDrink) {

        if (mililitersToDrink > 0) {
            currentVolumeOfLiquidInMililiters -= mililitersToDrink;

            if (currentVolumeOfLiquidInMililiters < 0) {
                currentVolumeOfLiquidInMililiters = 0;
            }
        }
    }
}
