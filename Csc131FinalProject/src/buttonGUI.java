import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class buttonGUI {

	private JLabel label;
	private JFrame frame;
	private JButton encrypt;
	private JButton decrypt;
	private JPanel panel;

	public buttonGUI() {
		frame = new JFrame();
		encrypt = new JButton("Encrypt");
		decrypt = new JButton("Decrypt");

		encrypt.addActionListener(new ActionListener() {
			@Override
			// Encryption Method
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Encryption!");
			}
		});

		decrypt.addActionListener(new ActionListener() {
			@Override
			// Decryption Method
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Decryption!");

			}
		});

		label = new JLabel("Choose an option");

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100, 200, 100, 200));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(encrypt);
		panel.add(decrypt);
		panel.add(label);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("String Manipulator");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new buttonGUI();

	}

}