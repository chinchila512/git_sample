package model;

public class CovidSE {
	private String hiduke;
	private String prefecture;
	private int cases;
	public CovidSE(String hiduke, String prefecture, int cases) {
		super();
		this.hiduke = hiduke;
		this.prefecture = prefecture;
		this.cases = cases;
	}
	public String getHiduke() {
		return hiduke;
	}
	public String getPrefecture() {
		return prefecture;
	}
	public int getCases() {
		return cases;
	}
	
	
}
