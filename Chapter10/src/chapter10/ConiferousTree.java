package chapter10;

public class ConiferousTree extends Tree {

    private int numberOfCones;

    public ConiferousTree(double height, String barkColor, String leafColor) {
        // calls the Tree constructor - must be the first line
        super(height, barkColor, leafColor);
        numberOfCones = 0;
    }

    public void growCones(int numberOfCones) {
        if (numberOfCones > 0) {
            this.numberOfCones += numberOfCones;
        }
    }
    
    public void dropCones(int numberOfCones){
        if (numberOfCones > 0) {
            this.numberOfCones -= numberOfCones;
        }
    }
    
    public int getNumberOfCones(){
        return numberOfCones;
    }

}
