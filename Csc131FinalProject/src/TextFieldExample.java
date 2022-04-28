import javax.swing.*;

class TextFieldExample {
    public static void main(String args[]) {
        JFrame f = new JFrame("TextField Example");
        JTextField t1, t2;
        t1 = new JTextField("Welcome to Javatpoint.");
        t1.setBounds(50, 100, 260, 50);
        t2 = new JTextField("AWT Tutorial");
        t2.setBounds(50, 300, 260, 50);
        f.add(t1);
        f.add(t2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}