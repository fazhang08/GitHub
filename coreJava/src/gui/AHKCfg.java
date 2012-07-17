package gui;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.apache.commons.lang.math.NumberUtils;

public class AHKCfg {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		  JTextField AutoHotkey = new JTextField();
		  
		  AutoHotkey.setText("AutoHotkey");
		  
	      JTextField AutoScriptWriter = new JTextField();
	      
	      JTextField RunCount = new JTextField();
          
	      int result = JOptionPane.showConfirmDialog(null, new Object[]{"AutoHotkey",AutoHotkey,"AutoScriptWriter",AutoScriptWriter,"RunCount",RunCount},
	    		  "AutoHotKey Environment Configuration", JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
	      
		  if(result == JOptionPane.OK_OPTION)
		  {
			  String sAutoHotkey = AutoHotkey.getText();
			  
			  String sAutoScriptWriter = AutoScriptWriter.getText();
			  
			  String sRunCount = RunCount.getText();
			  
			  if(sAutoHotkey.trim().length()==0)
			  {
				  JOptionPane.showMessageDialog(null, "配置失败 ！请配置AutoHotkey环境 ！"); 
			  }else if(sAutoScriptWriter.trim().length()==0)
			  {
				  JOptionPane.showMessageDialog(null, "配置失败 ！请配置AutoScriptWriter环境 ！"); 
			  }else if(sRunCount.trim().length()==0)
			  {
				  JOptionPane.showMessageDialog(null, "配置失败 ！请配置RunCount！");
			  }else if(!NumberUtils.isNumber(sRunCount.trim()))
			  {
				  JOptionPane.showMessageDialog(null, "配置失败 ！RunCount 必须为整数！");
			  }
			 
			
			  System.out.println("sAutoHotkey: " + sAutoHotkey + "\n" + "sAutoScriptWriter: " + sAutoScriptWriter + "\n" + "sRunCount: " + sRunCount);
		  }else
		  {
			  JOptionPane.showMessageDialog(null, "AutoHotKey 环境配置失败 ！");
		  }

	}

}
