package cleanCode;

public class Cylinder {

    public static double getVolume(int radius, int height){
        double baseArea = getArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    
    private static double getPerimeter(int radius) {
    	return 2 * Math.PI  * radius;
    }
    
    private static double getArea(int radius) {
    	return Math.PI * radius * radius;
    }
}
