import java.util.*;

class childthread extends Thread{
    
    public void run(){
    //   System.out.println("multiplication table of the number 2:");
    for(int i=1;i<=10;i++){
        System.out.println("2 * "+i+" = "+2*i);
        try{sleep(500);}
        catch(Exception kartik){
           System.out.println("jaju");
        }
        }
    }
    }

public class multithread_2 {
    public static void main(String[] args){
        childthread t1=new childthread();
        t1.start();
        
        for(int i=1;i<=10;i++){
        System.out.println("3 * "+i+" = "+3*i);
         }
        // t1.setPriority(10);
        
        try{System.out.println("current thread:");
        t1.join();
        }
        catch(Exception kartik){
            System.out.println("jaju");
        }

   
    }
}


