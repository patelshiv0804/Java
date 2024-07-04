import java.util.Scanner;

class Property{

    private String location;

    private String propertyId;

    private double  areaInYard;

    private double price_per_yard;

    private static int Propertycount=0;
    
    Property(){
        this.location="null";

        this.propertyId="null";

        this.areaInYard=0.0;

        this.price_per_yard=0.0;

        Propertycount++;
    }

    Property(String location,String propertyId,int areaInYard,int price_per_yard){
        this.location=location;
        this.propertyId=propertyId;
        this.areaInYard=areaInYard;
        this.price_per_yard=price_per_yard;
        Propertycount++;
    }
 
    Property(Property py){
        this.location=py.location;
        this.propertyId=py.propertyId;
        this.areaInYard=py.areaInyard;
        this.price_per_yard=py.price_per_yard;
        Propertycount++;
    }

    public void setlocation(String location){
        this.location=location;
    }

    public  String getlocation(){
        return location;
    }

    public void setpropertyId(String propertyId){
        this.propertyId=propertyId;
    }
 
    public String getpropertyId(){
        return propertyId;
    }
    
    public void setareaInYard(double setareaInYard){
        this.setareaInYard=setareaInYard
    }

    public double getareaInYard(){
        return areaInYard;
    }

    public void setprice_per_yard(double price_per_yard){
        this.price_per_yard=price_per_yard;
    }
    
    public double getprice_per_yard(){
        return price_per_yard;
    }

    long calculatePriceOfProperty(){
        return areaInYard*price_per_yard;
    }

    public void printPropertyInfo(){
        System.out.println("location is :"+location);
        System.out.println("propertyId is :"+propertyId);
        System.out.println("areaInYard is :"+areaInYard);
        System.out.println("price_per_yard is :"+price_per_yard);
        System.out.println("total price of property is:"+ calculatePriceOfProperty())
    }
    
    public static int getpropertycount() {
        return propertycount;
    }
}

class FurnishedHome extends Property {

  private double furnitureCharge;

  FurnishedHome(){
    super();
    this.furnitureCharge=0;
  }

  FurnishedHome(String location,String propertyId,int areaInYard,int price_per_yard){

    super(Location,propertyId,areaInYard,price_per_yard)
    this.furnitureCharge=furnitureCharge;
  }

  @override
  
  public Long calculatePriceOfProperty(){
       long basePrice = super.calculatePriceOfProperty();
        double stampDuty = 0.05 * basePrice;
        return basePrice + (long) stampDuty;
  }

  @override

  public void printPropertyInfo(){
    super.printPropertyInfo();
    System.out.println("furniture charge is:"+ furnitureCharge)
  }

}

class shop extends Property{
    public  shop(){
      super();  
    }
 
    public shop(String location,String propertyId,int areaInYard,int price_per_yard){
        super(Location,propertyId,areaInYard,price_per_yard)
    }

    @override

    public Long calculatePriceOfProperty(){
        long basePrice = super.calculatePriceOfProperty();
        double stampDuty = 0.04 * basePrice;
        return basePrice + (long)stampDuty;
    }

}

public class property{
    
    public static void main(String[] args){
        Property[] p=new Property[3];

        p[0] = new FurnishedHome("Residential Area", "r1", 100, 50, 5000);
        p[1] = new Shop("Commercial Area", "r2", 80, 100);
        p[2] = new Property("Suburban Area","r3", 40, 140);


    }
}