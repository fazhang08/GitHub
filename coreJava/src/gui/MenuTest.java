package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;


public class MenuTest {

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
				MenuFrame frame = new MenuFrame();
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				frame.setLocation(500, 150);
				
				frame.setVisible(true);
				
			}
			
		});

	}

}

class MenuFrame extends JFrame
{
	public MenuFrame()
	{
		setTitle("MenuTest");
		
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		
		JMenu fileMenu = new JMenu("File");
		
		//fileMenu.add(new TestAction("New"));
		
		
		//demonstrate accelerators
		JMenuItem openItem = fileMenu.add(new TestAction("Open"));
		
		openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
		
		fileMenu.addSeparator();
		
		
		saveAction = new TestAction("Save");
		
		JMenuItem saveItem = fileMenu.add(saveAction);
		
		saveItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
		
		fileMenu.addSeparator();
		
		
		saveAsAction = new TestAction("Save AS");
		
		JMenuItem saveAsItem = fileMenu.add(saveAsAction);
		
		fileMenu.addSeparator();
		
		
		fileMenu.add(new AbstractAction("Exit")
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
				
			}
			
		});
		
		//demonstrate check box and radio button menus
		
		readonlyItem = new JCheckBoxMenuItem("Read-only");
		
		readonlyItem.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				boolean saveOK = !readonlyItem.isSelected();
				
				saveAction.setEnabled(saveOK);
				
				saveAsAction.setEnabled(saveOK);
			}
			
		});
	
		
		ButtonGroup group = new ButtonGroup();
		
		
		JRadioButtonMenuItem insertItem = new JRadioButtonMenuItem("Insert");
		
		insertItem.setSelected(true);
		
		JRadioButtonMenuItem overtypeItem = new JRadioButtonMenuItem("Overtype");
		
		
		group.add(insertItem);
		
		group.add(overtypeItem);
		
		
		//demonstrate icons
		
		Action cutAction = new TestAction("Cut");
		
		cutAction.putValue(Action.SMALL_ICON, new ImageIcon("cut.gif"));
		
		Action copyAction = new TestAction("Copy");
		
		copyAction.putValue(Action.SMALL_ICON, new ImageIcon("copy.gif"));
		
		Action pasteAction = new TestAction("Pase");
		
		pasteAction.putValue(Action.SMALL_ICON, new ImageIcon("paste.gif"));
		
		
		JMenu editMenu = new JMenu("Edit");
		
		editMenu.add(cutAction);
		
		editMenu.add(copyAction);
		
		editMenu.add(pasteAction);
		
		
		JMenu optionMenu = new JMenu("Options");
		
		optionMenu.add(readonlyItem);
		
		optionMenu.addSeparator();
		
		optionMenu.add(insertItem);
		
		optionMenu.addSeparator();
		
		
		editMenu.addSeparator();
		
		editMenu.add(optionMenu);
		
		
		//demostrate mnemonics
		JMenu helpMenu = new JMenu("Help");
		
		helpMenu.setMnemonic('H');
		
		
		JMenuItem indexItem = new JMenuItem("Index");
		
		indexItem.setMnemonic('I');
		
		helpMenu.add(indexItem);
		
		//you can also add the mnemonic key to an action
		Action aboutAction = new TestAction("About");
		
		aboutAction.putValue(Action.MNEMONIC_KEY, new Integer('A'));
		
		helpMenu.add(aboutAction);
		
		
		//add all top-level
		JMenuBar menuBar = new JMenuBar();
		
		setJMenuBar(menuBar);
		
		
		menuBar.add(fileMenu);
		
		menuBar.add(editMenu);
		
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
	
	private Action saveAction;
	
	private Action saveAsAction;
	
	private JCheckBoxMenuItem readonlyItem;
	
	private JPopupMenu popup;
	
}
class TestAction extends AbstractAction
{
	public TestAction(String name)
	{
		super(name);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println(getValue(Action.NAME) + "selected.");
	}

}
