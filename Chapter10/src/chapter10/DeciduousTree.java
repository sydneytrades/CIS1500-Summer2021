package chapter10;

public class DeciduousTree extends Tree {

    private int numberOfLeaves;

    public DeciduousTree(double height, String barkColor, String leafColor) {
        // calls the Tree constructor - must be the first line
        super(height, barkColor, leafColor);
        numberOfLeaves = 0;
    }

    public void growLeaves(int numberOfLeaves) {
        if (numberOfLeaves > 0) {
            this.numberOfLeaves += numberOfLeaves;
        }
    }

    public void dropLeaves(int numberOfLeaves) {
        if (numberOfLeaves > 0) {
            this.numberOfLeaves -= numberOfLeaves;
        }
    }
    
    public int getNumberOfLeaves(){
        return numberOfLeaves;
    }
}
