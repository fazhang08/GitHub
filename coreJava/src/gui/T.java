package gui;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class T {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JTextField   tf1   =   new   JTextField(10); 
		 JTextField   tf2   =   new   JTextField(10); 
		 JTextArea   ta   =   new   JTextArea(5,   10); 
		 JScrollPane   sp   =   new   JScrollPane(ta); 

		 int   r   =   JOptionPane.showConfirmDialog( 
		 null,   new   Object[]   { "Name: ",   tf1,   "Age: ",   tf2,   "Comment: ",   sp},   "Test ",   
		 JOptionPane.OK_CANCEL_OPTION,   JOptionPane.PLAIN_MESSAGE); 

		 if   (r   ==   JOptionPane.OK_OPTION)   { 
		 String   name   =   tf1.getText(); 
		 String   age   =   tf2.getText(); 
		 String   comment   =   ta.getText(); 
		 }

	}

}
