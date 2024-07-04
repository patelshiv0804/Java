// Define the InvalidBoxException custom checked exception
class InvalidBoxException extends Exception {
    InvalidBoxException(String message) {
        super(message);
    }
}

// Define the Box class
class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) throws InvalidBoxException {
        if (length < 0 || width < 0 || height < 0) {
            throw new InvalidBoxException("Invalid dimensions: Length, width, or height cannot be less than zero.");
        }

        this.length = length;
        this.width = width;
        this.height = height;
        
    }

    
}

public class box{
    public static void main(String[] args) {
        try {
            
            Box validBox = new Box(5.0, 4.0, 3.0);
            
            Box invalidBox = new Box(-1.0, 2.0, 3.0);
        } catch (InvalidBoxException e) {
            System.out.println("Invalid Box Exception: " + e.getMessage());

        }

    }

}
