import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventAction extends JFrame implements ActionListener {


    public EventAction() {
        JFrame frame = new JFrame("action listener demo :");

        JButton b = new JButton("click me !!");

        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(b);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button was clicked");
    }
}

