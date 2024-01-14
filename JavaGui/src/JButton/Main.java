 package JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		//Button
		//btn.stBounds(x,y,width,height)
		
		JFrame frame=new JFrame("Beispiel für Button");
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		JButton btn=new JButton();
		btn.setText("Send");
		btn.setBounds(50, 50, 100, 50);
		frame.add(btn);
		
		btn.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Butono tiklandi");
			}
			
		});
		
		
	}

}
