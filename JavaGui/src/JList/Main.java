package JList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Beispiel für JList");
        DefaultListModel<String> dl = new DefaultListModel<>();

        dl.addElement("C++");
        dl.addElement("C");
        dl.addElement("Java");
        dl.addElement("PHP");
        dl.addElement("JavaScript");

        JList<String> list = new JList<>(dl);
        JScrollPane sc = new JScrollPane(list);
        sc.setBounds(100, 100, 75, 90);
        list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);

        DefaultListModel<String> dl1 = new DefaultListModel<>();
        dl1.addElement("Swing");
        dl1.addElement("Laravel");
        dl1.addElement("VueJs");
        dl1.addElement("Bootstrap");
        dl1.addElement("w3School");

        JList<String> list1 = new JList<>(dl1);
        JScrollPane sc1 = new JScrollPane(list1);
        sc1.setBounds(100, 200, 75, 100);

        JButton btn = new JButton("Send");
        btn.setBounds(200, 150, 80, 30);

        btn.addActionListener(new ActionListener() {
            String txt;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (list.getSelectedIndex() != -1) {
                    txt = "Die ausgewählte Computersprache: " + list.getSelectedValue();
                }
                if (list1.getSelectedIndex() != -1) {
                    txt += ", das ausgewählte Framework: ";
                    for (String item : list1.getSelectedValuesList()) {
                        txt += item + " ";
                    }
                }
                System.out.println(txt);
            }
        });

        frame.add(sc);
        frame.add(sc1);
        frame.add(btn);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
