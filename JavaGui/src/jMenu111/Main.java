package jMenu111;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // JMenu
        // obj.setBounds(x,y,width,height)

        JFrame frame = new JFrame("Beispiel für JMenu");
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Hauptmenu");
        JMenu subMenu = new JMenu("Submenu");

        JMenuItem i1 = new JMenuItem("Menu 1");
        JMenuItem i2 = new JMenuItem("Menu 2");
        JMenuItem i3 = new JMenuItem("Menu 3");
        JMenuItem i4 = new JMenuItem("Menu 4");
        JMenuItem i5 = new JMenuItem("Menu 5");
        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Dieses Menü wird geklickt");
            }
        });

        JMenuItem a1 = new JMenuItem("SubMenu 1");
        JMenuItem a2 = new JMenuItem("SubMenu 2");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);

        subMenu.add(a1);
        subMenu.add(a2);
        menu.add(subMenu);

        mb.add(menu);
        frame.setJMenuBar(mb);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}