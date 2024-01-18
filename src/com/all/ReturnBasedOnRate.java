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

public class ReturnBasedOnRate implements ActionListener{

	JFrame frame;
	//Labels and text fields
	JLabel amount =new JLabel("Amount");
	JTextField amountVal=new JTextField();
	
	JLabel rate =new JLabel("Rate");
	JTextField rateVal=new JTextField();
	
	JLabel ret=new JLabel("Return");
	JTextField retVal=new JTextField();
	
	//Button
	JButton calculateButton=new JButton("Calculate");
	
	public ReturnBasedOnRate() {
		 
	createWindow();	
	setLocationAndSize();
	addComponentsToFrame();
	addActionEvent();
	}
	
	public void createWindow() {
		
		frame=new JFrame();
		frame.setTitle("Fill this form to calculate return based on rate");
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
		
		rate.setBounds(50, 100, 120, 30);
		rate.setFont(new Font("Times new roman", Font.PLAIN, 22));
		rate.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));
		//rate.setHorizontalAlignment(rate.CENTER);
		
		rateVal.setBounds(200, 100, 200, 30);
		rateVal.setFont(new Font("Times new roman", Font.PLAIN, 22));
		rateVal.setBorder(BorderFactory.createLoweredBevelBorder());
		rateVal.setForeground(Color.BLACK);
		
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
		frame.add(rate);
		frame.add(rateVal);
		frame.add(calculateButton);
	}
	
	public void addActionEvent() {
		
		calculateButton.addActionListener(this);
	}
	
	public void calculateReturnBasedOnRate() {
		
		try {
			
			double amount=Double.parseDouble(amountVal.getText());
			float rate=Float.parseFloat(rateVal.getText());
			double returned =amount*rate/100;
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
		
		calculateReturnBasedOnRate();
	}
		
	}
public static void main(String[] args) {
	
	ReturnBasedOnRate returnBasedOnRate=new ReturnBasedOnRate();
}
}