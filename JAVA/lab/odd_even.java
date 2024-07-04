class  odd extends Thread{
 public void run(){
   int i=0;
   for(i=0;i<50;i++){
   System.out.println("odd number:"+ (2*i)+1);
   }
 }
}


class even extends Thread{
    public void run(){
    int i=0;
   for(i=0;i<50;i++){
   System.out.println("even number:"+ 2*i);
   }
    }

}
public class odd_even {
    public static void main(String[] args){
        odd t1=new odd();
        t1.start();
        even t2=new even();
        t2.start();
    }
}
