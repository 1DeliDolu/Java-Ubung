package jTable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Table
		//btn.stBounds(x,y,width,height)
		
		 JFrame frame = new JFrame("Beispiel für JTable");
		 String[][] dat= {{"1","Math","85"},{"2","Bio","90"},{"3","Deutsch","95"}}; 
		 String[] spalte= {"ID","Unterricht","Note"};
		 
		 JTable jt=new JTable(dat,spalte);
		 jt.setBounds(30, 40, 200, 300);
		 
		 JScrollPane sp=new JScrollPane(jt);
		 frame.add(sp);
		 
		 
		 frame.setSize(500, 500);
         //frame.setLayout(null);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
