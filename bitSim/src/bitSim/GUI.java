package bitSim;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI extends JFrame implements ActionListener {
	
	
	private JPanel contentPane;
	private JTextField textField;
	private int price, week;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		price = 4500;
		week = 1;
		
		
		setTitle("I dunno, something");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 13, 625, 427);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText("Week " + week + ": " + price);
		
		JButton btn = new JButton("Next Week");
		btn.setActionCommand("btn");
		btn.addActionListener(this);
		btn.setBounds(709, 30, 97, 43);
		contentPane.add(btn);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		randomEvents event = new randomEvents();
		String eventName = e.getActionCommand();
	
<<<<<<< HEAD
		for(int i = 0; i < 52; i++){
			if(eventName.equals("btn")){
				event.randomEvent(price);//makes starting price random
				week ++;
				
				textField.equals(text +week +": " +price);
				
			}
		}	
=======
		
		if(eventName.equals("btn")){
			price = event.trend(price);//makes starting price random
			week ++;
			
			textField.setText("Week " + week + ": " + price);
			
		}
>>>>>>> branch 'master' of https://github.com/UncookedChickens/bitcoinSimulator.git
	}
}