package jFrameUndJPanel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MyPanel extends JPanel {
    public MyPanel() {
        // JPanel üzerine çeşitli bileşenleri ekleyebilirsiniz
        JButton button = new JButton("Tıkla");
        add(button);
    }

    public static void main(String[] args) {
        // JFrame ve JPanel kullanarak bir GUI oluşturulur
        JFrame frame = new JFrame("JFrame ve JPanel Örneği");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        frame.add(panel);

        frame.setVisible(true);
    }
}
