// import java.util.Scanner;

// class Residency{
  
//     private String location;

//     private String rNumber;
    
//     private double areaInYard;
    
//     private double priceperyard;

//     public static int residencyCount=0;

//     public Residency (){    //default constructor
        
//         this.location = "Unknown";
//         this.rNumber = "Unknown";
//         this.areaInYard = 0.0;
//         this.pricePerYard = 0.0;
//         System.out.println("residency Default constructor: ");   
//         residencyCount++;
//     }
//        // Parameterized constructor
//     public Residency(String location, String rNumber, double areaInYard, double pricePerYard) {
//         this.location = location;
//         this.rNumber = rNumber;
//         this.areaInYard = areaInYard;
//         this.pricePerYard = pricePerYard;
//         residencyCount++;
//     }
//     public Residency(Residency r) {      //copy constructor
        
//         this.location = r.location;
//         this.rNumber = r.rNumber;
//         this.priceperyard = r.priceperyard;
//         this.areaInYard = r.areaInYard;
//         residencyCount++;
//     }

// public void setlocation(int location){
//     this.location=location;
// }
// public String getlocation(){
//     return location;
// }

// public void setrNumber(int rNumber){
//     this.rNumber=rNumber;
// }
// public String getrNumber(){
//     return rNumber;
// }

// public void setprice_per_yard(int price_per_yard){
//     this.priceperyard=price_per_yard;
// }
// public double  getpriceperyard(){
//     return priceperyard;
// }

// public void setareaInYard(int areaInYard){
//     this.areaInYard=areaInYard;
// }
// public double getareaInYard(){
//     return areaInYard;
// }

// public long calculatePriceOfResidency(){
//     return (long) (priceperyard*areaInYard);
// }

// public void printresidencyInfo(){
//         System.out.println("Location: " + location);
//         System.out.println("Residency Number: " + rNumber);
//         System.out.println("Area in Yards: " + areaInYard);
//         System.out.println("Price per Yard: $" + pricePerYard);
//         System.out.println("Total Price: $" + calculatePriceOfResidency());
// }

// public static int getTotalCount(){
//     return residencyCount;
// }

// }

//  class FurnishedResidency extends Residency{
//    private double furnitureCharge;
 
//    //default constructor
//    public FurnishedResidency(){
//      super();
//      this.furnitureCharge = 0.0;
//    }

//    //parametrized constructor
//    public FurnishedResidency(String location, String rNumber, double areaInYard, double pricePerYard, double furnitureCharge){
//     super(location, rNumber, areaInYard, pricePerYard);
//     this.furnitureCharge = furnitureCharge;
//    }

//    //override 
//    @Override

//    public long calculatePriceOfResidency() {
//         return super.calculatePriceOfResidency() + (long)furnitureCharge;
//     }


// @Override
//     public void  printresidencyInfo(){
//         super. printresidencyInfo();
//         System.out.println("Furniture Charge: $" + furnitureCharge);
//     }
// }

// class NonFurnishedResidency extends Residency{
//    public NonFurnishedResidency(){
//     super();
//    }
//   NonFurnishedResidency(String location, String rNumber, double areaInYard, double pricePerYard, double furnitureCharge){
//         super(location, rNumber, areaInYard, pricePerYard,furnitureCharge);
//     }
 
// @Override

// public long calculatePriceOfResidency() {
//         long basePrice = super.calculatePriceOfResidency();
//         double stampDuty = 0.02 * basePrice;
//         return basePrice + (long) stampDuty;
//         // return super.calculatePriceOfResidency() + (long)furnitureCharge + 0.02*;
//     }

// @Override
//     public void printresidencyInfo() {

//         super.printresidencyInfo();
//         System.out.println("Stamp Duty (2% of Total Price): $" + (0.02 * calculatePriceOfResidency()));
//     }
// }
// public class residency { 
    
//         public static void main(String[] args) {
//             Residency residency1 = new Residency("City Center", "R123", 200, 1000);
//             FurnishedResidency furnishedResidency1 = new FurnishedResidency("Suburb", "R456", 150, 1200, 500);
//             NonFurnishedResidency nonFurnishedResidency1 = new NonFurnishedResidency("Downtown", "R789", 180, 1500);
    
