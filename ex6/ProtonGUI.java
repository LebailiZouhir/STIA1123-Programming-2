package ex6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ProtonGUI {

private JFrame frmProtonSelector;
private JTextField show;
private JLabel lblNewLabel;
private JComboBox comboBox_Feature;
private JLabel lblNewLabel_1;

/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				ProtonGUI window = new ProtonGUI();
				window.frmProtonSelector.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

/**
 * Create the application.
 */
public ProtonGUI() {
	initialize();
}

/**
 * Initialize the contents of the frame.
 */
private void initialize() {
	frmProtonSelector = new JFrame();
	frmProtonSelector.getContentPane().setBackground(Color.WHITE);
	frmProtonSelector.setTitle("Proton Selector");
	frmProtonSelector.setBounds(100, 100, 450, 424);
	frmProtonSelector.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmProtonSelector.getContentPane().setLayout(null);
	
	String[] price = {"Around RM 40,000","Around RM 50,000","Around RM 110,000","Around RM 130,000"};
	JComboBox comboBox_Price = new JComboBox(price);
	comboBox_Price.setBounds(51, 270, 134, 21);
	frmProtonSelector.getContentPane().add(comboBox_Price);
	
	JButton find = new JButton("FIND");
	find.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			switch (comboBox_Price.getSelectedIndex()) {
				
			}
			if(comboBox_Price.getSelectedIndex()==0 && comboBox_Feature.getSelectedIndex()==0) {
				show.setText("PROTON SAGA");
			}
			else if(comboBox_Price.getSelectedIndex()==1 && comboBox_Feature.getSelectedIndex()==1 || comboBox_Feature.getSelectedIndex()==0){
				show.setText("PROTON PERSONA");
			}
			else if(comboBox_Price.getSelectedIndex()==2 && comboBox_Feature.getSelectedIndex()==2 || comboBox_Feature.getSelectedIndex()==1) {
				show.setText("PROTON X50");
			}
			else if(comboBox_Price.getSelectedIndex()==3 && comboBox_Feature.getSelectedIndex()==3 || comboBox_Feature.getSelectedIndex()==1) {
				show.setText("PROTON X70");
			}
			else
				show.setText("NOT AVAILABLE");
		}
	});
	find.setBounds(249, 320, 120, 36);
	frmProtonSelector.getContentPane().add(find);
	
	show = new JTextField();
	show.setBounds(51, 320, 134, 36);
	frmProtonSelector.getContentPane().add(show);
	show.setColumns(10);
	
	lblNewLabel = new JLabel("Price Range");
	lblNewLabel.setBounds(83, 246, 85, 13);
	frmProtonSelector.getContentPane().add(lblNewLabel);
	
	String[] feature = {"Fuel Consumption","Large Boot","Auto Parking","Auto Drive"};
	comboBox_Feature = new JComboBox(feature);
	comboBox_Feature.setBounds(235, 270, 134, 21);
	frmProtonSelector.getContentPane().add(comboBox_Feature);
	
	lblNewLabel_1 = new JLabel("Main Feature");
	lblNewLabel_1.setBounds(263, 246, 85, 13);
	frmProtonSelector.getContentPane().add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("");
	lblNewLabel_2.setIcon(new ImageIcon(ProtonGUI.class.getResource("/ex6/proton.jpg")));
	lblNewLabel_2.setBounds(80, 11, 256, 224);
	frmProtonSelector.getContentPane().add(lblNewLabel_2);
	
	
}
}