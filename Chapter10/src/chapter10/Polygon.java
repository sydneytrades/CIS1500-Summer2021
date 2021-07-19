package chapter10;

import java.util.ArrayList;

public class Polygon {

    private int numberOfSides;
    private ArrayList<Integer> sideLengths;

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        sideLengths = new ArrayList<>();
        for (int sideIndex = 0; sideIndex < numberOfSides; sideIndex++) {
            sideLengths.add(0);
        }

        //int[] arraySideLengths = new int[numberOfSides];
    }
    
    public int getPerimeter(){
        int perimeter = 0;
        for ( int sideLength : sideLengths ){
            perimeter += sideLength;
        }
        return perimeter;
    }

    public void setSideLength(int sideIndex, int length) {
        sideLengths.set(sideIndex, length);
        //arraySideLengths[sideIndex] = length;
    }

    public int getSideLength(int sideIndex) {
        return sideLengths.get(sideIndex);
        // return arraySideLengths[sideIndex];
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }
}
