import  java.awt.event.*;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class Musteri_Anasayfa extends javax.swing.JFrame implements ActionListener
{
  // Creating an object of JFrame instead of extending it has no side effects.
  private JFrame frame;
  private JPanel panel, panel1;
  private JTextField tfield;
  private JButton nextButton, backButton;
  private JTextField textField;
  private JTextField textField_1;
  private JTextField textField_2;
  private JTextField textField_3;
  private JLabel lblTel;
  private JLabel lblEmail;
  private JLabel lblAdres;
  private JTextField textField_4;
  private GroupLayout gl_panel;
  private GroupLayout gl_panel1;
  private JLabel lblAraBilgileri;
  private JTextField textField_11;
  private JTextField textField_12;
  private JTextField textField_13;
  private JTextField textField_14;
  private JTextField textField_15;
  private JOptionPane optionPane;
  private JTextField textField_16;

  public Musteri_Anasayfa()
  {
 frame = new JFrame("MŸßteri Hizmetleri Ana Sayfa");
 frame.setTitle("M\u00FC\u015Fteri");
 // If you running your program from cmd, this line lets it comes
 // out of cmd when you click the top-right  RED Button.
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 panel = new JPanel();
 panel1 = new JPanel();

 tfield = new JTextField(10);

 nextButton = new JButton("NEXT");
 backButton = new JButton("BACK");
 nextButton.addActionListener(this);
 backButton.addActionListener(this);
 
 

 panel1.add(backButton);

 frame.setContentPane(panel);
 
 JLabel lblMteriBilgileri = new JLabel("Musteri Bilgileri");
 lblMteriBilgileri.setFont(new Font("Lucida Grande", Font.BOLD, 16));
 
 JLabel lblNewLabel = new JLabel("TC");
 
 JLabel lblNewLabel_1 = new JLabel("Ad");
 
 JLabel lblNewLabel_2 = new JLabel("Soyad");
 
 lblTel = new JLabel("Tel");
 
 lblEmail = new JLabel("E-mail");
 
 lblAdres = new JLabel("Adres");
 
 textField = new JTextField(10);
 textField_1 = new JTextField(10);
 textField_2 = new JTextField(10);
 textField_3 = new JTextField(10);
 textField_4 = new JTextField(10);
 /////////////
 
JLabel lblNewLabel_4 = new JLabel("Plaka");
 
 JLabel lblNewLabel_5 = new JLabel("Ara Markasİ");
 
 JLabel lblNewLabel_6 = new JLabel("Ruhsat No");
 
 JLabel lblNewLabel_7 = new JLabel("Tarih");
 
 JLabel lblNewLabel_8 = new JLabel("yaß");
 
 JLabel lblNewLabel_9 = new JLabel("model");
 
 JTextField textField_5 = new JTextField(10);
 JTextField textField_6 = new JTextField(10);
 JTextField textField_7 = new JTextField(10);
 JTextField textField_8 = new JTextField(10);
 JTextField textField_9 = new JTextField(10);
 JTextField textField_10 = new JTextField(10);
 
 lblAraBilgileri = new JLabel("Ara\u00E7 Bilgileri");
 lblAraBilgileri.setFont(new Font("Lucida Grande", Font.BOLD, 16));
 
 textField_11 = new JTextField(10);
 
 textField_12 = new JTextField(10);
 
 textField_13 = new JTextField(10);
 
 textField_14 = new JTextField(10);
 
 textField_15 = new JTextField(10);
 
 JLabel lblPlaka = new JLabel("Plaka");
 
 JLabel lblRuhsatNo = new JLabel("Ruhsat No");
 
 JLabel lblMarka = new JLabel("Marka");
 
 JLabel lblModel = new JLabel("Model");
 
 JLabel lblYa = new JLabel("Ya\u015F");
 
 JLabel lblAklama = new JLabel("A\u00E7\u0131klama");
 
 textField_16 = new JTextField(10);
 
 ////////////
 
 gl_panel = new GroupLayout(panel);
 gl_panel.setHorizontalGroup(
   gl_panel.createParallelGroup(Alignment.TRAILING)
 		.addGroup(gl_panel.createSequentialGroup()
 			.addGap(19)
 			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
 				.addComponent(lblMteriBilgileri, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
 				.addGroup(gl_panel.createSequentialGroup()
 					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
 						.addComponent(lblNewLabel_2)
 						.addComponent(lblNewLabel)
 						.addComponent(lblNewLabel_1)
 						.addComponent(lblAdres)
 						.addComponent(lblTel))
 					.addGap(81)
 					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
 						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
 						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
 						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
 						.addComponent(tfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)))
 				.addComponent(lblEmail))
 			.addPreferredGap(ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
 			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
 				.addGroup(gl_panel.createSequentialGroup()
 					.addComponent(lblAraBilgileri, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
 					.addGap(174))
 				.addGroup(gl_panel.createSequentialGroup()
 					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
 						.addComponent(lblPlaka)
 						.addComponent(lblYa, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
 						.addComponent(lblRuhsatNo, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
 						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
 							.addComponent(lblModel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 							.addComponent(lblAklama, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
 						.addComponent(lblMarka, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
 					.addPreferredGap(ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
 					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
 						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
 							.addComponent(textField_11, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
 							.addComponent(textField_12, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
 							.addComponent(textField_13, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
 							.addComponent(textField_14, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
 							.addComponent(textField_15, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
 						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
 					.addGap(37))))
 		.addGroup(gl_panel.createSequentialGroup()
 			.addContainerGap(589, Short.MAX_VALUE)
 			.addComponent(nextButton)
 			.addGap(55))
 );
 gl_panel.setVerticalGroup(
 	gl_panel.createParallelGroup(Alignment.LEADING)
 		.addGroup(gl_panel.createSequentialGroup()
 			.addContainerGap()
 			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
 				.addComponent(lblMteriBilgileri, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
 				.addComponent(lblAraBilgileri, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
 			.addGap(12)
 			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
 				.addComponent(lblNewLabel)
 				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 				.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 				.addComponent(lblPlaka))
 			.addPreferredGap(ComponentPlacement.RELATED)
 			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
 				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
 				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 				.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 				.addComponent(lblRuhsatNo))
 			.addPreferredGap(ComponentPlacement.UNRELATED)
 			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
 				.addComponent(lblNewLabel_2)
 				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 				.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 				.addComponent(lblMarka))
 			.addGap(12)
 			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
 				.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 				.addComponent(lblTel)
 				.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 				.addComponent(lblModel))
 			.addPreferredGap(ComponentPlacement.UNRELATED)
 			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
 				.addComponent(lblEmail)
 				.addGroup(gl_panel.createSequentialGroup()
 					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
 						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 						.addComponent(lblYa))
 					.addPreferredGap(ComponentPlacement.UNRELATED)
 					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
 						.addComponent(lblAdres)
 						.addComponent(tfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
 						.addComponent(lblAklama)
 						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
 			.addPreferredGap(ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
 			.addComponent(nextButton)
 			.addContainerGap())
 );
 panel.setLayout(gl_panel);
 
 frame.setSize(721, 523);
 frame.setVisible(true);
 }

 public void actionPerformed(ActionEvent ae)
 {
 JButton button = (JButton) ae.getSource();
 if (tfield.getText().length() > 0 && textField.getText().length()>0 && 
		 textField_1.getText().length()>0 && textField_2.getText().length()>0 && 
		 textField_3.getText().length()>0 && textField_4.getText().length()>0 && 
		 textField_11.getText().length()>0 && textField_12.getText().length()>0 && 
		 textField_13.getText().length()>0 && textField_14.getText().length()>0 && 
		 textField_15.getText().length()>0 ) // 16.yİ eklemedim ŸnkŸ aİklama zorunlu olmasİn &&textField_14.getText().length()>0
 {
    if (button == nextButton)
    {
        // this will remove the first panel and add the new panel to the frame.
        frame.remove(panel);
        frame.setContentPane(panel1); ////***
    }
    else if (button  == backButton)
    {
        frame.remove(panel1);
        frame.setContentPane(panel);
        
    }
    frame.validate();
    frame.repaint();
    // prefer to write this always.
}
 else
	 JOptionPane.showMessageDialog(null, "Lutfen tum bosluklari doldurunuz!");
	//optionPane = new JOptionPane("Message",  JOptionPane.WARNING_MESSAGE);

 }  
 public static void main(String[] args)
 {  
   /*
    * This is the most important part ofyour GUI app, never forget 
    * to schedule a job for your event dispatcher thread : 
    * by calling the function, method or constructor, responsible
    * for creating and displaying your GUI.
    */
    SwingUtilities.invokeLater(new Runnable()
   {
    public void run()
    {
        new Musteri_Anasayfa();
    }
   });
    }
}
