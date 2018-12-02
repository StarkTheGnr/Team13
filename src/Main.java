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
	private JLabel lblSort;
	private JLabel lblP;
	private JLabel lblPT;
	private JLabel lblROP;
	private JLabel lblGM;
	private JLabel lblCP;
	private JLabel lblDA;
	private JLabel lblMTN;
	private JLabel lblMRV;
	private JLabel lblSA;
	private JLabel lblMinTN;
	private JLabel lblSP;
	private JLabel lblLP;
	private JLabel lblS;
	private JLabel label;

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

		lblSort = new JLabel("N/A");
		lblSort.setBounds(10, 131, 122, 14);
		frame.getContentPane().add(lblSort);

		JButton btnNewButton = new JButton("Check Sorted");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				boolean res = Functions.checksorted(Functions.transformToInt(txtInput.getText()));
				lblSort.setText(String.valueOf(res));
			}
		});
		btnNewButton.setBounds(10, 97, 122, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnCountPrimes = new JButton("Count Primes");
		btnCountPrimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int res = Functions.countPrimes(Functions.transformToInt(txtInput.getText()));
				lblCP.setText(String.valueOf(res));
			}
		});
		btnCountPrimes.setBounds(142, 97, 122, 23);
		frame.getContentPane().add(btnCountPrimes);

		JButton btnDistinctArray = new JButton("Distinct Array");
		btnDistinctArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				ArrayList<String> res = Functions.DistinctArray(Functions.transformToString(txtInput.getText()));
				lblDA.setText(String.valueOf(res));
			}
		});
		btnDistinctArray.setBounds(276, 97, 122, 23);
		frame.getContentPane().add(btnDistinctArray);

		JButton btnGetMedian = new JButton("Get Median");
		btnGetMedian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				double res = Functions.Get_median(Functions.transformToString(txtInput.getText()));
				lblGM.setText(String.valueOf(res));
			}
		});
		btnGetMedian.setBounds(10, 165, 122, 23);
		frame.getContentPane().add(btnGetMedian);

		JButton btnMTN = new JButton("Max Three Numbers");
		btnMTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int[] res = Functions.Max_three_number(Functions.transformToInt(txtInput.getText()));
				String result = "";
				for(int i = 0; i < res.length; i++)
				{
					result += res[i] + ",";
				}
				lblMTN.setText(result);
			}
		});
		btnMTN.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMTN.setBounds(142, 165, 122, 23);
		frame.getContentPane().add(btnMTN);

		JButton btnMostRepeatedValue = new JButton("Most Repeated Value");
		btnMostRepeatedValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int res = Functions.most_repeated_value(Functions.transformToInt(txtInput.getText()));
				lblMRV.setText(String.valueOf(res));
			}
		});
		btnMostRepeatedValue.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMostRepeatedValue.setBounds(276, 165, 122, 23);
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
				lblROP.setText(result);
			}
		});
		btnRop.setBounds(10, 233, 122, 23);
		frame.getContentPane().add(btnRop);

		JButton btnShuffleArray = new JButton("Shuffle Array");
		btnShuffleArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				char[] res = Functions.shuffleArray(txtInput.getText().toCharArray());
				lblSA.setText(new String(res));
			}
		});
		btnShuffleArray.setBounds(142, 233, 122, 23);
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
				lblMinTN.setText(result);
			}
		});
		btnMinThreeNumbers.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMinThreeNumbers.setBounds(276, 233, 122, 23);
		frame.getContentPane().add(btnMinThreeNumbers);

		JButton btnPalindromeTest = new JButton("Palindrome Test");
		btnPalindromeTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				boolean res = Functions.IsPalindrome(txtInput.getText().toCharArray());
				lblPT.setText(String.valueOf(res));
			}
		});
		btnPalindromeTest.setBounds(10, 292, 122, 23);
		frame.getContentPane().add(btnPalindromeTest);

		JButton btnSmallestPrime = new JButton("Smallest Prime");
		btnSmallestPrime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int[] arr = Functions.transformToInt(txtInput.getText());
				int res = Functions.SmallestPrime(arr, arr.length);
				lblSP.setText(String.valueOf(res));
			}
		});
		btnSmallestPrime.setBounds(142, 292, 122, 23);
		frame.getContentPane().add(btnSmallestPrime);

		JButton btnLargestPrime = new JButton("Largest Prime");
		btnLargestPrime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int[] res = Functions.ROP(Functions.transformToInt(txtInput.getText()));
				int result = Functions.getLargest(res);
				lblLP.setText(String.valueOf(result));
			}
		});
		btnLargestPrime.setBounds(276, 292, 122, 23);
		frame.getContentPane().add(btnLargestPrime);

		JButton btnPositive = new JButton("Positive");
		btnPositive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ArrayList<String> res = Functions.positiveArray(new ArrayList<String>(Arrays.asList(Functions.transformToString(txtInput.getText()))));
				lblP.setText(String.valueOf(res));
			}
		});
		btnPositive.setBounds(10, 356, 122, 23);
		frame.getContentPane().add(btnPositive);

		JButton btnShift = new JButton("Shift");
		btnShift.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				char[] res = Functions.shift(txtInput.getText().toCharArray());
				lblS.setText(new String(res));
			}
		});
		btnShift.setBounds(142, 356, 122, 23);
		frame.getContentPane().add(btnShift);

		JButton btnRunAll = new JButton("Run All");
		btnRunAll.setBounds(276, 356, 122, 23);
		frame.getContentPane().add(btnRunAll);

		lblPT = new JLabel("N/A");
		lblPT.setBounds(10, 331, 122, 14);
		frame.getContentPane().add(lblPT);
		
		lblGM = new JLabel("N/A");
		lblGM.setBounds(10, 199, 122, 14);
		frame.getContentPane().add(lblGM);
		
		lblROP = new JLabel("N/A");
		lblROP.setBounds(10, 267, 122, 14);
		frame.getContentPane().add(lblROP);
		
		lblCP = new JLabel("N/A");
		lblCP.setBounds(142, 131, 122, 14);
		frame.getContentPane().add(lblCP);
		
		lblMTN = new JLabel("N/A");
		lblMTN.setBounds(142, 199, 122, 14);
		frame.getContentPane().add(lblMTN);
		
		lblSA = new JLabel("N/A");
		lblSA.setBounds(142, 267, 122, 14);
		frame.getContentPane().add(lblSA);
		
		lblSP = new JLabel("N/A");
		lblSP.setBounds(142, 326, 122, 14);
		frame.getContentPane().add(lblSP);
		
		lblDA = new JLabel("N/A");
		lblDA.setBounds(276, 131, 122, 14);
		frame.getContentPane().add(lblDA);
		
		lblMRV = new JLabel("N/A");
		lblMRV.setBounds(276, 199, 122, 14);
		frame.getContentPane().add(lblMRV);
		
		lblMinTN = new JLabel("N/A");
		lblMinTN.setBounds(276, 267, 122, 14);
		frame.getContentPane().add(lblMinTN);
		
		lblLP = new JLabel("N/A");
		lblLP.setBounds(276, 326, 122, 14);
		frame.getContentPane().add(lblLP);
		
		lblP = new JLabel("N/A");
		lblP.setBounds(10, 390, 122, 14);
		frame.getContentPane().add(lblP);
		
		lblS = new JLabel("N/A");
		lblS.setBounds(142, 390, 122, 14);
		frame.getContentPane().add(lblS);
		
		label = new JLabel("N/A");
		label.setBounds(276, 390, 122, 14);
		frame.getContentPane().add(label);
	}
}
