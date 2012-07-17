package system;

public class JVM_Memory {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("total memory : " + Runtime.getRuntime().totalMemory()/(1024*1024));
		
		System.out.println("memory in use : " +Runtime.getRuntime().freeMemory()/(1024*1024));
	}

}