//             System.out.println("Total Residencies: " + Residency.getTotalCount());
//             System.out.println("\nResidency 1 Information:");
//             residency1.printResidencyInfo();
//             System.out.println("\nFurnished Residency 1 Information:");
//             furnishedResidency1.printResidencyInfo();
//             System.out.println("\nNon-Furnished Residency 1 Information:");
//             nonFurnishedResidency1.printResidencyInfo();
//         }
//     }



public class residency {
    private String location;
    private String rNumber;
    private double areaInYard;
    private double pricePerYard;
    private static int residencyCount = 0;

    // Default constructor
    public residency() {
        this.location = "Unknown";
        this.rNumber = "Unknown";
        this.areaInYard = 0.0;
        this.pricePerYard = 0.0;
        residencyCount++;
    }

    // Parameterized constructor
    public residency(String location, String rNumber, double areaInYard, double pricePerYard) {
        this.location = location;
        this.rNumber = rNumber;
        this.areaInYard = areaInYard;
        this.pricePerYard = pricePerYard;
        residencyCount++;
    }

    // Copy constructor
    public residency(Residency other) {
        this.location = other.location;
        this.rNumber = other.rNumber;
        this.areaInYard = other.areaInYard;
        this.pricePerYard = other.pricePerYard;
        residencyCount++;
    }

    // Getter and Setter methods for fields
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getrNumber() {
        return rNumber;
    }

    public void setrNumber(String rNumber) {
        this.rNumber = rNumber;
    }

    public double getAreaInYard() {
        return areaInYard;
    }

    public void setAreaInYard(double areaInYard) {
        this.areaInYard = areaInYard;
    }

    public double getPricePerYard() {
        return pricePerYard;
    }

    public void setPricePerYard(double pricePerYard) {
        this.pricePerYard = pricePerYard;
    }

    public long calculatePriceOfResidency() {
        return (long) (areaInYard * pricePerYard);
    }

    public void printResidencyInfo() {
        System.out.println("Location: " + location);
        System.out.println("Residency Number: " + rNumber);
        System.out.println("Area in Yards: " + areaInYard);
        System.out.println("Price per Yard: $" + pricePerYard);
        System.out.println("Total Price: $" + calculatePriceOfResidency());
    }

    public static int getTotalCount() {
        return residencyCount;
    }
}

 class FurnishedResidency extends Residency {
    private double furnitureCharge;

    // Default constructor
    public FurnishedResidency() {
        super();
        this.furnitureCharge = 0.0;
    }

    // Parameterized constructor
    public FurnishedResidency(String location, String rNumber, double areaInYard, double pricePerYard, double furnitureCharge) {
        super(location, rNumber, areaInYard, pricePerYard);
        this.furnitureCharge = furnitureCharge;
    }

    @Override
    public long calculatePriceOfResidency() {
        return super.calculatePriceOfResidency() + (long)furnitureCharge;
    }

    @Override
    public void printResidencyInfo() {
        super.printResidencyInfo();
        System.out.println("Furniture Charge: $" + furnitureCharge);
    }
}

 class NonFurnishedResidency extends Residency {
    // Default constructor
    public NonFurnishedResidency() {
        super();
    }

    // Parameterized constructor
    public NonFurnishedResidency(String location, String rNumber, double areaInYard, double pricePerYard) {
        super(location, rNumber, areaInYard, pricePerYard);
    }

    @Override
    public long calculatePriceOfResidency() {
        long basePrice = super.calculatePriceOfResidency();
        double stampDuty = 0.02 * basePrice;
        return basePrice + (long) stampDuty;
    }

    @Override
    public void printResidencyInfo() {
        
        super.printResidencyInfo();
        System.out.println("Stamp Duty (2% of Total Price): $" + (0.02 * calculatePriceOfResidency()));
    }
}


public class residency{
    public static void main(String[] args) {
        Residency residency1 = new Residency("City Center", "R123", 200, 1000);
        FurnishedResidency furnishedResidency1 = new FurnishedResidency("Suburb", "R456", 150, 1200, 500);
        NonFurnishedResidency nonFurnishedResidency1 = new NonFurnishedResidency("Downtown", "R789", 180, 1500);

        System.out.println("Total Residencies: " + Residency.getTotalCount());
        System.out.println("\nResidency 1 Information:");
        residency1.printResidencyInfo();
        System.out.println("\nFurnished Residency 1 Information:");
        furnishedResidency1.printResidencyInfo();
        System.out.println("\nNon-Furnished Residency 1 Information:");
        nonFurnishedResidency1.printResidencyInfo();
    }
}
