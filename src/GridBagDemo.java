
import  javax.swing.*;
import java.awt.*;

public class GridBagDemo extends JFrame {

    GridBagDemo()
    {
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.anchor = GridBagConstraints.WEST;

        // row 0 -- name
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Name :"),gbc);

        gbc.gridx = 1;
        gbc.gridy= 0;
        add(new JTextField(15),gbc);

        //row 2 -- address(second line , label column left empty)
        gbc.gridx=1;
        gbc.gridy=1;
        add(new JTextField(15),gbc);

        gbc.gridx=1;
        gbc.gridy=5;
        add(new JButton("submit"),gbc);



        gbc.gridx=1;
        gbc.gridy=3;
        add(new JCheckBox("bca"),gbc);

//        gbc.gridx=2;
//        gbc.gridy=3;
//        add(new JCheckBox("bca"),gbc);
//
//        gbc.gridx=3;
//        gbc.gridy=3;
//        add(new JCheckBox("bca"),gbc);

        gbc.gridx=1;
        gbc.gridy=4;
        add(new JComboBox<>(new String[]{"java","php","c"}),gbc);

        setTitle("GridBagLayout Form");
        setSize(400,400);
        setVisible(true);
    }


//
    public static void main(String[] args) {
        new GridBagDemo();
    }
}
