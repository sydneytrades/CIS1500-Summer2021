package chapter10;

public class Tree {

    private double heightInMeters;
    private String barkColor;
    private String leafColor;
    
    public Tree( double heightInMeters, String barkColor, String leafColor){
        this.heightInMeters = heightInMeters;
        this.barkColor = barkColor;
        this.leafColor = leafColor;
    }

    public void grow(double metersToGrow) {
        if (metersToGrow > 0) {
            heightInMeters += metersToGrow;
        }
    }

    public void setLeafColor(String color) {
        leafColor = color;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public String getBarkColor() {
        return barkColor;
    }

    public String getLeafColor() {
        return leafColor;
    }
}
