import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class practical4_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyEvent and MouseEvent Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold components
        JPanel panel = new JPanel();
        frame.add(panel);

        // Add a label to display event messages
        JLabel messageLabel = new JLabel("Event Messages");
        panel.add(messageLabel);

        // Add KeyListener for KeyEvent handling
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // KeyTyped event
                messageLabel.setText("Key Typed: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // KeyPressed event
                messageLabel.setText("Key Pressed: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // KeyReleased event
                messageLabel.setText("Key Released: " + e.getKeyChar());
            }
        });

        // Add MouseListener for MouseEvent handling
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                messageLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                messageLabel.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                messageLabel.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                messageLabel.setText("Mouse Entered at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                messageLabel.setText("Mouse Exited");
            }
        });

        frame.setFocusable(true); // Allow the frame to receive keyboard events

        frame.setVisible(true);
    }
}
