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

public class ReturnBasedOnPeriod implements ActionListener{

	JFrame frame;
	//Labels and text fields
	JLabel amount =new JLabel("Amount");
	JTextField amountVal=new JTextField();
	
	JLabel period =new JLabel("Period");
	JTextField periodVal=new JTextField();
	
	JLabel ret=new JLabel("Return");
	JTextField retVal=new JTextField();
	
	//Button
	JButton calculateButton=new JButton("Calculate");
	
	public ReturnBasedOnPeriod() {
	createWindow();	
	setLocationAndSize();
	addComponentsToFrame();
	addActionEvent();
	}
	
	public void createWindow() {
		
		frame=new JFrame();
		frame.setTitle("Fill this form to calculate return based on period");
		frame.setSize(500,400);
		frame.getContentPane().setBackground(Color.gray);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
	
	public void setLocationAndSize() {
		
		amount.setBounds(50,50,120, 30);
		amount.setFont(new Font("Times new roman", Font.PLAIN, 22));
		amount.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));
		//amount.setHorizontalAlignment(amount.CENTER);
		
		amountVal.setBounds(200, 50, 200, 30);
		amountVal.setFont(new Font("Times new roman", Font.PLAIN, 22));
		amountVal.setForeground(Color.BLACK);
		amountVal.setBorder(BorderFactory.createLoweredBevelBorder());
		
		period.setBounds(50, 100, 120, 30);
		period.setFont(new Font("Times new roman", Font.PLAIN, 22));
		period.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));
		//rate.setHorizontalAlignment(rate.CENTER);
		
		periodVal.setBounds(200, 100, 200, 30);
		periodVal.setFont(new Font("Times new roman", Font.PLAIN, 22));
		periodVal.setBorder(BorderFactory.createLoweredBevelBorder());
		periodVal.setForeground(Color.BLACK);
		
		ret.setBounds(50, 150, 120, 30);
		ret.setFont(new Font("Times new roman", Font.PLAIN, 22));
		ret.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));
		//ret.setHorizontalAlignment(ret.CENTER);
		
			
		retVal.setBounds(200, 150, 200, 30);
		retVal.setFont(new Font("Times new roman", Font.PLAIN, 12));
		retVal.setBorder(BorderFactory.createLoweredBevelBorder());
		retVal.setForeground(Color.BLACK);
		retVal.setForeground(Color.BLUE);
		
		calculateButton.setBounds(150, 200, 100, 30);
		
	}
	
	public void addComponentsToFrame() {
		
		frame.add(amount);
		frame.add(amountVal);
		frame.add(ret);
		frame.add(retVal);
		frame.add(period);
		frame.add(periodVal);
		frame.add(calculateButton);
	}
	
	public void addActionEvent() {
		
		calculateButton.addActionListener(this);
	}
	
	public void calculateReturnBasedOnPeriod() {
		
		try {
			
			double amount=Double.parseDouble(amountVal.getText());
			int period=Integer.parseInt(periodVal.getText());
			double returned =amount*period;
			retVal.setForeground(Color.BLUE);
			retVal.setText(""+returned);
		}
		catch (NumberFormatException ex) {
			
			retVal.setForeground(Color.RED);
			retVal.setText("Invalid input. Please enter valid numbers.");
		}

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	if(e.getSource()==calculateButton) {
		
		calculateReturnBasedOnPeriod();
	}
		
	}
public static void main(String[] args) {
	
	ReturnBasedOnPeriod returnBasedOnPeriod=new ReturnBasedOnPeriod();
}
}

