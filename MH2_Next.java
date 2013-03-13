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
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;


public class MH2_Next extends JFrame {

  private JPanel contentPane;
	public JLabel lblNewLabel;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MH2_Next frame = new MH2_Next();
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
	public boolean araciEkle(Arac k, ArrayList<Arac> list) {
        if (kullaniciBul(k.getAracAdİ(), list) == null) {
            list.add(k);
            return true;
        } else {
            return false;
        }
     
    }

	   public Arac kullaniciBul(String aracAdİ, ArrayList<Arac> list) {
           if (list.isEmpty()) {
               return null;
           } else {
               for (int i = 0; i < list.size(); i++) {
                   if (list.get(i).getAracAdİ().equals(aracAdİ)) {
                       return list.get(i);
                   }
               }

           }
           return null;
       }
	public MH2_Next() {
		//final Musteri_Hizmeti_2 m= new Musteri_Hizmeti_2();
		setTitle("Paket Sayfas\u0131");
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
				Musteri_Hizmeti_2 m =new Musteri_Hizmeti_2(); /// burdan mŸßteri hizmeti sayfasİ aİlİyor
				
				setVisible(false); // mŸßteri hizmeti sayfasİnİ kapar
				m.setVisible(true);
				
				//Musteri_Hizmeti m=new Musteri_Hizmeti(); /// burdan mŸßteri hizmeti sayfasİ aİlİyor
				
				//setVisible(false);
				//m.setVisible(true);
				
			}
					
			
			});
		
		JButton btnk = new JButton("\u00C7\u0131k\u0131\u015F");
		btnk.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
				
				int reply = JOptionPane.showConfirmDialog(null, "Emin misiniz?", "Uyarİ", JOptionPane.YES_NO_OPTION);
		        if (reply == JOptionPane.YES_OPTION) {
		        	JOptionPane.showMessageDialog(null, "Hoßakalİn...");
			        System.exit(0);
		        	
		        }
			}
		});
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MH3 m =new MH3(); /// burdan mŸßteri hizmeti sayfasİ aİlİyor
				
				setVisible(false); // mŸßteri hizmeti sayfasİnİ kapar
				m.setVisible(true);
			}
		});
		
		JLabel lblPaketSeiniz = new JLabel("Paket Se\u00E7iniz");
		JScrollPane scrollPane = new javax.swing.JScrollPane();
		
		JScrollBar scrollBar = new JScrollBar();
		
		JLabel lblPaketSeiniz_1 = new JLabel("Paket Se\u00E7iniz");
		
		
		lblNewLabel = new JLabel("");
		/*lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null,"Paket 2 seildi ");
				
			}
		});*///
		lblNewLabel.setIcon(new ImageIcon("/Users/pc/Downloads/paket2_buyuk.png"));
		lblNewLabel.setVisible(false);
		
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem().toString().equalsIgnoreCase("Paket 2"))
				{
					//JOptionPane.showMessageDialog(null, "Paket 1 seildi");
					lblNewLabel.setVisible(true);
				}
			}
		});///////////////
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Paket 1", "Paket 2", "Paket 3"}));
		comboBox.setVisible(false);
		
		
		final JRadioButton rdbtnBakmIstiyor = new JRadioButton("Paket istiyor");
		
		
		final JRadioButton rdbtnBakmIstemiyor = new JRadioButton("Paket istemiyor");
		
		
		
		////
		   ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();
		   buttonGroup1.add(rdbtnBakmIstiyor);
		   rdbtnBakmIstiyor.setText("Paket istiyor");

	        buttonGroup1.add(rdbtnBakmIstemiyor);
	        rdbtnBakmIstemiyor.setText("Paket Üstemiyor");
	       
	   ///		
		JLabel lblBakmBilgileri = new JLabel("Paket Bilgileri");
		lblBakmBilgileri.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayfa2 m=new sayfa2(); /// burdan mŸßteri hizmeti sayfasİ aİlİyor
				
				setVisible(false);
				m.setVisible(true);
			}
		});
		
		JLabel lblAklamaGiriniz = new JLabel("A\u00E7\u0131klama Giriniz");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnBakmIstemiyor.isSelected()|| (rdbtnBakmIstiyor.isSelected()&& 
						(comboBox.getSelectedItem().toString().equalsIgnoreCase("Paket 1")|| 
						comboBox.getSelectedItem().toString().equalsIgnoreCase("Paket 2")||
						comboBox.getSelectedItem().toString().equalsIgnoreCase("Paket 3"))))
				
			{JOptionPane.showMessageDialog(null, "Ara Eklendi");
			sayfa2 m=new sayfa2(); /// burdan mŸßteri hizmeti sayfasİ aİlİyor
			
			setVisible(false);
			m.setVisible(true);
			}
			else
				JOptionPane.showMessageDialog(null, "TŸm bosluklarİ doldurunuz");
				
		}
			}
		);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(419, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnKaydet)
					.addGap(154))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBakmBilgileri)
					.addContainerGap(669, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(16)
					.addComponent(lblPaketSeiniz_1)
					.addContainerGap(673, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAklamaGiriniz)
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnBakmIstiyor)
							.addGap(18)
							.addComponent(rdbtnBakmIstemiyor)))
					.addGap(335))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBakmBilgileri)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnBakmIstiyor)
						.addComponent(rdbtnBakmIstemiyor))
					.addGap(28)
					.addComponent(lblPaketSeiniz_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblAklamaGiriniz)
							.addGap(18)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnBack)
								.addComponent(btnKaydet)))
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		JTextArea txtrAklamaGiriniz = new JTextArea();
		scrollPane_1.setViewportView(txtrAklamaGiriniz);
		
		rdbtnBakmIstiyor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
        if(rdbtnBakmIstiyor.isSelected())
		{comboBox.setVisible(true);}
			}
		});
		rdbtnBakmIstemiyor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnBakmIstemiyor.isSelected())
				{comboBox.setVisible(false);}
					}
				});
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"a", "b", "c", "d", "s", "e", "c", "c"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setColumnHeaderView(list_1);
		contentPane.setLayout(gl_contentPane);
	}
}


