import javax.swing.*;
import java.awt.*;

public class FontDemo extends JPanel {
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        //normal font
        g.setFont(new Font("Arial",Font.PLAIN,20));
        g.drawString("Normal text",50,50);

        //bold font
        g.setFont(new Font("Serif",Font.BOLD,24));
        g.drawString("Bold text",50,100);

        //italic font
        g.setFont(new Font("SensSerif",Font.ITALIC,24));
        g.drawString("italic text",50,150);


        // bold and italic
        g.setFont(new Font("Monospaced",Font.BOLD | Font.ITALIC,24));
        g.drawString("BOLD and italic text",50,200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Special fonts");
        frame.add(new FontDemo());

        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
