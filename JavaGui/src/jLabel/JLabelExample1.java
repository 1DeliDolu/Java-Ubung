package jLabel;



	import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

	public class JLabelExample1 {
	    public static void main(String[] args) {
	        // JFrame oluştur
	        JFrame frame = new JFrame("JLabel Örneği");

	        // JLabel oluştur
	        JLabel label = new JLabel("Merhaba, Java JLabel!");

	        // JLabel'ı JFrame'e ekle
	        frame.add(label);
	        
	        //setText(String text): JLabel'ın metin içeriğini ayarlar.
	        label.setText("Merhaba, Dünya!");
	        
	        //setHorizontalAlignment(int alignment): Etiketin yatay hizalamasını ayarlar. Bu, SwingConstants sınıfından alınan değerleri kullanır.
	        label.setHorizontalAlignment(SwingConstants.CENTER);
	        
	        //setIcon(Icon icon): Etikete bir simge (ikon) ekler.
	        ImageIcon icon = new ImageIcon("resim.png");
	       	        label.setIcon(icon);
	       	        
	       	     //setToolTipText(String text): Etiketin üzerine gelindiğinde görünen açıklama metnini ayarlar.
	       	     label.setToolTipText("Bu bir etiket açıklamasıdır.");
	       	  Font customFont = new Font("Arial", Font.BOLD, 14);
	       	label.setFont(customFont);
	       	
	       	//setForeground(Color fg): Etiketin metin rengini ayarlar.
	       	label.setForeground(Color.BLUE);
	       	label.setOpaque(true);
	       	//setOpaque(boolean isOpaque): Etiketin opak olup olmadığını ayarlar. Opaklık ayarı, arka planın çizilip çizilmeyeceğini belirler.
	       	
	       	     
	       	     //setFont(Font font): Etiketin yazı tipini ayarlar.
	        // JFrame'i ayarla
	        frame.setSize(300, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}
