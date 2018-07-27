import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.io.*;

public class CurrencyConverterGUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblEnterCurrency;
	private JLabel lblEnterCurrencyTo;
	private JTextField textField_2;
	private JButton btnSubmit;
	private JTextField textField_3;
	private JLabel lblEnterCurrency_1;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConverterGUI frame = new CurrencyConverterGUI();
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
	public CurrencyConverterGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1550, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(128, 267, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblEnterCurrency = new JLabel("Enter amount");
		lblEnterCurrency.setBounds(15, 270, 115, 20);
		contentPane.add(lblEnterCurrency);
		
		textArea = new JTextArea();
		textArea.setBounds(647, 96, 280, 244);
		contentPane.add(textArea);
		
		 btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(this);
		btnSubmit.setBounds(203, 457, 115, 29);
		contentPane.add(btnSubmit);
		
		lblEnterCurrencyTo = new JLabel("Enter currency to convert to:");
		lblEnterCurrencyTo.setBounds(15, 333, 232, 20);
		contentPane.add(lblEnterCurrencyTo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(243, 332, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(217, 231, 146, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblEnterCurrency_1 = new JLabel("Enter currency:");
		lblEnterCurrency_1.setBounds(44, 234, 127, 20);
		contentPane.add(lblEnterCurrency_1);
	}

	public void actionPerformed(ActionEvent event) 
	
	{
		// TODO Auto-generated method stub
		
		if(event.getSource() == btnSubmit)
		{
			String currency = textField_3.getText();
			double currencyAmount = Double.parseDouble(textField.getText()); // 1 GBP
			String conversion = textField_2.getText(); // USD
			double exchangeRate = 0.0;
			if(currency.equals("GBP") && conversion.equals("USD"))
			{
				// String exchangeRate = currency * gbp usd exchange rate
				 exchangeRate = currencyAmount * 1.31;
			}
			
			textArea.append("£" + currencyAmount +  "=" +  "$" + exchangeRate);
			
		}
	}
}
