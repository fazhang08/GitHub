package interface_inner;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;



public class AnonymousInnerClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		TalkingClock clock = new TalkingClock();
		
		clock.start(1000, true);
		
		JOptionPane.showMessageDialog(null, "Quit program ?");
		
		System.exit(0);

	}
	
	
}
class TalkingClock
{
	
	public void start(int interval, final boolean beep)
	{
		ActionListener listerner = new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e)
				{
					Date now = new Date();
					 
					System.out.println("At the tone, the time is " + now);
					
					if(beep)
						Toolkit.getDefaultToolkit().beep();				
					
				}
			
			};
			
			Timer t = new Timer(interval,listerner);
		
			t.start();
	}
}