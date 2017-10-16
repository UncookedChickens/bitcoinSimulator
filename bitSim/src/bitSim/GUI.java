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
	private JLabel out, walletDisplay, bitcoinWallet;
	
	private int price, week, wallet, bitcoins = 0;

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
		wallet = 10000;
		
		
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
		
		walletDisplay = new JLabel("Wallet " + ": " + wallet);
		walletDisplay.setBounds(540, 72, 131, 16);
		contentPane.add(walletDisplay);
		
		bitcoinWallet = new JLabel("bitcoins " + ": " + bitcoins);
		bitcoinWallet.setBounds(540, 101, 131, 16);
		contentPane.add(bitcoinWallet);
		
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
	
		if(eventName.equals("btn") && week < 52){
			price = event.trend(price);//makes starting price random
			week ++;
			
			out.setText("Week " + week + ": " + price);
		}
		
		if(eventName.equals("buy")){
			
			if(wallet>=price){
				wallet-=price;
				bitcoins++;
			}
			
			walletDisplay.setText("Wallet " + ": " + wallet);
			bitcoinWallet.setText("bitcoins " + ": " + bitcoins);
		}
		
		if(eventName.equals("sell")){
			
			if(bitcoins>0){
				wallet+=price;
				bitcoins--;
			}
			
			walletDisplay.setText("Wallet " + ": " + wallet);
			bitcoinWallet.setText("bitcoins " + ": " + bitcoins);
		}
	}
}