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

public class AreaRectangle implements ActionListener {
	
	//frame
	JFrame frame;
	//Labels and fields

	JLabel width=new JLabel("Width");
	JTextField widthVal=new JTextField();

	JLabel height=new JLabel("Height");
	JTextField heightVal=new JTextField();

	JLabel area=new JLabel("Area");
	JTextField areaVal=new JTextField();

	//Button
	JButton btn=new JButton("Calculate");

	public AreaRectangle() {
		
		createWindow();	
		setLocationAndSize();
		addComponentsToFrame();
		addActionEvent();
	}
	
	public void createWindow() {
		
		frame=new JFrame();
		frame.setTitle("AreaReactangle area calculation");
		frame.setSize(350,350);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public void setLocationAndSize() {
		
		width.setBounds(50, 50, 100, 30);
		width.setBorder(BorderFactory.createLineBorder(Color.white));
		width.setFont(new Font("Times new roman", Font.PLAIN, 20));

		widthVal.setBounds(200, 50, 100, 30);
		widthVal.setBorder(BorderFactory.createLoweredBevelBorder());
		widthVal.setFont(new Font("Times new roman", Font.PLAIN, 20));
		widthVal.setForeground(Color.BLACK);

		height.setBounds(50, 100, 100, 30);
		height.setBorder(BorderFactory.createLineBorder(Color.white));
		height.setFont(new Font("Times new roman", Font.PLAIN, 20));

		heightVal.setBounds(200, 100, 100, 30);
		heightVal.setBorder(BorderFactory.createLoweredBevelBorder());
		heightVal.setFont(new Font("Times new roman", Font.PLAIN, 20));
		heightVal.setForeground(Color.BLACK);

		area.setBounds(50, 150, 250, 30);
		area.setFont(new Font("Times new roman", Font.PLAIN, 20));

		areaVal.setBounds(50, 200, 250, 30);
		areaVal.setBorder(BorderFactory.createLoweredBevelBorder());
		areaVal.setFont(new Font("Times new roman", Font.PLAIN, 20));
		areaVal.setForeground(Color.BLUE);

		btn.setBounds(125, 250, 100, 30);

	}

	public void addComponentsToFrame() {
		
		frame.add(width);
		frame.add(height);
		frame.add(widthVal);
		frame.add(heightVal);
		frame.add(area);
		frame.add(areaVal);
		frame.add(btn);

	}

	public void addActionEvent() {
		
		btn.addActionListener(this);
	}

	public void calculateArea() {

		try {
			
			float w=Float.parseFloat(widthVal.getText());
			float h=Float.parseFloat(heightVal.getText());
			Float a=w*h;
			areaVal.setForeground(Color.BLUE);
			areaVal.setText(Float.toString(a));
		} 
		
		catch (Exception e) {
			
			areaVal.setForeground(Color.RED);
			areaVal.setText(e.getMessage());	
		}


	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn) {
			
			calculateArea();
		}
	}
	public static void main(String[] args) {
		
		AreaRectangle rectangleArea=new AreaRectangle();
	}
}
