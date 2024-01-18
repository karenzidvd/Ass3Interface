package com.all;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Revenue implements ActionListener{

	//create frame object
	JFrame frame;

	JLabel revenue=new JLabel("Revenue");
	JTextField input=new JTextField();
	JLabel period=new JLabel("Number of months");
	JTextField periodVal=new JTextField();
	JTextField answer=new JTextField();

	JButton calculate=new JButton("Calculate");

	LineBorder border = new LineBorder(Color.WHITE, 1, true);
	
	public Revenue() {
		
		CreateWindow();
		SetLocationAndSize();
		AddComponentsToFrame();
		addActionEvent();
	}
	
	public void addActionEvent() {
		
		calculate.addActionListener(this);
	}
	
	public void CreateWindow() {

		//frame 
		frame=new JFrame();
		frame.setTitle("Calculate Revenue");
		frame.setSize(400, 300);
		frame.getContentPane().setBackground(Color.gray);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void SetLocationAndSize() {
		
		revenue.setBounds(50,50, 150, 30);
		revenue.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		revenue.setBorder(border);
		revenue.setHorizontalAlignment(revenue.CENTER);

		input.setBounds(250,50, 120, 30);
		input.setForeground(Color.BLACK);
		input.setBorder(BorderFactory.createLoweredBevelBorder());
		input.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		period.setBounds(50,100, 150, 30);
		period.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		period.setBorder(border);
		period.setHorizontalAlignment(revenue.CENTER);

		periodVal.setBounds(250,100, 120, 30);
		periodVal.setForeground(Color.BLACK);
		periodVal.setBorder(BorderFactory.createLoweredBevelBorder());
		periodVal.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		answer.setBounds(50,150, 320, 30);
		answer.setForeground(Color.BLUE);
		answer.setBorder(BorderFactory.createLoweredBevelBorder());
		answer.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		calculate.setBounds(135, 200, 100, 30);
	}
	
	public void AddComponentsToFrame() {
		
		frame.add(revenue);
		frame.add(input);
		frame.add(answer);
		frame.add(calculate);
		frame.add(period);
		frame.add(periodVal);
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==calculate) {
			calculateTotalRevenue();
		}
	}
	private void calculateTotalRevenue() {
		
		try {
			
			double rev = Double.parseDouble(input.getText());
			int months = Integer.parseInt(periodVal.getText());
			double totalRevenue = rev * months;
			answer.setForeground(Color.BLUE);
			answer.setText("Total Revenue: " + totalRevenue);
		} 
		catch (NumberFormatException ex) {
			
			answer.setForeground(Color.RED);
			answer.setText("Invalid input. Please enter valid numbers.");
		}
	}
	
	public static void main(String[] args) {
		 
		Revenue revenue=new Revenue();
	}
}
