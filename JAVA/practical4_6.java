import javax.swing.*;
import java.awt.*;

public class practical4_6{
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("BoxLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a panel with vertical BoxLayout
        JPanel verticalPanel = new JPanel();
        verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));

        // Create labels and add them to the vertical panel
        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");
        JLabel label3 = new JLabel("Label 3");

        verticalPanel.add(label1);
        verticalPanel.add(label2);
        verticalPanel.add(label3);

        // Create a panel with horizontal BoxLayout
        JPanel horizontalPanel = new JPanel();
        horizontalPanel.setLayout(new BoxLayout(horizontalPanel, BoxLayout.X_AXIS));

        // Create buttons and add them to the horizontal panel
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        horizontalPanel.add(button1);
        horizontalPanel.add(button2);
        horizontalPanel.add(button3);

        // Add the vertical and horizontal panels to the frame
        frame.add(verticalPanel, BorderLayout.WEST);
        frame.add(horizontalPanel, BorderLayout.EAST);

        frame.setVisible(true);
    }
}

