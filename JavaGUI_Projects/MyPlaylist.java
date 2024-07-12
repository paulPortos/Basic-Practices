package JavaGUI_Projects;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPlaylist {
    
    private JFrame window;
    public MyPlaylist(){
        window = new JFrame();
        window.setTitle("My Playlist");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800,500);
        window.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(Color.GREEN);

        Button button = new Button("Button");
        panel.add(button);
        window.add(panel, BorderLayout.CENTER);
    }

    public void show(){
        window.setVisible(true);
    }
}
