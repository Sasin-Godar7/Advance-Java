//import javax.swing.*;
//
//public class SwingDemo {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("My Swing Application");
//
//        JLabel label = new JLabel("hello , swing");
//
//        frame.add(label);
//
//
//        frame.setSize(400,300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//
//    }
//}


// my first frame

//import javax.swing.JFrame;
//
//public class SwingDemo {
//    public static void main(String[] args) {
//
//        //create a frame
//        JFrame frame = new JFrame("My Swing Application");
//
//        // set frame size
//         frame.setSize(1500,100);
//
//         //close application when frame is closed
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // display the frame
//        frame.setVisible(true);
//
//    }
//}


// my first label

//import javax.swing.*;
//
//public class SwingDemo {
//    public static void main(String[] args) {
//
//        //create a frame
//        JFrame frame = new JFrame("My Swing Application");
//
//        //creating the label
//        JLabel label = new JLabel("student infromation");
//
//        JLabel label1 = new JLabel("welcome to java ");
//
//        frame.add(label);
//        frame.add(label1);
//
//        // set frame size
//        frame.setSize(400,400);
//
//        //close application when frame is closed
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // display the frame
//        frame.setVisible(true);
//
//    }
//}






//adding multiple labels
import javax.swing.*;

public class SwingDemo {
    public static void main(String[] args) {

        //create a frame
        JFrame frame = new JFrame("My Swing Application");

        //creating the label
        JLabel label = new JLabel("student infromation");
        JLabel age = new JLabel("age : 21");
        JLabel course = new JLabel("course : bca");

        frame.setLayout(new java.awt.FlowLayout());
        label.setBounds(200,200,100,100);
        age.setBounds(200,200,20,100);

        frame.add(label);
        frame.add(age);
        frame.add(course);

       // set frame size
        frame.setSize(400,400);

        //close application when frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the frame
        frame.setVisible(true);

    }
}
