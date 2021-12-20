
// 어설프게밖에 구현이 안되었음. 


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	




public class Calculator extends JFrame {
	
	private JFrame frame;
	private String func = "ADD";
	private int firstNumber;
	
	
	public Calculator() {
		
		
		setSize(730, 340);
		setTitle("Calculator");
		setLocationRelativeTo(null);
		setLayout(null);
		setBackground(Color.white);
		setResizable(false);
		
		JPanel Number = new JPanel();
		Number.setBackground(Color.white);
		JPanel NumberButton = new JPanel();
		
		Number.setBounds(0,0,710,30);
		
		GridLayout gl = new GridLayout(5,5,2,2);
		NumberButton.setLayout(gl);
		JLabel label = new JLabel("0");
		label.setForeground(Color.DARK_GRAY);
		NumberButton.setBounds(0,30,710,270);
		
		
		
		class NumberActionListener implements ActionListener{
			private JLabel label;
			private String text;
			
			public NumberActionListener(JLabel l, String s){
				label = l;
				text = s;
			}
			
			public void actionPerformed(ActionEvent e) {
				String curr = label.getText();
				if(curr.equals("0")){
					label.setText(text);
				}
				else{
					label.setText(label.getText()+text);
				}
			}
		};
		
		
			
		JButton b1 = new JButton("Backspace");
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.blue);

		JButton b2 = new JButton("");
		b2.setBackground(Color.yellow);
		
		JButton b3 = new JButton("");
		b3.setBackground(Color.yellow);
		
		JButton b4 = new JButton("CE");
		b4.setBackground(Color.yellow);
		b4.setForeground(Color.red);
		
		JButton b5 = new JButton("C");
		b5.setBackground(Color.yellow);
		b5.setForeground(Color.red);
		
		JButton b6 = new JButton("7");
		b6.setBackground(Color.yellow);
		b6.setForeground(Color.blue);
		
		JButton b7 = new JButton("8");
		b7.setBackground(Color.yellow);
		b7.setForeground(Color.blue);
		
		JButton b8 = new JButton("9");
		b8.setBackground(Color.yellow);
		b8.setForeground(Color.blue);
		
		JButton b9 = new JButton("/");
		b9.setBackground(Color.yellow);
		b9.setForeground(Color.red);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = label.getText();
				firstNumber = Integer.parseInt(curr);
				label.setText("0");
				func = "DIV";
			}
		});
		
		JButton b10 = new JButton("sqrt");
		b10.setBackground(Color.yellow);
		b10.setForeground(Color.red);
		
		JButton b11 = new JButton("4");
		b11.setBackground(Color.yellow);
		b11.setForeground(Color.blue);
		
		JButton b12 = new JButton("5");
		b12.setBackground(Color.yellow);
		b12.setForeground(Color.blue);
		
		JButton b13 = new JButton("6");
		b13.setBackground(Color.yellow);
		b13.setForeground(Color.blue);
		
		JButton b14 = new JButton("X");
		b14.setBackground(Color.yellow);
		b14.setForeground(Color.red);
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = label.getText();
				firstNumber = Integer.parseInt(curr);
				label.setText("0");
				func = "MULT";
			}
		});
		
		JButton b15 = new JButton("%");
		b15.setBackground(Color.yellow);
		b15.setForeground(Color.red);
		
		JButton b16 = new JButton("1");
		b16.setBackground(Color.yellow);
		b16.setForeground(Color.blue);
		
		JButton b17 = new JButton("2");
		b17.setBackground(Color.yellow);
		b17.setForeground(Color.blue);
		
		JButton b18 = new JButton("3");
		b18.setBackground(Color.yellow);
		b18.setForeground(Color.blue);
		
		JButton b19 = new JButton("-");
		b19.setBackground(Color.yellow);
		b19.setForeground(Color.red);
		b19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = label.getText();
				firstNumber = Integer.parseInt(curr);
				label.setText("0");
				func = "SUB";
			}
		});
		
		JButton b20 = new JButton("1/x");
		b20.setBackground(Color.yellow);
		b20.setForeground(Color.red);
		
		JButton b21 = new JButton("0");
		b21.setBackground(Color.yellow);
		b21.setForeground(Color.blue);
		
		JButton b22 = new JButton("+/-");
		b22.setBackground(Color.yellow);
		b22.setForeground(Color.blue);
		
		JButton b23 = new JButton(".");
		b23.setBackground(Color.yellow);
		b23.setForeground(Color.blue);
		
		JButton b24 = new JButton("+");
		b24.setBackground(Color.yellow);
		b24.setForeground(Color.red);
		b24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = label.getText();
				firstNumber = Integer.parseInt(curr);
				label.setText("0");
				func = "ADD";
			}
		});
		
		JButton b25 = new JButton("=");
		b25.setBackground(Color.yellow);
		b25.setForeground(Color.red);
		
		
		b25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(func){
					case "ADD":{
						int currValue = Integer.parseInt(label.getText());
						label.setText((firstNumber+currValue)+"");
						break;
					}
					case "SUB":{
						int currValue = Integer.parseInt(label.getText());
						label.setText((firstNumber-currValue)+"");
						break;
					}
					case "MULT":{
						int currValue = Integer.parseInt(label.getText());
						label.setText((firstNumber*currValue)+"");
						break;
					}
					case "DIV":{
						int currValue = Integer.parseInt(label.getText());
						label.setText((firstNumber/currValue)+"");
						break;
					}
				}
			}
		});
		
		
		Number.add(label);
		NumberButton.add(b1);
		NumberButton.add(b2);
		NumberButton.add(b3);
		NumberButton.add(b4);
		NumberButton.add(b5);
		NumberButton.add(b6);
		NumberButton.add(b7);
		NumberButton.add(b8);
		NumberButton.add(b9);
		NumberButton.add(b10);
		NumberButton.add(b11);
		NumberButton.add(b12);
		NumberButton.add(b13);
		NumberButton.add(b14);
		NumberButton.add(b15);
		NumberButton.add(b16);
		NumberButton.add(b17);
		NumberButton.add(b18);
		NumberButton.add(b19);
		NumberButton.add(b20);
		NumberButton.add(b21);
		NumberButton.add(b22);
		NumberButton.add(b23);
		NumberButton.add(b24);
		NumberButton.add(b25);
		
		b21.addActionListener(new NumberActionListener(label,"0"));
		b16.addActionListener(new NumberActionListener(label,"1"));
		b17.addActionListener(new NumberActionListener(label,"2"));
		b18.addActionListener(new NumberActionListener(label,"3"));
		b11.addActionListener(new NumberActionListener(label,"4"));
		b12.addActionListener(new NumberActionListener(label,"5"));
		b13.addActionListener(new NumberActionListener(label,"6"));
		b6.addActionListener(new NumberActionListener(label,"7"));
		b7.addActionListener(new NumberActionListener(label,"8"));
		b8.addActionListener(new NumberActionListener(label,"9"));
		
		
		
		
		

		add(Number);
		add(NumberButton);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		

		Calculator C= new Calculator();
	}
}
			
		
		
			
		
		
	





