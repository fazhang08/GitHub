package gui;

public class AHKBean 
{

	public AHKBean ()
	{
		
	}
	
	public AHKBean(String AutoScriptWriter, String AutoHotkey, String RunCount)
	{
		this.sAutoHotkey = AutoHotkey;
		
		this.sAutoScriptWriter = AutoScriptWriter;
		
		this.sRunCount = RunCount;
		
	}
	
	
	
	public String getsAutoScriptWriter() {
		return sAutoScriptWriter;
	}

	public void setsAutoScriptWriter(String sAutoScriptWriter) {
		this.sAutoScriptWriter = sAutoScriptWriter;
	}

	public String getsAutoHotkey() {
		return sAutoHotkey;
	}

	public void setsAutoHotkey(String sAutoHotkey) {
		this.sAutoHotkey = sAutoHotkey;
	}

	public String getsRunCount() {
		return sRunCount;
	}

	public void setsRunCount(String sRunCount) {
		this.sRunCount = sRunCount;
	}



	private String sAutoScriptWriter;
	
	private String sAutoHotkey;
	
	private String sRunCount;
}
