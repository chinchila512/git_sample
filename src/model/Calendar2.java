package model;

import java.io.Serializable;

public class Calendar2 implements Serializable {
	private static final long serialVersionUID = 1L;
	private int year;// 年

	private String prefecture;
	private String prefectureJPN;

	// デフォルトコンストラクタ
	public Calendar2() {

	}

	// 日本語変換用
//コンストラクタ
	public Calendar2(int year, String prefecture, String prefectureJPN) {
		super();
		this.year = year;
		this.prefecture = prefecture;
		this.prefectureJPN = prefectureJPN;
	}

	public int getYear() {
		return year;
	}

	public String getPrefecture() {
		return prefecture;
	}

	public String getPrefectureJPN() {
		return prefectureJPN;
	}
}
