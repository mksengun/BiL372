import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Rapor extends JFrame {

  private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rapor frame = new Rapor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Rapor() {
		//final Musteri_Hizmeti_2 m= new Musteri_Hizmeti_2();
		setTitle("Rapor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 440);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDosya = new JMenu("Dosya");
		menuBar.add(mnDosya);
		
		JMenu mnDzen = new JMenu("D\u00FCzen");
		menuBar.add(mnDzen);
		
		JMenuItem mnİtmOturumuKapat = new JMenuItem("Oturumu Kapat");
		mnİtmOturumuKapat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int reply = JOptionPane.showConfirmDialog(null, "Emin misiniz?", "Uyarİ", JOptionPane.YES_NO_OPTION);
		        if (reply == JOptionPane.YES_OPTION) {
		        	JOptionPane.showMessageDialog(null, "‚İkİß Yapİldİ...");

					Giris_2 g = new Giris_2();
					setVisible(false);
					g.setVisible(true);}
			}
		});
		mnDzen.add(mnİtmOturumuKapat);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				sayfa2 m=new sayfa2(); /// burdan mŸßteri hizmeti sayfasİ aİlİyor
				
				setVisible(false);
				m.setVisible(true);
				//Musteri_Hizmeti m=new Musteri_Hizmeti(); /// burdan mŸßteri hizmeti sayfasİ aİlİyor
				
				//setVisible(false);
				//m.setVisible(true);
				
			}
					
			
			});
		
		JButton btnYazdr = new JButton("Yazd\u0131r");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(481, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnYazdr)
					.addGap(7))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(333, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnYazdr))
					.addGap(16))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
