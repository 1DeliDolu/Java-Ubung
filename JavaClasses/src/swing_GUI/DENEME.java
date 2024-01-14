package swing_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JTextField;

public class DENEME {

	private JFrame frmDeneme;
	private JTextField txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DENEME window = new DENEME();
					window.frmDeneme.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DENEME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeneme = new JFrame();
		frmDeneme.setTitle("DENEME");
		frmDeneme.setBounds(100, 100, 450, 300);
		frmDeneme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeneme.getContentPane().setLayout(new CardLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		frmDeneme.getContentPane().add(desktopPane, "name_481157639983500");
		
		JLabel lblNewLabel_1 = new JLabel("Senden");
		lblNewLabel_1.setBounds(24, 41, 46, 14);
		desktopPane.add(lblNewLabel_1);
		
		txt = new JTextField();
		txt.setBounds(10, 10, 191, 20);
		desktopPane.add(txt);
		txt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		frmDeneme.getContentPane().add(lblNewLabel, "name_481157679500500");
	}
}
