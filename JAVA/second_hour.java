import java.util.*;

public class second_hour {
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the second:");
       int second= sc.nextInt();
       int hours;
       int minutes;

       hours=second/3600;
       int a=second%3600;
       minutes=a/60;
       int b=a%60;
       second= b;
       System.out.println(hours+":"+minutes+":"+second);
    }
}