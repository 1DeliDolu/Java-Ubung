package JButton;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonOrnek extends JFrame {

    public JButtonOrnek() {
        // JFrame'i başlat
        super("JButton Örneği");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JPanel oluştur
        JPanel panel = new JPanel();

        // JButton oluştur
        JButton button = new JButton("Tıkla");

        // JButton'e ActionListener ekle
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Düğmeye tıklandı!");
            }
        });

        // JButton'i panele ekle
        panel.add(button);

        // Paneli JFrame'e ekle
        add(panel);

        // JFrame'i görünür yap
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ana uygulama
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JButtonOrnek();
            }
        });
    }
}
