import java.util.*;

class child_thread1 extends Thread{
    public void run(){
    int i=0;  
    for(i=0;i<=250;i++){
        System.out.println("value name:"+i);
        System.out.println("end");
    }
} 
}

class child_thread2 implements Runnable{
    public void run(){
   int i=250;
   for(i=250;i<=500;i++){
    System.out.println("value name:"+i);
    System.out.println("end");
   }

}
}

public class thread{
    public static void main(String[] args){
        child_thread1 thread1=new child_thread1();
        thread1.start();

        child_thread2 thread2=new child_thread2();
        Thread thread = new Thread(thread2);
        
        thread.start();

        thread1.setPriority(4);
        thread.setPriority(2);
        
      for (int i=501;i<700;i++){
        System.out.println("value name:"+i);
      } 
    }
}
