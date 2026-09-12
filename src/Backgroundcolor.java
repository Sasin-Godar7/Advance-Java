import javax.swing.*;
import java.awt.*;
public class Backgroundcolor {

    public static void main(String[] args) {
        JFrame frame = new JFrame("background color");

        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);

        frame.add(panel);

        frame.setSize(400,250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}