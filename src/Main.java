import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Main
{

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try
				{
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 445, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 39, 363, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblInput = new JLabel("Input:");
		lblInput.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblInput);
		
		JButton btnNewButton = new JButton("Check Sorted");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 97, 122, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCountPrimes = new JButton("Count Primes");
		btnCountPrimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCountPrimes.setBounds(142, 97, 122, 23);
		frame.getContentPane().add(btnCountPrimes);
		
		JButton btnDistinctArray = new JButton("Distinct Array");
		btnDistinctArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDistinctArray.setBounds(276, 97, 122, 23);
		frame.getContentPane().add(btnDistinctArray);
		
		JButton btnGetMedian = new JButton("Get Median");
		btnGetMedian.setBounds(10, 131, 122, 23);
		frame.getContentPane().add(btnGetMedian);
		
		JButton btnMaxThreeNumber = new JButton("Max Three Numbers");
		btnMaxThreeNumber.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMaxThreeNumber.setBounds(142, 131, 122, 23);
		frame.getContentPane().add(btnMaxThreeNumber);
		
		JButton btnMostRepeatedValue = new JButton("Most Repeated Value");
		btnMostRepeatedValue.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMostRepeatedValue.setBounds(276, 131, 122, 23);
		frame.getContentPane().add(btnMostRepeatedValue);
		
		JButton btnRop = new JButton("ROP");
		btnRop.setBounds(10, 165, 122, 23);
		frame.getContentPane().add(btnRop);
		
		JButton btnShuffleArray = new JButton("Shuffle Array");
		btnShuffleArray.setBounds(142, 165, 122, 23);
		frame.getContentPane().add(btnShuffleArray);
		
		JButton btnMinThreeNumbers = new JButton("Min Three Numbers");
		btnMinThreeNumbers.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMinThreeNumbers.setBounds(276, 165, 122, 23);
		frame.getContentPane().add(btnMinThreeNumbers);
		
		JButton btnPalindromeTest = new JButton("Palindrome Test");
		btnPalindromeTest.setBounds(10, 199, 122, 23);
		frame.getContentPane().add(btnPalindromeTest);
	}
}
