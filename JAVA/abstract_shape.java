abstract class shape{

   public String color;
    public String pattern;

    static  int countShapes;

    {
        System.out.println("Initializer block");
        countShapes++;
    }

    static int totalcount(){
        return countShapes;
    }

    abstract  double calculateArea();
    abstract  double calculatePerimeter();
    
}

class Square  extends shape{
    int x;
    Square(int x){
        this.x=x;
    }
    public void resize(int factor){
        x-=factor;
    }
    double calculateArea(){
        // System.out.println("area of square"+ (x*x));
        return x*x;
   }
    double calculatePerimeter(){
    //   System.out.println("perimeter of square:"+(4*x));
      return 4*x;
   }
 
}


class  Rectangle extends shape{
    int x;
    int y;
    
    Rectangle(int x,int y){
        this.x=x;
        this.y=y;
    }
    double calculateArea(){
        // System.out.println("area of Rectangle"+ (x*y));
        return (x*y);
   }
    double calculatePerimeter(){
        // System.out.println("area of Rectangle"+ ((2*x)+(2*y)));
        return ((2*x)+(2*y));
   }
}


class Circle extends shape{
    int r;
    Circle(int r){
        this.r=r;
    }
    public void resize(int factor){
        r-=factor;
    }
   double calculateArea(){
        // System.out.println("area of circle"+ (Math.PI*r*r));
        return Math.PI*r*r ;
   }
    double calculatePerimeter(){
        // System.out.println("area of circle"+ (2*Math.PI*r));
        return (2*Math.PI*r);
   }
}


class Triangle extends shape{
    int h;
    int w;
    Triangle(int h, int w){
        this.h=h;
        this.w=w;
    }
   double calculateArea(){
        // System.out.println("area of Triangle "+ (0.5*h*w));
        return (0.5*h*w);
   }
    double calculatePerimeter(){
        // System.out.println("area of circle"+ (h+w));
        return (h+w);
   }
}

interface Resizable(){
    void resize(int factor);
}

 public class abstract_shape{
   public static void main(String[] args){
     shape s1= new Circle(2);
     shape s2= new Square(2);
     shape s3= new Triangle(2,2);
     shape s4= new Rectangle(2,2);
    //  Resizable r=new Resizable(3) ;
      
      
      System.out.println("Total count is "+shape.totalcount());
      System.out.println(s2.calculateArea());
      System.out.println();
   }
}