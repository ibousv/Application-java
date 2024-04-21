package view;

import javax.swing.*;
import java.awt.*;

public class MainView {

  /* JLabel label = new JLabel(); */
  JPanel panel = new JPanel();
  JFrame frame = new JFrame();

  public static void main(String[] args) {
    MainView main = new MainView();
  }

  public MainView() {
    /*
     * frame.add(label);
     * frame.add(panel);
     */

    panel.setBackground(Color.cyan);
    panel.setBounds(100, 100, 300, 300);
    panel.setVisible(true);
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("AGS");
    frame.setSize(600, 400);
    frame.setVisible(true);

  }

}
