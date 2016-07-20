package assignment2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
	private Digits[] digit;
	private Operator[] operator;
	private Layout layout;
	private Display display;

	//Constructor
	public Calculator(){
	}

	//initialize all the objects
	public Calculator(int digit, int operator) {	
	}
	
	// Sending options 
	public Operator[] getOperator() {
		return operator;
	}
	
	// Setting the layout
	public void setLayout(Layout layout) {
		this.layout = layout;
	}

	// To set Display unit
	public void setDisplay(Display display) {
		this.display = display;
	}
	
	// Get Layout
	public Layout getLayout() {
		return layout;
	}
	
	// Get Different Displays
	public Display getDisplay() {
		return display;
	}

	//logic for action when the buttons are clicked
	@Override
	public void actionPerformed(ActionEvent e) {
	}

	public Digits[] getDigits() {
	//sending the reference for 
	return digit;
	}
}
