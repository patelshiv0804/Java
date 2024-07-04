class mythre extends Thread{
   
    public mythre(String name){
        super(name);  //because thread has already this type of constructor so we have to override it 

    }
    public void run(){
        // int i=0;
        
    System.out.println("the value of this:"+ getName());
    }

}

public class multithread_74priority{
  public static void main(String[] args){
     
    mythre t1=new mythre("shiv");
    t1.start();
    mythre t2=new mythre("sh");
    t2.start();
    mythre t3=new mythre("shi");
    t3.start();

    t1.setPriority(mythre.MAX_PRIORITY);
    t2.setPriority(mythre.NORM_PRIORITY);
    t3.setPriority(mythre.MIN_PRIORITY);

    // System.out.println("the id of the name:"+t1.getId());
    
    // System.out.println("the id of the name:"+t2.getId());
    // System.out.println("the value of this:"+ t2.getName());

  }
}