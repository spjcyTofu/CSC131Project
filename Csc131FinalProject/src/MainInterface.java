import javax.swing.*;
import java.awt.*;

class MainInterface {
    public static void main(String args[]) {

        // Create Window and menu background
        JFrame menu = new JFrame("CRYPTOR");
        menu.setSize(700, 550);
        menu.setLayout(null);
        Color menucolor = new Color(135, 173, 146);
        menu.getContentPane().setBackground(menucolor);

        // User-input boxes
        JTextField txt1, txt2;
        txt1 = new JTextField("Un-Encrypted Text");
        txt1.setBounds(150, 100, 400, 50);
        txt1.setHorizontalAlignment(JTextField.CENTER);
        txt1.setFont(new Font("SansSerif", Font.BOLD, 14));

        txt2 = new JTextField("Encrypted Text");
        txt2.setBounds(150, 400, 400, 50);
        txt2.setHorizontalAlignment(JTextField.CENTER);
        txt2.setFont(new Font("SansSerif", Font.BOLD, 14));

        // Create list/array of Rot options, populate Dropdown box
        Integer[] rotlist = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25 };
        JComboBox<Integer> rotpick = new JComboBox<Integer>(rotlist);
        rotpick.setBounds(340, 160, 120, 25);

        // Construct menu labels
        JLabel title, rotval;
        title = new JLabel("CRYPTOR", JLabel.CENTER);
        title.setBounds(250, 30, 200, 50);
        title.setFont(new Font("SansSerif", Font.BOLD, 36));
        Color titlecolor = new Color(214, 59, 39);
        title.setForeground(titlecolor);

        rotval = new JLabel("ROTATION VAL");
        rotval.setBounds(240, 160, 100, 25);
        rotval.setFont(new Font("SansSerif", Font.BOLD, 12));

        // Build interactive buttons
        JButton enbutton, decbutton, copybutton1, copybutton2;
        enbutton = new JButton("ENCRYPT");
        enbutton.setBounds(150, 225, 190, 50);
        enbutton.setFont(new Font("SansSerif", Font.BOLD, 16));

        decbutton = new JButton("DECRYPT");
        decbutton.setBounds(360, 225, 190, 50);
        decbutton.setFont(new Font("SansSerif", Font.BOLD, 16));

        copybutton1 = new JButton("\uD83D\uDCCB");
        copybutton1.setBounds(585, 100, 50, 50);

        copybutton2 = new JButton("\uD83D\uDCCB");
        copybutton2.setBounds(585, 400, 50, 50);

        // Add everything to panel & "activate"
        menu.add(txt1);
        menu.add(txt2);
        menu.add(rotpick);
        menu.add(title);
        menu.add(rotval);
        menu.add(enbutton);
        menu.add(decbutton);
        menu.add(copybutton1);
        menu.add(copybutton2);

        menu.setVisible(true);
    }
}