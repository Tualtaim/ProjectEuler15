/**
Java program solving the problem #15 of the Euler Project

Tuomas Taimi 
email: tuomas.taimi@gmail.com
**/


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JRadioButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Euler15 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Euler15 frame = new Euler15();
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
	public Euler15() {
		setTitle("Projcet Euler 15");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("What is Project Euler? (opens web page)");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.awt.Desktop.getDesktop().browse(new URI("https://projecteuler.net/about"));
				} catch (IOException e1) {	
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		mnMenu.add(mntmNewMenuItem);
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Problem #15 (opens web page)");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.awt.Desktop.getDesktop().browse(new URI("https://projecteuler.net/problem=15"));
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
		});
		mnMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 6;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 0;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Palatino", Font.PLAIN, 11));
		editorPane.setEditable(false);
		scrollPane.setViewportView(editorPane);
		JRadioButton rdbtnPascal = new JRadioButton("Pascal's Triangle");
		rdbtnPascal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblChooseHowTo = new JLabel("Choose how to solve and grid size:");
		GridBagConstraints gbc_lblChooseHowTo = new GridBagConstraints();
		gbc_lblChooseHowTo.anchor = GridBagConstraints.WEST;
		gbc_lblChooseHowTo.insets = new Insets(0, 0, 5, 5);
		gbc_lblChooseHowTo.gridx = 1;
		gbc_lblChooseHowTo.gridy = 0;
		contentPane.add(lblChooseHowTo, gbc_lblChooseHowTo);
		GridBagConstraints gbc_rdbtnPascal = new GridBagConstraints();
		gbc_rdbtnPascal.anchor = GridBagConstraints.WEST;
		gbc_rdbtnPascal.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnPascal.gridx = 1;
		gbc_rdbtnPascal.gridy = 1;
		contentPane.add(rdbtnPascal, gbc_rdbtnPascal);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "5", "10", "15", "20", "25", "40", "100"}));
		comboBox.setSelectedIndex(5);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.WEST;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		contentPane.add(comboBox, gbc_comboBox);
		
		JRadioButton rdbtnNcr = new JRadioButton("Binomial coefficient");
		rdbtnNcr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		GridBagConstraints gbc_rdbtnNcr = new GridBagConstraints();
		gbc_rdbtnNcr.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNcr.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNcr.gridx = 1;
		gbc_rdbtnNcr.gridy = 2;
		contentPane.add(rdbtnNcr, gbc_rdbtnNcr);
		
		//Group the buttons
		ButtonGroup radiobuttons= new ButtonGroup();
		radiobuttons.add(rdbtnPascal);
		radiobuttons.add(rdbtnNcr);
		
		JButton btnSolve = new JButton("Solve");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPascal.isSelected()) {
					editorPane.setText("Answer is: " + pascalTriangle(Integer.parseInt(comboBox.getSelectedItem().toString())*2 ) 
							+ "\nThis solution took " + timernCr(Integer.parseInt(comboBox.getSelectedItem().toString())) + " nanoseconds to solve."
							+ "\nThe selected grid size was " + comboBox.getSelectedItem()  + "x" + comboBox.getSelectedItem()							
							+ "\n\nPascal's Triangle explanation:\n\n"
							+ "Pascal's Triangle is triangular array of the binomial coefficients.\n"
							+ "If look at the problem of 2x2 grid and solve all the possible ways to reach a grid\n"
							+ "we see that it would look like:\n"
							+ "1 1 1\n"
							+ "1 2 3\n"
							+ "1 3 6\n"
							+ "and for the 3x3 grid:\n"
							+ "1   1   1   1\n"
							+ "1   2   3   4\n"
							+ "1   3   6   10\n"
							+ "1   4   10  20\n"
							+ "These grids are all forms of Pascal's triangle.\n"
							+ "We can use this to solve the problem for every possible grid size.\n"
							);
				}
				else if(rdbtnNcr.isSelected()) {
					editorPane.setText("Answer is: " + nCr(Integer.parseInt(comboBox.getSelectedItem().toString())) 
							+ "\nThis solution took " + timernCr(Integer.parseInt(comboBox.getSelectedItem().toString())) + " nanoseconds to solve."
							+ "\nThe selected grid size was " + comboBox.getSelectedItem()  + "x" + comboBox.getSelectedItem()
							+ "\n\nBinomial coefficient explanation:\n\n"
							+ "If look at the problem of 2x2 grid we can see that you'll need to take four steps to reach the end.\n"
							+ "In these four steps you'll have two nodes where you can choose wheter you go right or down.\n"
							+ "In a 3x3 grid you'll have three nodes where you can choose the direction and you'll take six steps to reach the end.\n"
							+ "This is because if you reach the bottom or the right side of the grid you'll only have one direction to go.\n"
							+ "Therefore we can solve the amount of possible routes with binomial coefficients.\n"
							+ "In the 2x2 grid with four steps the binomial coefficient is calculated as nCr(4,2) \n"
							+ "and in the 3x3 grid nCr(6,3). If we have grid size AxA the number of possible routes is nCr(A,A/2),\n"
							+ "where nCr(x,y) is x!/(y!*(x-y)!).");
				}
				else {
					editorPane.setText("Please choose either Pascal's Triangle or Binomial coefficient.");
				}
			}
		});
		
		GridBagConstraints gbc_btnSolve = new GridBagConstraints();
		gbc_btnSolve.anchor = GridBagConstraints.WEST;
		gbc_btnSolve.insets = new Insets(0, 0, 5, 5);
		gbc_btnSolve.gridx = 1;
		gbc_btnSolve.gridy = 4;
		contentPane.add(btnSolve, gbc_btnSolve);
		
	}
	
	//Creates Pascal's triangle and returns the biggest number
	//In order to solve really big grids we need to use the BigInteger class instead of number types long or int
	//(If we go to grid size >30x30 we won't get correct results if we use long or int)
	public static BigInteger pascalTriangle(int a) {
		int x = a; //Grid size
		BigInteger pascalTriangle [][] = new BigInteger [x+1][x+1];
		//CREATE PASCAL TRIANGLE
		for (int i = 0; i<x+1; i++) {
			for (int j = 0; j<i+1; j++) {
				if(j==0 || j==i) {
					pascalTriangle[i][j] = BigInteger.valueOf(1);  //1st and last are always 1
				}
				else {
					pascalTriangle[i][j] = pascalTriangle[i-1][j].add(pascalTriangle[i-1][j-1]);
				}			
			}
		}
		return pascalTriangle[x][x/2];
	}
	
	//Calculates the binomial coefficient (again we have to use the BigInteger class)
	public static BigInteger nCr(int a) {
		BigInteger N = Factor(a*2).divide(Factor(a).multiply(Factor(a)));
		return N;
	}
	
	//Calculates factorial n! for number n
	public static BigInteger Factor(int n) {
		BigInteger result = new BigInteger("1");
		for (int factor = 2; factor < n+1; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
		return result;
	}
	
	//Timers for different methods, which one is faster?
	public static long timerPascal(int a) {
		long startTime = System.nanoTime();
		pascalTriangle(a);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime); 
		return duration;
	}
	
	public static long timernCr(int a) {
		long startTime = System.nanoTime();
		nCr(a);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime); 
		return duration;
	}

}
