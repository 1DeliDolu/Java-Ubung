package jTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JTextField
		//obj.setBound(x,y,width.height);
		
		JFrame f=new JFrame("Beispile für JTexrFiled");
		JTextField t=new JTextField();

		JLabel l1,l2,l3;
		JTextField t1,t2,t3;
		JButton btn=new JButton();
		
		l1=new JLabel("1. Zahl");
		l1.setBounds(50, 10, 100, 30);
		
		t1=new JTextField();
		t1.setBounds(50, 40, 200, 30);
		
		l2=new JLabel("2. Zahl");
		l2.setBounds(50, 70, 100, 30);
		
		t2=new JTextField();
		t2.setBounds(50, 100, 200, 30);
		
		l3=new JLabel("Summe");
		l3.setBounds(50, 130, 100, 30);
		
		t3=new JTextField();
		t3.setBounds(50, 160, 200, 30);
		t3.setEditable(false);
		
		
		btn=new JButton("Summe");
		btn.setBounds(50, 220, 200, 30);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int zahl_1=Integer.parseInt(t1.getText());
				int zahl_2=Integer.parseInt(t2.getText());
				int summe=zahl_1+zahl_2;
				//String sum=String.valueOf(summe);
				t3.setText(String.valueOf(summe));
			}
			
		});
		
		f.add(btn);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
		//f.setText();
	}

}
