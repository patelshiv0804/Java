import java.util.*;

public class practical_1_3{
    public static void main(String[] args){

     Scanner sc=new Scanner(System.in);
     System.out.println("enter first number:");
     int a=sc.nextInt();
     System.out.println("enter second number:");
     int b=sc.nextInt();
     System.out.println("enter third number:");
     int c=sc.nextInt();

    int result;
    result=(a>b)?(a>c ? a:c):(b>c?b:c);
    System.out.println(result);

    
    } 
}
