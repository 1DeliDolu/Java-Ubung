package jLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//JLabel
		//btn.setBounds(x,y,width,height)
		
		JFrame f =new JFrame("Beispiel für JLabel");
		JLabel l1=new JLabel();
		l1.setText("Teil für die Schrift");
		l1.setBounds(100, 50, 200, 30);
		
		
		JButton btn= new JButton();
		btn.setText("Veränderung");
		btn.setBounds(100, 100, 100, 30);
		btn.addActionListener(new ActionListener() {
			int c= 1;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l1.setText("Buton "+ c++ +" Mals gekdrückt!");
			}
			
		});
		
		f.add(btn);
		f.add(l1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}