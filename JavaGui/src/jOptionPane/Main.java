package jOptionPane;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JOptionePane
		//obj.setBounds(x,y,width,height)
		
		JFrame frame = new JFrame("Beispiel für JOptionPane");
        JOptionPane.showMessageDialog(frame,"Ihr Name: ");
        //JOptionPane.showMessageDialog(frame,"Abonieren:  ","Legistrieren",JOptionPane.WARNING_MESSAGE);
        String str=JOptionPane.showInputDialog(frame,"Ihr Name");
        System.out.println(str);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
