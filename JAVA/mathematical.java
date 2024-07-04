import java.util.*;

public class mathematical {
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first number:");
        float a=sc.nextFloat();
        
    
        System.out.println("enter your second number:");
        float b=sc.nextFloat();

        System.out.println("addition of two number:"+(a+b));
        if(a>b){
           System.out.println("subtraction of two number:"+(a-b));
        }
        else{
            System.out.println("subtraction of two number:"+(b-a));
        }

        System.out.println("multiplication of two number:"+ (a*b));
        
        if(a>b){
            System.out.println("division of two number:"+(a/b));
        }
        else{
            System.out.println("please enter small number in b than a for division");
        }2 
    }
}
