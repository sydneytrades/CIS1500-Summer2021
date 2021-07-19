package chapter10;

public class Rectangle extends Polygon {

    public Rectangle() {
        super(4);
    }

    @Override
    public void setSideLength(int sideIndex, int length) {
        if (sideIndex == 0 || sideIndex == 2) {
            super.setSideLength(0, length);
            super.setSideLength(2, length);
        }
        else{
            super.setSideLength(1, length);
            super.setSideLength(3, length);
        }
    }
    
    public int getArea(){
        return getSideLength(0) * getSideLength(1);
    }

}
