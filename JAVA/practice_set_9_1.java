class cylinder{

private int height;
private int radius;

public void setHeight(int height){ this.height=height;}
public void setRadius(int radius){ this.radius=radius;}
public int getRadius(){return radius;}
public int getHeight(){return height;}

public double surface(int radius , int height){
   
    int surface=3.14*radius*radius*height+ 2*3.14*height*radius;
    return surface;
}
}
public class practice_set_9_1{
    public static void main(String[] args){
       cylinder myCylinder = new cylinder();
       myCylinder.setHeight(12);
       myCylinder.setRadius(23);
       System.out.println(myCylinder.getHeight());
       System.out.println(myCylinder.getRadius());
       System.out.println("your surface area is" + surface(6,7));
    }
}