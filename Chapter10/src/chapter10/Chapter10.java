
package chapter10;

public class Chapter10 {

    public static void main(String[] args) {
        Rectangle smallRectangle = new Rectangle();
        smallRectangle.setSideLength(0, 5);
        smallRectangle.setSideLength(1, 10);
        System.out.println("Perimeter : " + smallRectangle.getPerimeter());
        System.out.println("Area : " + smallRectangle.getArea());
        System.out.println("toString(): " + smallRectangle.toString());
        
        Rectangle bigRectangle = new Rectangle();
        bigRectangle.setSideLength(0, 25);
        bigRectangle.setSideLength(1, 30);
        System.out.println("Perimeter : " + bigRectangle.getPerimeter());
        System.out.println("Area : " + bigRectangle.getArea());
        System.out.println("toString(): " + bigRectangle.toString());
    }
    
}
