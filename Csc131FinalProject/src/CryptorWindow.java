import java.awt.*;
import javax.swing.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class CryptorWindow extends JFrame {
   
    private static CryptorWindow instance = new CryptorWindow();
    
    // Constructor
    private CryptorWindow() {
        super();
        setupLayout();
    }

    //SINGLETON DESIGN PATTERN
    public static CryptorWindow getInstance() {
        return instance;
    }

    // COMPOSITE DESIGN PATTERN
    private void setupLayout() {
        
        // Create menu background
        setTitle("CYRPTOR");
        setSize(700, 550);
        setLayout(null);
        Color menucolor = new Color(165, 183, 170);
        getContentPane().setBackground(menucolor);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        Color titlecolor = new Color(132, 32, 1);
        title.setForeground(titlecolor);

        rotval = new JLabel("ROTATION VAL");
        rotval.setBounds(240, 160, 100, 25);
        rotval.setFont(new Font("SansSerif", Font.BOLD, 12));

        // Build interactive buttons
        JButton enbutton, decbutton, copybutton1, copybutton2;
        enbutton = new JButton("ENCRYPT");
        enbutton.setBounds(150, 225, 190, 50);
        enbutton.setFont(new Font("SansSerif", Font.BOLD, 16));
        // Move below function to own class at some point
        enbutton.addActionListener(e -> {
            int rotValue = (rotpick.getSelectedIndex() + 1); // Please do not observe this
            txt2.setText(encryptionUtilities.encrypt(rotValue, txt1.getText()));
        });

        decbutton = new JButton("DECRYPT");
        decbutton.setBounds(360, 225, 190, 50);
        decbutton.setFont(new Font("SansSerif", Font.BOLD, 16));
        // Move below function to own class at some point
        decbutton.addActionListener(e -> {
            int rotValue = (rotpick.getSelectedIndex() + 1); // Please do not observe this
            txt1.setText(encryptionUtilities.decrypt(rotValue, txt2.getText()));
        });

        copybutton1 = new JButton("\uD83D\uDCCB");
        copybutton1.setBounds(585, 100, 50, 50);
        // Move below function to own class at some point
        copybutton1.addActionListener(e -> {
            StringSelection stringSelection = new StringSelection(txt1.getText());
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
        });

        copybutton2 = new JButton("\uD83D\uDCCB");
        copybutton2.setBounds(585, 400, 50, 50);
        // Move below function to own class at some point
        copybutton2.addActionListener(e -> {
            StringSelection stringSelection = new StringSelection(txt2.getText());
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
        });

        // Add everything to panel & "activate"
        add(txt1);
        add(txt2);
        add(rotpick);
        add(title);
        add(rotval);
        add(enbutton);
        add(decbutton);
        add(copybutton1);
        add(copybutton2);

    }

}
