// import javax.swing.*;
// import java.awt.*;

// public class guiframe_calcu {
//     public static void main(String[] args){
//         JFrame jf=new JFrame("basic calculator layout");

//         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         jf.setSize(400 ,400);
//         // JTextField t1=new JTextField(16);
//         JPanel jp=new JPanel(new GridLayout(5,4));
//         // jp.add(t1);
//         // new GridLayout(5,4)
//         JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
//         b1= new JButton("C");
//         jp.add(b1);
//         b2= new JButton("()");
//         jp.add(b2);
//         b3= new JButton("%");
//         jp.add(b3);
//         b4= new JButton("/");
//         jp.add(b4);
//         b5= new JButton("7");
//         jp.add(b5);
//         b6= new JButton("8");
//         jp.add(b6);
//         b7= new JButton("9");
//         jp.add(b7);
//          b8= new JButton("x");
//         jp.add(b8);
//          b9= new JButton("4");
//         jp.add(b9);
//         b10= new JButton("5");
//         jp.add(b10);
//         b11= new JButton("6");
//         jp.add(b11);
//         b12= new JButton("-");
//         jp.add(b12);
//         b13= new JButton("1");
//         jp.add(b13);
//         b14= new JButton("2");
//         jp.add(b14);
//         b15  = new JButton("3");
//         jp.add(b15);
//         b16 = new JButton("+");
//         jp.add(b16);
//         b17= new JButton("+/-");
//         jp.add(b17);
//         b18= new JButton("0");
//         jp.add(b18);
//          b19= new JButton(".");
//         jp.add(b19);
//          b20= new JButton("=");
//         jp.add(b20);

//         Container c=jf.getContentPane();
//         c.setLayout(new BorderLayout());
//         c.add(jp,BorderLayout.CENTER);
//         jf.setVisible(true);
    
//     }

// }


import javax.swing.*;
import java.awt.*;

public class guiframe_calcu {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("BoxLayout Demo");

        // Set the default close operation to exit the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel with BoxLayout along the Y-axis (vertical)
        JPanel panel = new JPanel();
        // panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create and add buttons to the panel
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        // Create another JPanel with BoxLayout along the X-axis (horizontal)
        JPanel horizontalPanel = new JPanel();
        horizontalPanel.setLayout(new BoxLayout(horizontalPanel, BoxLayout.X_AXIS));

        // Create and add buttons to the horizontal panel
        JButton hButton1 = new JButton("H Button 1");
        JButton hButton2 = new JButton("H Button 2");
        JButton hButton3 = new JButton("H Button 3");

        horizontalPanel.add(hButton1);
        horizontalPanel.add(hButton2);
        horizontalPanel.add(hButton3);

        // Add the vertical and horizontal panels to the frame's content pane
        frame.getContentPane().add(panel);
        frame.getContentPane().add(horizontalPanel);

        // Set the size of the JFrame
        frame.setSize(300, 200);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}

