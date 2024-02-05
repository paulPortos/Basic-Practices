package JavaGUI_Projects;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SignUpPage {
    //Create a sign up page constructor 
    public SignUpPage(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JTextField username_text4Field = new JTextField("Username");
        JTextField password_TextField = new JTextField("Password");

        JButton loginButton = new JButton("Sign Up");
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
        panel.setLayout(new FlowLayout());

        loginButton.setPreferredSize(new Dimension(90,50));
        panel.add(loginButton);

        username_text4Field.setPreferredSize(new Dimension(140,40));
        panel.add(username_text4Field);

        password_TextField .setPreferredSize(new Dimension(140,40));
        panel.add(password_TextField );

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(450, 550);
    }

    public static void main(String[] args) {
        new SignUpPage();
    }
}
