import java.util.*;

class area_calculator{
    public int calculateArea(int length, int width){
        return length*width;
    }
    
    public double calculateArea(double radius){
        return 3.14*radius*radius;
    }

    public float calculateArea(float length){
        return length*length;
    }
}

public class method_overloading {
    public static void main(String[] args){
        area_calculator=new area_calculator();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the rectangle:");
        int length=sc.nextInt();
        System.out.println("enter the width of the rectangle:");
        int width=sc.nextInt();

        int rectangleArea=area_calculator.calculateArea(length,width);
        


    }
    
}
