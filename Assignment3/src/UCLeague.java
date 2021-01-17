import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class UCLeague {

private JFrame frame;

/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				UCLeague window = new UCLeague();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

/**
 * Create the application.
 */
public UCLeague() {
	initialize();
}

/**
 * Initialize the contents of the frame.
 */
private void initialize() {
	frame = new JFrame();
	frame.getContentPane().setBackground(new Color(0, 102, 255));
	frame.setBounds(100, 100, 420, 480);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JButton btnNewButton = new JButton("Standings");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			uclStandings table = new uclStandings();
			table.setVisible(true);
			
		}
	});
	btnNewButton.setBounds(10, 262, 103, 36);
	frame.getContentPane().add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("Players");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			uclPlayers players = new uclPlayers();
			players.setVisible(true);
		}
	});
	btnNewButton_1.setBounds(150, 334, 103, 36);
	frame.getContentPane().add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("Upc. Matches");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			uclMatches matches = new uclMatches();
			matches.setVisible(true);
		}
	});
	btnNewButton_2.setBounds(150, 262, 103, 36);
	frame.getContentPane().add(btnNewButton_2);
	
	JButton btnNewButton_3 = new JButton("Results");
	btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			uclResults results = new uclResults();
			results.setVisible(true);
		}
	});
	btnNewButton_3.setBounds(10, 334, 103, 36);
	frame.getContentPane().add(btnNewButton_3);
	
	JButton btnNewButton_4 = new JButton("EXIT");
	btnNewButton_4.setBackground(Color.RED);
	btnNewButton_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame = new JFrame();
			if(JOptionPane.showConfirmDialog(frame,"Do you want to exit","UEFA Champions League",
					JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}
		}
	});
	btnNewButton_4.setBounds(309, 306, 85, 21);
	frame.getContentPane().add(btnNewButton_4);
	
	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Zo\\eclipse-workspace\\JavaGuiDemo\\src\\UCL.png"));
	lblNewLabel.setBounds(68, 11, 271, 223);
	frame.getContentPane().add(lblNewLabel);
	
	
}
}