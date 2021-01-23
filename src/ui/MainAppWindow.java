package ui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import logic.CalculatorLogic;

public class MainAppWindow {
	
	public double number1;
	public double number2;
	public double result;
	public double lastResult;
	public char operator;
	private boolean decimalFlag = false; 
	private boolean negativeFlag = false;

	private JFrame frame;
	private CalculatorLogic calculatorLogic = new CalculatorLogic();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainAppWindow window = new MainAppWindow();
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
	public MainAppWindow() {
		this.number1 = 0.0;
		this.number2 = 0.0;
		this.result = 0.0;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Swing Calculator");
		frame.setResizable(false);
		frame.setForeground(Color.BLACK);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 360, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setForeground(new Color(123, 104, 238));
		mainPanel.setBackground(Color.BLACK);
		mainPanel.setBounds(0, 0, 354, 382);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel secondaryLabel = new JLabel();
		secondaryLabel.setBorder(new EmptyBorder(0, 5, 0, 5));
		secondaryLabel.setOpaque(true);
		secondaryLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		secondaryLabel.setForeground(Color.WHITE);
		secondaryLabel.setFont(new Font("Calibri", Font.PLAIN, 26));
		secondaryLabel.setBackground(new Color(102, 0, 204));
		secondaryLabel.setBounds(12, 12, 319, 45);
		mainPanel.add(secondaryLabel);
		
		JLabel primaryLabel = new JLabel();
		primaryLabel.setBorder(new EmptyBorder(0, 5, 0, 5));
		primaryLabel.setOpaque(true);
		primaryLabel.setBackground(new Color(102, 0, 204));
		primaryLabel.setFont(new Font("Calibri", Font.PLAIN, 26));
		primaryLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		primaryLabel.setForeground(Color.WHITE);
		primaryLabel.setBounds(12, 57, 319, 45);
		mainPanel.add(primaryLabel);
		
		JSeparator sepLabelBtns = new JSeparator();
		sepLabelBtns.setBounds(12, 114, 319, 2);
		mainPanel.add(sepLabelBtns);
		
		JButton oneBtn = new JButton("1");
		oneBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primaryLabel.setText(primaryLabel.getText() + "1");
			}
		});
		oneBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		oneBtn.setOpaque(false);
		oneBtn.setIconTextGap(0);
		oneBtn.setForeground(Color.WHITE);
		oneBtn.setFont(new Font("Tahoma", Font.PLAIN, 36));
		oneBtn.setBorder(new LineBorder(new Color(123, 104, 238), 3));
		oneBtn.setBackground(new Color(255, 69, 0));
		oneBtn.setBounds(12, 252, 50, 50);
		mainPanel.add(oneBtn);
		
		JButton twoBtn = new JButton("2");
		twoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primaryLabel.setText(primaryLabel.getText() + "2");
			}
		});
		twoBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		twoBtn.setOpaque(false);
		twoBtn.setIconTextGap(0);
		twoBtn.setForeground(Color.WHITE);
		twoBtn.setFont(new Font("Tahoma", Font.PLAIN, 36));
		twoBtn.setBorder(new LineBorder(new Color(123, 104, 238), 3));
		twoBtn.setBackground(new Color(255, 69, 0));
		twoBtn.setBounds(74, 252, 50, 50);
		mainPanel.add(twoBtn);
		
		JButton threeBtn = new JButton("3");
		threeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primaryLabel.setText(primaryLabel.getText() + "3");
			}
		});
		threeBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		threeBtn.setOpaque(false);
		threeBtn.setIconTextGap(0);
		threeBtn.setForeground(Color.WHITE);
		threeBtn.setFont(new Font("Tahoma", Font.PLAIN, 36));
		threeBtn.setBorder(new LineBorder(new Color(123, 104, 238), 3));
		threeBtn.setBackground(new Color(255, 69, 0));
		threeBtn.setBounds(136, 252, 50, 50);
		mainPanel.add(threeBtn);
		
		JButton fourBtn = new JButton("4");
		fourBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primaryLabel.setText(primaryLabel.getText() + "4");
			}
		});
		fourBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fourBtn.setOpaque(false);
		fourBtn.setIconTextGap(0);
		fourBtn.setForeground(Color.WHITE);
		fourBtn.setFont(new Font("Tahoma", Font.PLAIN, 36));
		fourBtn.setBorder(new LineBorder(new Color(123, 104, 238), 3));
		fourBtn.setBackground(new Color(255, 69, 0));
		fourBtn.setBounds(12, 190, 50, 50);
		mainPanel.add(fourBtn);
		
		JButton fiveBtn = new JButton("5");
		fiveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primaryLabel.setText(primaryLabel.getText() + "5");
			}
		});
		fiveBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fiveBtn.setOpaque(false);
		fiveBtn.setIconTextGap(0);
		fiveBtn.setForeground(Color.WHITE);
		fiveBtn.setFont(new Font("Tahoma", Font.PLAIN, 36));
		fiveBtn.setBorder(new LineBorder(new Color(123, 104, 238), 3));
		fiveBtn.setBackground(new Color(255, 69, 0));
		fiveBtn.setBounds(74, 190, 50, 50);
		mainPanel.add(fiveBtn);
		
		JButton sixBtn = new JButton("6");
		sixBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primaryLabel.setText(primaryLabel.getText() + "6");
			}
		});
		sixBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sixBtn.setOpaque(false);
		sixBtn.setIconTextGap(0);
		sixBtn.setForeground(Color.WHITE);
		sixBtn.setFont(new Font("Tahoma", Font.PLAIN, 36));
		sixBtn.setBorder(new LineBorder(new Color(123, 104, 238), 3));
		sixBtn.setBackground(new Color(255, 69, 0));
		sixBtn.setBounds(136, 190, 50, 50);
		mainPanel.add(sixBtn);
		
		JButton sevenBtn = new JButton("7");
		sevenBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primaryLabel.setText(primaryLabel.getText() + "7");
			}
		});
		sevenBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sevenBtn.setIconTextGap(0);
		sevenBtn.setBorder(new LineBorder(new Color(123, 104, 238), 3));
		sevenBtn.setFont(new Font("Tahoma", Font.PLAIN, 36));
		sevenBtn.setOpaque(false);
		sevenBtn.setForeground(new Color(255, 255, 255));
		sevenBtn.setBackground(new Color(255, 69, 0));
		sevenBtn.setBounds(12, 128, 50, 50);
		mainPanel.add(sevenBtn);
		
		JButton eightBtn = new JButton("8");
		eightBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primaryLabel.setText(primaryLabel.getText() + "8");
			}
		});
		eightBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		eightBtn.setOpaque(false);
		eightBtn.setIconTextGap(0);
		eightBtn.setForeground(Color.WHITE);
		eightBtn.setFont(new Font("Tahoma", Font.PLAIN, 36));
		eightBtn.setBorder(new LineBorder(new Color(123, 104, 238), 3));
		eightBtn.setBackground(new Color(255, 69, 0));
		eightBtn.setBounds(74, 128, 50, 50);
		mainPanel.add(eightBtn);
		
		JButton nineBtn = new JButton("9");
		nineBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primaryLabel.setText(primaryLabel.getText() + "9");
			}
		});
		nineBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		nineBtn.setOpaque(false);
		nineBtn.setIconTextGap(0);
		nineBtn.setForeground(Color.WHITE);
		nineBtn.setFont(new Font("Tahoma", Font.PLAIN, 36));
		nineBtn.setBorder(new LineBorder(new Color(123, 104, 238), 3));
		nineBtn.setBackground(new Color(255, 69, 0));
		nineBtn.setBounds(136, 129, 50, 50);
		mainPanel.add(nineBtn);
		
		JButton zeroBtn = new JButton("0");
		zeroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!primaryLabel.getText().equals("0")) {
					primaryLabel.setText(primaryLabel.getText() + "0");
				} else if(primaryLabel.getText().equals("0")) {
					primaryLabel.setText("0");
				}
			}
		});
		zeroBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		zeroBtn.setOpaque(false);
		zeroBtn.setIconTextGap(0);
		zeroBtn.setForeground(Color.WHITE);
		zeroBtn.setFont(new Font("Tahoma", Font.PLAIN, 36));
		zeroBtn.setBorder(new LineBorder(new Color(123, 104, 238), 3));
		zeroBtn.setBackground(new Color(255, 69, 0));
		zeroBtn.setBounds(12, 314, 112, 50);
		mainPanel.add(zeroBtn);
		
		JButton decimalBtn = new JButton(".");
		decimalBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((primaryLabel.getText()=="" || primaryLabel.getText()==null) && decimalFlag == false) {
					primaryLabel.setText("0.");
					decimalFlag = true;
				} else if ((primaryLabel.getText() != "" || primaryLabel.getText() != null) && decimalFlag == false) {
					primaryLabel.setText(primaryLabel.getText() + ".");
					decimalFlag = true;
				}
				
			}
		});
		decimalBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		decimalBtn.setOpaque(false);
		decimalBtn.setIconTextGap(0);
		decimalBtn.setForeground(Color.WHITE);
		decimalBtn.setFont(new Font("Tahoma", Font.PLAIN, 36));
		decimalBtn.setBorder(new LineBorder(new Color(123, 104, 238), 3));
		decimalBtn.setBackground(new Color(255, 69, 0));
		decimalBtn.setBounds(136, 314, 50, 50);
		mainPanel.add(decimalBtn);
		
		JSeparator sepNumOp = new JSeparator();
		sepNumOp.setOrientation(SwingConstants.VERTICAL);
		sepNumOp.setBounds(198, 128, 2, 235);
		mainPanel.add(sepNumOp);
		
		JButton mulBtn = new JButton("X");
		mulBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondaryLabel.setText(primaryLabel.getText());
				primaryLabel.setText("");
				operator = '*';
				decimalFlag = false;
				negativeFlag = false;
			}
		});
		mulBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mulBtn.setOpaque(false);
		mulBtn.setIconTextGap(0);
		mulBtn.setForeground(Color.WHITE);
		mulBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		mulBtn.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		mulBtn.setBackground(new Color(255, 69, 0));
		mulBtn.setBounds(212, 129, 55, 50);
		mainPanel.add(mulBtn);
		
		JButton divBtn = new JButton("/");
		divBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondaryLabel.setText(primaryLabel.getText());
				primaryLabel.setText("");
				operator = '/';
				decimalFlag = false;
				negativeFlag = false;
			}
		});
		divBtn.setOpaque(false);
		divBtn.setIconTextGap(0);
		divBtn.setForeground(Color.WHITE);
		divBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		divBtn.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		divBtn.setBackground(new Color(255, 69, 0));
		divBtn.setBounds(276, 129, 55, 50);
		mainPanel.add(divBtn);
		
		JButton addBtn = new JButton("+");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondaryLabel.setText(primaryLabel.getText());
				primaryLabel.setText("");
				operator = '+';
				decimalFlag = false;
				negativeFlag = false;
			}
		});
		addBtn.setOpaque(false);
		addBtn.setIconTextGap(0);
		addBtn.setForeground(Color.WHITE);
		addBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		addBtn.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		addBtn.setBackground(new Color(255, 69, 0));
		addBtn.setBounds(212, 190, 55, 50);
		mainPanel.add(addBtn);
		
		JButton subtBtn = new JButton("-");
		subtBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(primaryLabel.getText().equals("")) {
					negativeFlag = true;
					primaryLabel.setText("-");
				} else if(!primaryLabel.getText().equals("-")) {
					secondaryLabel.setText(primaryLabel.getText());
					primaryLabel.setText("");
					operator = '-';
					decimalFlag = false;
					negativeFlag = false;
				}
			}
		});
		subtBtn.setOpaque(false);
		subtBtn.setIconTextGap(0);
		subtBtn.setForeground(Color.WHITE);
		subtBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		subtBtn.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		subtBtn.setBackground(new Color(255, 69, 0));
		subtBtn.setBounds(276, 190, 55, 50);
		mainPanel.add(subtBtn);
		
		JButton clrBtn = new JButton("CLR");
		clrBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decimalFlag = false;
				negativeFlag = false;
				primaryLabel.setText("");
				secondaryLabel.setText("");
			}
		});
		clrBtn.setOpaque(false);
		clrBtn.setIconTextGap(0);
		clrBtn.setForeground(Color.WHITE);
		clrBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		clrBtn.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		clrBtn.setBackground(new Color(255, 69, 0));
		clrBtn.setBounds(212, 252, 55, 50);
		mainPanel.add(clrBtn);
		
		JButton equalBtn = new JButton("=");
		equalBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!primaryLabel.getText().isEmpty() && !secondaryLabel.getText().isEmpty()) {
					number1 = Double.parseDouble(secondaryLabel.getText());
					number2 = Double.parseDouble(primaryLabel.getText());
					secondaryLabel.setText("");
					result = calculatorLogic.calculateAnswer(number1, number2, operator);
					lastResult = result;
					primaryLabel.setText(String.valueOf(result));
					decimalFlag = false;
					negativeFlag = false;
				}
			}
		});
		equalBtn.setOpaque(false);
		equalBtn.setIconTextGap(0);
		equalBtn.setForeground(Color.WHITE);
		equalBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		equalBtn.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		equalBtn.setBackground(new Color(255, 69, 0));
		equalBtn.setBounds(212, 314, 119, 50);
		mainPanel.add(equalBtn);
		
		JButton delBtn = new JButton("DEL");
		delBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(primaryLabel.getText().length()>0) {
					String toBeDeleted = primaryLabel.getText();
					int stringLength = toBeDeleted.length();
					String newString = "";
					char lastCharacter = toBeDeleted.charAt(stringLength-1);
					if(lastCharacter == '.' || lastCharacter == 46) {
						decimalFlag = false;
					} else if(lastCharacter == '-' || lastCharacter == 45) {
						negativeFlag = false;
					}
					for(int i=0; i<stringLength-1; i++) {
						newString = newString + toBeDeleted.charAt(i);
					}
					primaryLabel.setText(newString);
				}
			}
		});
		delBtn.setOpaque(false);
		delBtn.setIconTextGap(0);
		delBtn.setForeground(Color.WHITE);
		delBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		delBtn.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		delBtn.setBackground(new Color(255, 69, 0));
		delBtn.setBounds(276, 252, 55, 50);
		mainPanel.add(delBtn);

	}
}
