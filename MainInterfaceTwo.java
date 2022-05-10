import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

class MainInterfaceTwo {
    public static void main(String args[]) {

        // TODO: Implement Singleton design pattern to prevent the creation of duplicate
        // CRYPTOR windows
        // Create Window and menu background
        Window window;
        window = new CryptorWindow();
        window.setVisible(true);
        
    }
}