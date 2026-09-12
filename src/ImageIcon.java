import  javax.swing.*;
import java.awt.*;

public class ImageIcon extends  JPanel{
    Image image;
    Image img;

    public  ImageIcon()
    {
        image = new javax.swing.ImageIcon("C:\\Users\\acer\\Pictures\\favicon gym.png").getImage();
         img = new javax.swing.ImageIcon("C:\\Users\\acer\\Pictures\\brazildog.gif").getImage();
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(image,50,50,300,200,this);
        g.drawImage(img,50,300,200,200,this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("image example");
        frame.add(new ImageIcon());
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
