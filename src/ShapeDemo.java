import javax.swing.*;
import java.awt.*;
public class ShapeDemo extends JPanel {
    @Override
    protected void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.RED);
        g2.drawLine(50, 50, 200, 50);

        g.setColor(Color.BLACK);
        g2.drawRect(50, 80, 100, 50);

        g.setColor(Color.ORANGE);
        g2.fillRect(250, 80, 150, 80);

        // g.setColor(Color.YELLOW);
        // g2.drawOval(50, 190, 150, 80);
        g.setColor(Color.PINK);
        g2.fillOval(250, 190, 150, 80);
    }

    public static void main(String[] agrs){
        JFrame frame = new JFrame("Graphics Example");
        frame.add(new ShapeDemo());
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}