import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Main
{

	private JFrame frame;
	private JTextField txtInput;
	private JLabel lblNa;

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

		txtInput = new JTextField();
		txtInput.setBounds(10, 39, 363, 20);
		frame.getContentPane().add(txtInput);
		txtInput.setColumns(10);

		JLabel lblInput = new JLabel("Input:");
		lblInput.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblInput);

		lblNa = new JLabel("N/A");
		lblNa.setBounds(66, 305, 332, 14);
		frame.getContentPane().add(lblNa);

		JButton btnNewButton = new JButton("Check Sorted");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				boolean res = Functions.checksorted(Functions.transformToInt(txtInput.getText()));
				lblNa.setText(String.valueOf(res));
			}
		});
		btnNewButton.setBounds(10, 97, 122, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnCountPrimes = new JButton("Count Primes");
		btnCountPrimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int res = Functions.countPrimes(Functions.transformToInt(txtInput.getText()));
				lblNa.setText(String.valueOf(res));
			}
		});
		btnCountPrimes.setBounds(142, 97, 122, 23);
		frame.getContentPane().add(btnCountPrimes);

		JButton btnDistinctArray = new JButton("Distinct Array");
		btnDistinctArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				ArrayList<String> res = Functions.DistinctArray(Functions.transformToString(txtInput.getText()));
				lblNa.setText(String.valueOf(res));
			}
		});
		btnDistinctArray.setBounds(276, 97, 122, 23);
		frame.getContentPane().add(btnDistinctArray);

		JButton btnGetMedian = new JButton("Get Median");
		btnGetMedian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				double res = Functions.Get_median(Functions.transformToString(txtInput.getText()));
				lblNa.setText(String.valueOf(res));
			}
		});
		btnGetMedian.setBounds(10, 131, 122, 23);
		frame.getContentPane().add(btnGetMedian);

		JButton btnMaxThreeNumber = new JButton("Max Three Numbers");
		btnMaxThreeNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int[] res = Functions.Max_three_number(Functions.transformToInt(txtInput.getText()));
				String result = "";
				for(int i = 0; i < res.length; i++)
				{
					result += res[i] + ",";
				}
				lblNa.setText(result);
			}
		});
		btnMaxThreeNumber.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMaxThreeNumber.setBounds(142, 131, 122, 23);
		frame.getContentPane().add(btnMaxThreeNumber);

		JButton btnMostRepeatedValue = new JButton("Most Repeated Value");
		btnMostRepeatedValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int res = Functions.most_repeated_value(Functions.transformToInt(txtInput.getText()));
				lblNa.setText(String.valueOf(res));
			}
		});
		btnMostRepeatedValue.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMostRepeatedValue.setBounds(276, 131, 122, 23);
		frame.getContentPane().add(btnMostRepeatedValue);

		JButton btnRop = new JButton("ROP");
		btnRop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int[] res = Functions.ROP(Functions.transformToInt(txtInput.getText()));
				String result = "";
				for(int i = 0; i < res.length; i++)
				{
					result += res[i] + ",";
				}
				lblNa.setText(result);
			}
		});
		btnRop.setBounds(10, 165, 122, 23);
		frame.getContentPane().add(btnRop);

		JButton btnShuffleArray = new JButton("Shuffle Array");
		btnShuffleArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				char[] res = Functions.shuffleArray(txtInput.getText().toCharArray());
				lblNa.setText(new String(res));
			}
		});
		btnShuffleArray.setBounds(142, 165, 122, 23);
		frame.getContentPane().add(btnShuffleArray);

		JButton btnMinThreeNumbers = new JButton("Min Three Numbers");
		btnMinThreeNumbers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int[] res = Functions.Get_Min_3_Num(Functions.transformToString(txtInput.getText()));
				String result = "";
				for(int i = 0; i < res.length; i++)
				{
					result += res[i] + ",";
				}
				lblNa.setText(result);
			}
		});
		btnMinThreeNumbers.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMinThreeNumbers.setBounds(276, 165, 122, 23);
		frame.getContentPane().add(btnMinThreeNumbers);

		JButton btnPalindromeTest = new JButton("Palindrome Test");
		btnPalindromeTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				boolean res = Functions.IsPalindrome(txtInput.getText().toCharArray());
				lblNa.setText(String.valueOf(res));
			}
		});
		btnPalindromeTest.setBounds(10, 199, 122, 23);
		frame.getContentPane().add(btnPalindromeTest);

		JButton btnSmallestPrime = new JButton("Smallest Prime");
		btnSmallestPrime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int[] arr = Functions.transformToInt(txtInput.getText());
				int res = Functions.SmallestPrime(arr, arr.length);
				lblNa.setText(String.valueOf(res));
			}
		});
		btnSmallestPrime.setBounds(142, 199, 122, 23);
		frame.getContentPane().add(btnSmallestPrime);

		JButton btnLargestPrime = new JButton("Largest Prime");
		btnLargestPrime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int[] res = Functions.ROP(Functions.transformToInt(txtInput.getText()));
				int result = Functions.getLargest(res);
				lblNa.setText(String.valueOf(result));
			}
		});
		btnLargestPrime.setBounds(276, 199, 122, 23);
		frame.getContentPane().add(btnLargestPrime);

		JButton btnPositive = new JButton("Positive");
		btnPositive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ArrayList<String> res = Functions.positiveArray(new ArrayList<String>(Arrays.asList(Functions.transformToString(txtInput.getText()))));
				lblNa.setText(String.valueOf(res));
			}
		});
		btnPositive.setBounds(10, 233, 122, 23);
		frame.getContentPane().add(btnPositive);

		JButton btnShift = new JButton("Shift");
		btnShift.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				char[] res = Functions.shift(txtInput.getText().toCharArray());
				lblNa.setText(new String(res));
			}
		});
		btnShift.setBounds(142, 233, 122, 23);
		frame.getContentPane().add(btnShift);

		JButton btnRunAll = new JButton("Run All");
		btnRunAll.setBounds(276, 233, 122, 23);
		frame.getContentPane().add(btnRunAll);

		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setBounds(10, 305, 46, 14);
		frame.getContentPane().add(lblOutput);
	}
}
