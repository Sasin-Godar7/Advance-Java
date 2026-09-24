import javax.swing.*;
import java.awt.*;

public class SimpleCalculator extends JFrame{

    SimpleCalculator()
    {
        JFrame frame = new JFrame("calculator");

        JPanel panel = new JPanel();

        JTextField show = new JTextField();
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");



        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }

}
