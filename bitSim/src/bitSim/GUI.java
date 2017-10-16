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
import javax.swing.JLabel;

public class GUI extends JFrame implements ActionListener {
	
	
	private JPanel contentPane;
	private JLabel out;
	
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
		
		out = new JLabel("Week " + week + ": " + price);
		out.setBounds(140, 182, 91, 16);
		contentPane.add(out);
		
		JButton btn = new JButton("Next Week");
		btn.setActionCommand("btn");
		btn.addActionListener(this);
		btn.setBounds(709, 30, 97, 43);
		contentPane.add(btn);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		randomEvents event = new randomEvents();
		String eventName = e.getActionCommand();
	
		
		if(eventName.equals("btn")){
			price = event.trend(price);//makes starting price random
			week ++;
			
			out.setText("Week " + week + ": " + price);
		}
	}
}