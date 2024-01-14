package jLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	        JFrame frame = new JFrame("JLabel Example");
	        frame.setSize(300, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JLabel label = new JLabel("Bu bir JLabel'dir.");

	        // Metin yazı tipini ayarlayın.
	        label.setFont(new Font("Arial", Font.PLAIN, 16));

	        // Metin rengini ayarlayın.
	        label.setForeground(Color.red);

	        // Arka plan rengini ayarlayın.
	        label.setBackground(Color.white);

	        // İkonu ayarlayın.
	        label.setIcon(new ImageIcon("icon.png"));

	        frame.add(label);
	        frame.setVisible(true);
	        
	     // Metnin yatay hizasını ayarlayın.
	        label.setHorizontalAlignment(JLabel.CENTER);

	        // Metnin dikey hizasını ayarlayın.
	        label.setVerticalAlignment(JLabel.TOP);

	        // JLabel'in opaklığını ayarlayın.
	        label.setOpaque(false);

	        // JLabel'in yatay eksende hizasını ayarlayın.
	        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);

	        // JLabel'in dikey eksende hizasını ayarlayın.
	        label.setAlignmentY(JLabel.TOP_ALIGNMENT);
	        
		}
	}