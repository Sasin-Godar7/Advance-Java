
import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo extends JFrame {
    CardLayoutDemo ()
    {
        CardLayout card = new CardLayout();
        setLayout(card);

        add(new JButton("page 1 "),"first");
        add(new JButton("page 2 "),"second");

        card.show(getContentPane(),"first");

        setVisible(true);
        setSize(300,200);
    }

    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
