import java.awt.*;
import javax.swing.*;
public class practical4_4{
    public static void main(String[] args) {
        
    
    JFrame jf = new JFrame("Calculator");
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setSize(400,400);
    JPanel jp = new JPanel(new GridLayout(4,4));
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    b1=new JButton("C");
    jp.add(b1);
    b2=new JButton("0");
    jp.add(b2);
    b3=new JButton("/");
    jp.add(b3);
    b4=new JButton("=");
    jp.add(b4);
    b5= new JButton("1");
    jp.add(b5);
    b6= new JButton("2");
    jp.add(b6);
    b7= new JButton("3");
    jp.add(b7);
    b8=new JButton("+");
    jp.add(b8);
    b9= new JButton("4");
    jp.add(b9);
    b10= new JButton("5");
    jp.add(b10);
    b11= new JButton("6");
    jp.add(b11);
    b12=new JButton("-");
    jp.add(b12);
    b13= new JButton("7");
    jp.add(b13);
    b14= new JButton("8");
    jp.add(b14);
    b15= new JButton("9");
    jp.add(b15);
    b16=new JButton("*");
    jp.add(b16);
    Container c=jf.getContentPane();
    c.setLayout(new BorderLayout());
    c.add(jp,BorderLayout.CENTER);
    jf.setVisible(true);
}}

