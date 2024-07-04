public class practical_1_2 {
    public static void main(String[] args){
       
        int marks[]={78,88,90,90,56,56};
        float sum=0;
        for(int i=0;i<marks.length;i++){
          sum = sum+marks[i];
        }
        System.out.println("YOU GOT "+(sum/600)*100+" PERCENTAGE");     
      
    }
}
