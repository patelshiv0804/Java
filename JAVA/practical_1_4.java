import java.util.*;
public class practical_1_4{
    public static void main(String[] args){
    int count=0;
    int con;    
    char[] vowels={'a','e','i','o','u'};
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your string:");
    String st=sc.nextLine();
    for(int i=0;i<st.length();i++){
      //it returns the character from string at specified index 
        char c = st.charAt(i);
    
        for(int j=0;j<5;j++){
            if(vowels[j]==c){
               count += 1; 
            }
            else{
                continue;
            }
            
        }
    }System.out.println("number of vowels in string:"+count);
    con = st.length() - count;
    System.out.println("number of consonents in string:"+con);
    }
}