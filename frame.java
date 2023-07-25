//In this Program we will see about the frames in java for GUI with the reference of online resources - Bro Code

package PRACTICE;

import javax.swing.*;
import java.awt.*;

public class frame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();            //frame variable to create the frame
        frame.setTitle("Project Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(400,400);     //Size of Frames that display on screen
        frame.setVisible(true);                 //Boolean type to visible when we hit the run button
        ImageIcon image = new ImageIcon("java logo.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(255,201,34));
    }
}

