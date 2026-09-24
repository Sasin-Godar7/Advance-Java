import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListnerDemo extends JFrame implements MouseListener {

    JTextField input1, input2;
    JLabel result;
    JButton button;

    MouseListnerDemo() {

        setTitle("Number Compare");
        setSize(400, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        input1 = new JTextField(10);
        input2 = new JTextField(10);

        button = new JButton("Compare");

        result = new JLabel("Result");

        add(new JLabel("First Number:"));
        add(input1);

        add(new JLabel("Second Number:"));
        add(input2);

        add(button);
        add(result);

        // Mouse events button मा
        button.addMouseListener(this);

        setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int a = Integer.parseInt(input1.getText());
        int b = Integer.parseInt(input2.getText());

        result.setText("Smaller: " + Math.min(a, b));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int a = Integer.parseInt(input1.getText());
        int b = Integer.parseInt(input2.getText());

        result.setText("Greater: " + Math.max(a, b));
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseListnerDemo();
    }
}