import javax.swing.*;

public class practical4_1{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Information");

        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(50, 50, 100, 20);

        JLabel rollNumberLabel = new JLabel("Roll Number:");
        rollNumberLabel.setBounds(50, 100, 100, 20);

        JLabel cpiLabel = new JLabel("CPI:");
        cpiLabel.setBounds(50, 150, 100, 20);

        JLabel emailLabel = new JLabel("E-mail:");
        emailLabel.setBounds(50, 200, 100, 20);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 20);

        JTextField rollNumberField = new JTextField();
        rollNumberField.setBounds(150, 100, 200, 20);

        JTextField cpiField = new JTextField();
        cpiField.setBounds(150, 150, 200, 20);

        JTextField emailField = new JTextField();
        emailField.setBounds(150, 200, 200, 20);

        frame.add(nameLabel);
        frame.add(rollNumberLabel);
        frame.add(cpiLabel);
        frame.add(emailLabel);
        frame.add(nameField);
        frame.add(rollNumberField);
        frame.add(cpiField);
        frame.add(emailField);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}