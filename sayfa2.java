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
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class sayfa2 extends JFrame {

  private JPanel contentPane;
	public String str;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sayfa2 frame = new sayfa2();
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
	
	
	public sayfa2() {
		setTitle("Musteri Hizmeti Anasayfa");
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
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Kay\u0131tl\u0131 M\u00FC\u015Fteriler");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton_1 = new JButton("M\u00FC\u015Fteri Ekle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sayfa3 m=new sayfa3(); /// burdan mŸßteri hizmeti sayfasİ aİlİyor
				
				setVisible(false);
				m.setVisible(true);
				
			}
		});
		
		JLabel lblKaytlAralar = new JLabel("Kay\u0131tl\u0131 Ara\u00E7lar");
		lblKaytlAralar.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JButton btnAraEkle = new JButton("Ara\u00E7 Ekle");
		btnAraEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayfa4 m=new sayfa4(); /// burdan mŸßteri hizmeti sayfasİ aİlİyor
				
				setVisible(false);
				m.setVisible(true);
			}
		});
		
		JButton btnBakmBilgileriniGir = new JButton("Bak\u0131m Bilgilerini Gir");
		btnBakmBilgileriniGir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bakim m=new Bakim(); /// burdan mŸßteri hizmeti sayfasİ aİlİyor
				
				setVisible(false);
				m.setVisible(true);
				
			}
		});
		
		JButton btnPaketBilgileriniGir = new JButton("Paket Bilgilerini Gir");
		btnPaketBilgileriniGir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MH2_Next m=new MH2_Next(); /// burdan mŸßteri hizmeti sayfasİ aİlİyor
				
				setVisible(false);
				m.setVisible(true);
				
			}
		});
		
		JButton btnDurumBilgisiniGr = new JButton("Durum Bilgisini G\u00F6r");
		btnDurumBilgisiniGr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MH3 m=new MH3(); /// burdan mŸßteri hizmeti sayfasİ aİlİyor
				
				setVisible(false);
				m.setVisible(true);
			}
		});
		
		JButton btnRaporOlutur = new JButton("Rapor Yazd\u0131r");
		btnRaporOlutur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rapor m =new Rapor(); /// burdan mŸßteri hizmeti sayfasİ aİlİyor
				
				setVisible(false); // mŸßteri hizmeti sayfasİnİ kapar
				m.setVisible(true);
			}
		});
		final JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"", "xc", "z", "c", "c", "c", "c", "ca", "a", "c", "", "", "v", "cv", "xc", "v", "s", "d", "fsd", "f", "f"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(list_1);
		
		final JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"a", "a", "a", "a", "a", "", "a", "a", "a", "a", "aaaaaaaaaahgasdkjhjasfhdshfjkasdaoudakjsdnasoudhjkasldoashfasj\u015Fsajhfjmsmdlajs", "a", "a", "a", "a", "", "a", "", "a", "a", "a"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JButton btnAracefeAktar = new JButton("Arac\u0131 \u015Eefe Aktar");
		btnAracefeAktar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(list_1.isSelectionEmpty()))
					JOptionPane.showMessageDialog(null, "Aktarİldİ");
					else
						JOptionPane.showMessageDialog(null, "Ara Seiniz");
				
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(49)
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
							.addComponent(btnAraEkle)
							.addGap(213))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
							.addGap(91)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblKaytlAralar)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
												.addComponent(btnPaketBilgileriniGir)
												.addGap(4))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
													.addComponent(btnAracefeAktar)
													.addComponent(btnDurumBilgisiniGr)
													.addComponent(btnRaporOlutur))))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(btnBakmBilgileriniGir)))))))
					.addGap(10))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblKaytlAralar))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(btnBakmBilgileriniGir)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnPaketBilgileriniGir)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDurumBilgisiniGr)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnAracefeAktar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnRaporOlutur)))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnAraEkle))
					.addGap(36))
		);
		
		
		contentPane.setLayout(gl_contentPane);
	}
}
