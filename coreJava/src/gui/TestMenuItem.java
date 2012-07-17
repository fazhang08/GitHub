package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TestMenuItem {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		 int x=200,y=200,width=400,height=400;		
		  final JFrame j=new JFrame();
		  j.setLayout(new GridLayout(10, 1));
		  JMenuBar jb=new JMenuBar();
		  j.add(jb);
		  JMenu jm=new JMenu("菜单");	
		  jb.add(jm);
		  JMenuItem jm1=new JMenuItem("选项1");
		  JMenuItem jm2=new JMenuItem("选项2");
		  JMenuItem jm3=new JMenuItem("选项3");	
		  ActionListener al =new ActionListener(){
		   public void actionPerformed(ActionEvent e) {
		       String buttonString=e.getActionCommand();	
			if(buttonString.equals("选项1"))
			JOptionPane.showMessageDialog(j, "您选择了    选项1");
			else if(buttonString.equals("选项2"))
			JOptionPane.showMessageDialog(j, "您选择了   选项2");
			else if(buttonString.equals("选项3"))
			JOptionPane.showMessageDialog(j, "您选择了   选项3");
			}
		};
	      jm1.addActionListener(al);
	      jm2.addActionListener(al);
   	      jm3.addActionListener(al);
		  
		  jm.add(jm1);
		  jm.add(jm2);
		  jm.add(jm3);		  
		  j.setBounds(x, y, width, height);	
		  j.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		  j.setVisible(true);
	  
		  }

	}


