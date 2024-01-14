package JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JRadioButtonOrnegi {

    public static void main(String[] args) {
        // Bir JFrame oluşturun
        JFrame frame = new JFrame("JRadioButton Örneği");
        frame.setSize(300, 200);

        // Bir JPanel oluşturun
        JPanel panel = new JPanel();
        frame.add(panel);

        // Bir "Erkek" JRadioButton oluşturun
        JRadioButton erkek = new JRadioButton("Erkek");
        panel.add(erkek);

        // Bir "Kadın" JRadioButton oluşturun
        JRadioButton kadin = new JRadioButton("Kadın");
        panel.add(kadin);

        // JRadioButton'ları aynı gruba yerleştirin
        ButtonGroup grup = new ButtonGroup();
        grup.add(erkek);
        grup.add(kadin);

        // Bir eylem dinleyicisi ekleyin
        erkek.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Erkek düğmesine tıklandı
                System.out.println("Erkek seçildi");
            }
        });
        kadin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Erkek düğmesine tıklandı
                System.out.println("Kadin seçildi");
            }
        });

        // Pencereyi görüntüleyin
        frame.setVisible(true);
    }
}
