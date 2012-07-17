package data_deal;

import java.util.HashMap;

import org.apache.log4j.*;

public class DealCSV {
	
	private static Logger logger = Logger.getLogger(DealCSV.class);
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
	
	
	
	public static HashMap readCSVs(String sFilePath)
	{
		HashMap rMap = new HashMap();
		
		try
		{
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
			logger.debug("readCSVs method exist error !");
		}
		
		return rMap;
		
	}

}
