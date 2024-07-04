class InvalidBoxException extends RuntimeException {

    public InvalidBoxException(String message) {
        super(message);
    }
}

class Box {

    private final double width;
    private final double height;
    private final double length;

    public Box(double length, double height, double width) {
        validateDimension(length);
        validateDimension(height);
        validateDimension(width);

        this.length = length;
        this.width = width;
        this.height = height;
    }

    private void validateDimension(double dimension) {
        if (dimension <= 0) {
            throw new InvalidBoxException("Dimension must be greater than zero.");
        }
    }

    public double calculateVolume() {
        return width * height * length;
    }
}

public class practical3_12 {

    public static void main(String[] args) {
        try {
            Box invalidBox = new Box(0.0, -1.0, 5.25);
            System.out.println("Invalid Box Volume: " + invalidBox.calculateVolume());
        } catch (InvalidBoxException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Box validBox = new Box(2.0, 1.0, 1.0);
        System.out.println("Valid Box Volume: " + validBox.calculateVolume());
    }
}