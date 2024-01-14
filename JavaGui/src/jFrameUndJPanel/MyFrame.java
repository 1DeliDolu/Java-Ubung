package jFrameUndJPanel;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
    public MyFrame() {
        // JFrame özellikleri ayarlanabilir
        setTitle("Benim Pencere");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JFrame'e çeşitli bileşenleri ekleyebilirsiniz
        // Örneğin: JButton, JLabel, JTextField, vs.
    }

    public static void main(String[] args) {
        // JFrame örneği oluşturulup görünür hale getirilir
        MyFrame myFrame = new MyFrame();
        myFrame.setVisible(true);
    }
}