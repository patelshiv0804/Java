class ChildThread1 extends Thread{
  public void run(){
    for(int i=1;i<11;i++){
        System.out.println("childThread1,  2 x "+ i +"= "+2*i);
    }
    try {
           Thread.sleep(500); // Sleep for 0.5 seconds
        } catch (InterruptedException e) {
                e.printStackTrace();  }
  }
}
class ChildThread2 extends Thread{
   public void run(){
    for(int i=1;i<11;i++){
        System.out.println("childThread2,  3 x "+ i +"= "+3*i);
    }
   } 
}

public class practical3_7 {
    public static void main(String[] args){
        ChildThread1 thread1 = new ChildThread1();
        ChildThread2 thread2 = new ChildThread2();

        thread1.start();

        try {
            thread1.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i=1;i<11;i++){
        System.out.println("main-thread,  4 x "+ i +"= "+4*i);
    }
    }
    
}
