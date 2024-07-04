class circle{
   
    public int radius;

    circle(){
        System.out.println("i am default constructor:");
    }

    circle(int radius){
        System.out.println("i am parametrized constructor");
        this.radius=radius;
    }

    public  double area(){
        System.out.println("volume of the circle:");
        return  Math.PI*this.radius*this.radius;
    }

}

class Cylinder extends circle{
    public int height;
    Cylinder(){
        System.out.println("i am default:");
    }

    Cylinder(int radius,int height){
        super(radius);
        System.out.println("i am constructor of cylinder");
        this.height=height;
    }
    public  double volume(){

        // System.out.println("volume of the cylinder:");
        return  Math.PI*this.radius*this.radius*this.height;
    }
}


public class practiceset_51 {
    public static void main(String[] args){
        Cylinder c1=new Cylinder(12,3);
        circle c2=new circle(12);
        // c1.volume();
        System.out.println("volume:"+c1.volume());
         System.out.println("volume:"+c2.area());

    }
    
}
