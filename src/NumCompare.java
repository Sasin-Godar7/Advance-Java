import java.awt.*;
import java.awt.event.*;

class NumCompare extends Frame implements MouseListener {

    TextField t1, t2;
    Label result;

    NumCompare() {

        setTitle("Number Comparison");
        setLayout(new FlowLayout());

        t1 = new TextField(10);
        t2 = new TextField(10);
        result = new Label("Result");

        add(new Label("First Number:"));
        add(t1);

        add(new Label("Second Number:"));
        add(t2);

        add(result);

        addMouseListener(this);

        // Close the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setSize(400, 200);
        setVisible(true);
    }

    // Mouse press → Smaller number
    public void mousePressed(MouseEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        result.setText("Smaller = " + Math.min(a, b));
    }

    // Mouse release → Greater number
    public void mouseReleased(MouseEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        result.setText("Greater = " + Math.max(a, b));
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String args[]) {
        new NumCompare();
    }
}