package model;

public class SearchInput {
	private String hiduke;
	private String prefecture;
	public SearchInput(String hiduke, String prefecture) {
		super();
		this.hiduke = hiduke;
		this.prefecture = prefecture;
	}
	public String getHiduke() {
		return hiduke;
	}
	public String getPrefecture() {
		return prefecture;
	}

	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
}
