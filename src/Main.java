import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("GridBagLayout Window!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 200);
        //frame.setResizable(false);


        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.LINE_END;
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(new JLabel("Name: "), constraints);
        constraints.gridy++;
        panel.add(new JLabel("Second name: "), constraints);
        constraints.gridy++;
        panel.add(new JLabel("Email: "), constraints);
        constraints.gridy++;
        panel.add(new JLabel("Login: "), constraints);
        constraints.gridy++;
        panel.add(new JLabel("Password: "), constraints);

        constraints.anchor  = GridBagConstraints.LINE_START;
        JTextField txtName = new JTextField(8);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(txtName, constraints);

        JTextField txtSecondName = new JTextField(16);
        constraints.gridx = 1;
        constraints.gridy++;
        panel.add(txtSecondName, constraints);

        JTextField txtEmail = new JTextField(16);
        constraints.gridx = 1;
        constraints.gridy++;
        panel.add(txtEmail, constraints);

        JTextField txtLogin = new JTextField(8);
        constraints.gridx = 1;
        constraints.gridy ++;
        panel.add(txtLogin, constraints);

        JTextField txtPassword = new JTextField(12);
        constraints.gridx = 1;
        constraints.gridy++;
        panel.add(txtPassword, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.anchor = GridBagConstraints.LINE_END;
        panel.add(new JLabel("Click the Button to save inputted data. "), constraints);


        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.gridheight = 2;
       //constraints.gridwidth = 2;
        constraints.insets = new Insets(5, 5, 5,5);

        panel.add(new JButton("Save"), constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        constraints.anchor = GridBagConstraints.LINE_END;
        //constraints.gridheight = 2;

        panel.add(new JLabel("Do not forget to save the data before exit! - "), constraints);

        frame.getContentPane().add(panel);

        frame.setVisible(true);

    }
}