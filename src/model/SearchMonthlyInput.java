package model;

public class SearchMonthlyInput {
	private String monthly;
	private String prefecture;
	public SearchMonthlyInput(String monthly, String prefecture) {
		super();
		this.monthly = monthly;
		this.prefecture = prefecture;
	}
	public String getMonthly() {
		return monthly;
	}
	public String getPrefecture() {
		return prefecture;
	}
	
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
	}
	

