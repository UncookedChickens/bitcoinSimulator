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
	private JLabel out, wallet;
	
	private int price, week;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

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
		out.setBounds(540, 43, 91, 16);
		contentPane.add(out);
		
		wallet = new JLabel("New label");
		wallet.setBounds(564, 126, 56, 16);
		contentPane.add(wallet);
		
		JButton nextWeek = new JButton("Next Week");
		nextWeek.setActionCommand("btn");
		nextWeek.addActionListener(this);
		nextWeek.setBounds(709, 30, 97, 43);
		contentPane.add(nextWeek);
		
		JButton buy = new JButton("Buy");
		buy.setActionCommand("buy");
		buy.addActionListener(this);
		buy.setBounds(709, 86, 97, 43);
		contentPane.add(buy);
		
		JButton sell = new JButton("Sell");
		sell.setActionCommand("sell");
		sell.addActionListener(this);
		sell.setBounds(709, 142, 97, 43);
		contentPane.add(sell);
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