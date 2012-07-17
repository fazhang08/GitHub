package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

public class Profile_Data 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
		{

			@Override
			public void run() 
			{
				ProfileFrame frame = new ProfileFrame();
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				frame.setLocation(500, 150);
				
				frame.setVisible(true);
				
			}
			
		});

	}

}

class ProfileFrame extends JFrame
{
	
	
	public ProfileFrame()
	{
		setTitle("Profile_Data");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		
		JMenu fileMenu = new JMenu("File");
		
		//demonstrate accelerators
		importAction = new MenuAction("Import");
		JMenuItem importItem = fileMenu.add(importAction);
		importItem.setAccelerator(KeyStroke.getKeyStroke("ctrl I"));
		fileMenu.addSeparator();
		
	    exportAction = new MenuAction("Export");
	    JMenuItem exportItem = fileMenu.add(exportAction);
	    exportItem.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));
	    fileMenu.addSeparator();
	    
	    fileMenu.add(new AbstractAction("Exit")
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
	    
	    
		
	    JMenu configMenu = new JMenu("Config");
	    
	    MenuAction runCountAction = new MenuAction("Run count"); 
	    JMenuItem runCountItem = configMenu.add(runCountAction);
	    
	    
	    JMenu runMenu = new JMenu("Run");
	    MenuAction ahkAction = new MenuAction("AHK");
	    JMenuItem ahkItem = runMenu.add(ahkAction);
	    ahkItem.setAccelerator(KeyStroke.getKeyStroke("ctrl AH"));
	    runMenu.addSeparator();
	    
	    
	    MenuAction dataAnalystAction = new MenuAction("Data Analyst");
	    JMenuItem dataAnalystItem = runMenu.add(dataAnalystAction);
	    dataAnalystItem.setAccelerator(KeyStroke.getKeyStroke("ctrl DA"));

	    
	    
	    JMenu helpMenu = new JMenu("Help");
	    
	    MenuAction aboutAction = new MenuAction("About");
	    helpMenu.add(aboutAction);
	    
	    
	  //demonstrate icons
		
	  	Action cutAction = new MenuAction("Cut");
	  		
	  	cutAction.putValue(Action.SMALL_ICON, new ImageIcon("cut.gif"));
	  		
	  	Action copyAction = new MenuAction("Copy");
	  		
	  	copyAction.putValue(Action.SMALL_ICON, new ImageIcon("copy.gif"));
	  		
	  	Action pasteAction = new MenuAction("Pase");
	  		
	  	pasteAction.putValue(Action.SMALL_ICON, new ImageIcon("paste.gif"));
	  	
	    
	    //add all top-level
	    JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
	    
	    menuBar.add(fileMenu);
	    menuBar.add(configMenu);
	    menuBar.add(runMenu);
	    menuBar.add(helpMenu);
	    	    
	    
	  //demonstrate pop-ups
	  	popup = new JPopupMenu();
	  		
	  	popup.add(cutAction);
	  		
	  	popup.add(copyAction);
	  		
	  	popup.add(pasteAction);
	  	
	  	
	  	JPanel panel = new JPanel();
	    panel.setComponentPopupMenu(popup);
	    
	    
	    add(panel);
	    
		
	}
	
	
    public static final int DEFAULT_WIDTH = 600;
	
	public static final int DEFAULT_HEIGHT = 500;
	
	private Action importAction;
	
	private Action exportAction;
	
	private Action runMenuAction;
	
	private JPopupMenu popup;
	
}

class MenuAction extends AbstractAction
{
	String sMenuName = "";
	
	public MenuAction(String sName)
	{
		super(sName);
		
		//putValue(Action.NAME,sName);
		
		//putValue(Action.SHORT_DESCRIPTION,sName.toLowerCase());
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		sMenuName = e.getActionCommand();
		
		if(sMenuName.equals("Import"))
		{
			System.out.println(getValue(Action.NAME) + "selected.");
			
		}else if(sMenuName.equals("Export"))
		{
			System.out.println(getValue(Action.NAME) + "selected.");
			
		}else if(sMenuName.equals("Run count"))
		{
			System.out.println(getValue(Action.NAME) + "selected.");
			
		}else if(sMenuName.equals("AHK"))
		{
			System.out.println(getValue(Action.NAME) + "selected.");
			
		}else if(sMenuName.equals("Data Analyst"))
		{
			System.out.println(getValue(Action.NAME) + "selected.");
			
		}else if(sMenuName.equals("Run"))
		{
			System.out.println(getValue(Action.NAME) + "selected.");
			
		}else if(sMenuName.equals("About"))
		{
			System.out.println(getValue(Action.NAME) + "selected.");
		}
			
		
	}
	
}