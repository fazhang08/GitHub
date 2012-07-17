package data_deal;

public class SellReport 
{

	
	public String getsDate() {
		return sDate;
	}

	public void setsDate(String sDate) {
		this.sDate = sDate;
	}

	public String getsWeather() {
		return sWeather;
	}

	public void setsWeather(String sWeather) {
		this.sWeather = sWeather;
	}

	public String getsTCount() {
		return sTCount;
	}

	public void setsTCount(String sTCount) {
		this.sTCount = sTCount;
	}

	public String getsTMoney() {
		return sTMoney;
	}

	public void setsTMoney(String sTMoney) {
		this.sTMoney = sTMoney;
	}

	public String getsSingleCount() {
		return sSingleCount;
	}

	public void setsSingleCount(String sSingleCount) {
		this.sSingleCount = sSingleCount;
	}

	public String getsSingleMoney() {
		return sSingleMoney;
	}

	public void setsSingleMoney(String sSingleMoney) {
		this.sSingleMoney = sSingleMoney;
	}

	public String getsSuteCount() {
		return sSuteCount;
	}

	public void setsSuteCount(String sSuteCount) {
		this.sSuteCount = sSuteCount;
	}

	public String getsSuteMoney() {
		return sSuteMoney;
	}

	public void setsSuteMoney(String sSuteMoney) {
		this.sSuteMoney = sSuteMoney;
	}

	public String getsBuyCount() {
		return sBuyCount;
	}

	public void setsBuyCount(String sBuyCount) {
		this.sBuyCount = sBuyCount;
	}

	private String sDate = "";
	
	private String sWeather = "";
	
	private String sTCount = "";//总件数
	
	private String sTMoney = "";//总金额
	
	private String sSingleCount = "";//单品件数
	
	private String sSingleMoney = "";//单品金额
	
	private String sSuteCount = "";//套装件数
	
	private String sSuteMoney = "";//套装金额;
	
	private String sBuyCount = "";// 购买人数
	
	
}
