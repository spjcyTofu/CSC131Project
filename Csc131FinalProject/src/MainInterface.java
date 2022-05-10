import java.awt.*;

class MainInterface {
    public static void main(String args[]) {
        
        // COMPOSITE DESIGN PATTERN
        
        // Create Window
        Window window;
        window = CryptorWindow.getInstance();
        window.setVisible(true);        
    }
}