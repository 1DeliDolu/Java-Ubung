package jComboBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
         
            JFrame frame = new JFrame();
            String[] arr = {"C", "C++", "Java", "Python"};

            JComboBox<String> cb = new JComboBox<>(arr);
            cb.setBounds(50, 100, 90, 20);
            frame.add(cb);

            JButton btn = new JButton("Send");
            btn.setBounds(50, 150, 80, 20);
            frame.add(btn);

            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = "Der ausgewählte Text: " + cb.getSelectedItem();
                    String textAtIndex = "Text am Index 2: " + cb.getItemAt(2);
                    String textIndex = "Der ausgewählte Textindex: " + cb.getSelectedIndex();

                    System.out.println(text);
                    //System.out.println(textAtIndex);
                    System.out.println(textIndex);
                }
            });

            frame.setSize(500, 500);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}