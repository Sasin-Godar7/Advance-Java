
import java.awt.*;
import java.awt.event.*;

public class AdapterClassDemo extends Frame {

    TextField textField;
       AdapterClassDemo( )
       {
           textField = new TextField();

           add(textField);

           setSize(400,300);
           setTitle("Adapter class example");
           setVisible(true);

           //1. window listener
           addWindowListener(new WindowAdapter() {

               @Override
               public void windowClosing(WindowEvent e) {
                   System.out.println("window is cloasing");
                   System.exit(0);
               }
           });

       // 2. mouse adapter
           addMouseListener(new MouseAdapter(){
               @Override
               public void mouseClicked(MouseEvent e) {
                   System.out.println("mouse clicked at :" + e.getX() + ", " + e.getY());
               }
           });

           //3. keyAdapter

           textField.addKeyListener(new KeyAdapter() {
               public  void keyPressed(KeyEvent e) {
                   System.out.println("key pressed :" + e.getKeyChar());
               }
           });
}

    public static void main(String[] args) {
        new AdapterClassDemo();
    }
}








