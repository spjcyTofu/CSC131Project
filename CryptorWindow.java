import java.awt.*;
import javax.swing.*;

/**
 * A window containing a PIN entry pad.
 */
public class CryptorWindow extends JFrame {
    /**
     * Default Constructor.
     */
    public CryptorWindow() {
        super();
        setupLayout();
    }

    private void setupLayout() {
        setSize(300, 300);
        setTitle("CYRPTOR");
        menu.setSize(700, 550);
        menu.setLayout(null);
        Color menucolor = new Color(165, 183, 170);
        menu.getContentPane().setBackground(menucolor);
    }

}
