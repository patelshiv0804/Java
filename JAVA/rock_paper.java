import java.util.Scanner;
import java.util.Random;

public class rock_paper{
    public static void main(String[] args){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for rock,1 for paper,2 for scsior:");
        int userInput=sc.nextInt();

        Random random=new Random(System.in);
        int computerInput=random.nextInt();

        if(computerInput==userInput){
            System.out.println("error");
        }
        else if((userInput==0 && computerInput==2) || (userInput==2 && computerInput==1) || (userInput==1 && computerInput==0)){
            System.out.println("you win");
        }
        else{
            System.out.println("computer win");
        }
        
    }
}