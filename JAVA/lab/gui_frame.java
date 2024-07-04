import javax.swing.*;


public class gui_frame{
    public static void main(String[]args){
        JFrame frame=new JFrame("starting of the gui");

        JLabel name=new JLabel("student name:");
        name.setBounds(50,50,100,20);
        
        JLabel roll=new JLabel("roll-number:");
        roll.setBounds(50,100,100,20);

        JLabel CPI=new JLabel("student CPI:");
        CPI.setBounds(50,150,100,20);

        JLabel mail=new JLabel("E-mail:");
        mail.setBounds(50,200,100,20);

        JTextField Name=new JTextField();
        Name.setBounds(150,50,200,20);

         JTextField Roll=new JTextField();
        Roll.setBounds(150,100,200,20);
         
        JTextField cpi=new JTextField();
        cpi.setBounds(150,150,200,20);
         
        JTextField Mail=new JTextField();
        Mail.setBounds(150,200,200,20);
       
        frame.add(name);
        frame.add(Name);
        frame.add(roll);
        frame.add(Roll);
        frame.add(cpi);
        frame.add(CPI);
        frame.add(mail);
        frame.add(Mail);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
