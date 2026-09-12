import java.awt.*;
import java.awt.event.*;

class SumDifference extends Frame {

    TextField t1, t2, t3;

    SumDifference() {
        setTitle("Sum and Difference");
        setLayout(new FlowLayout());

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        add(new Label("First Number:"));
        add(t1);

        add(new Label("Second Number:"));
        add(t2);

        add(new Label("Output:"));
        add(t3);

        // Mouse Press = Sum
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                t3.setText("" + (a + b));
            }

            // Mouse Release = Difference
            public void mouseReleased(MouseEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                t3.setText("" + (a - b));
            }
        });

        // Close Frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String args[]) {
        new SumDifference();
    }
}