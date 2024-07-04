class practical_1_9 {
    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle
    public double calculateArea(double base, double height, String figureType) {
        if (figureType.equalsIgnoreCase("equilateral")) {
            return (Math.sqrt(3) / 4) * base * base;
        } else {
            return 0.5 * base * height;
        }
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();

        double rectangleArea = geometry.calculateArea(5.0, 10.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        double circleArea = geometry.calculateArea(7.0);
        System.out.println("Area of circle: " + circleArea);

        double triangleArea1 = geometry.calculateArea(4.0, 6.0, "equilateral");
        System.out.println("Area of equilateral triangle: " + triangleArea1);

        double triangleArea2 = geometry.calculateArea(5.0, 8.0, "scalene");
        System.out.println("Area of scalene triangle: " + triangleArea2);
    }
}
