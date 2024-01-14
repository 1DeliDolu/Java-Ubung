package jCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JCheckBox
		////obj.setBounds(x,y,width,height)
		
		JFrame frame=new JFrame("Beispiel für JCheckBox");
		
		
		JCheckBox ch1=new JCheckBox("JA");
		JCheckBox ch2=new JCheckBox("NEIN");
		ch1.setBounds(150,100,250,50);
		ch2.setBounds(150,150,250,50);
		
		JButton btn=new JButton("Kontrol");
		btn.setBounds(150, 200, 250, 30);
		
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(ch1.isSelected()) {
					System.out.println(ch1.getText()+" ausgewält !");
				}
				if(ch2.isSelected()) {
					System.out.println(ch2.getText()+" ausgewält !");
			}
			
			}});
		
		
		
		frame.add(ch1);
		frame.add(ch2);
		frame.add(btn);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
