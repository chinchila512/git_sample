package model;

import java.io.Serializable;

public class Calendar implements Serializable {
	private static final long serialVersionUID = 1L;
	private int year;//年
	private int month;//月
	private String prefectureOrigin;
	private String prefectureJPN;
	private int topYoubi;//該当月1日の曜日１：日…７：土
	private int lastDay;//該当月末日の日付
	private int topY(int year, int month) {
		//Calendar.javaをインスタンス化
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(year, month - 1, 1);
		return cal.get(java.util.Calendar.DAY_OF_WEEK);

	}

//該当月末日の日付算出

	private int lastD(int year, int month) {
		switch (month) {
		case 2:
			//1991年～2099年の間限定の簡易処理
			return (year % 4 == 0) ? 29 : 28;

		case 4:
		case 6:
		case 9:
		case 11:
			return 30;//小の月
		}
		return 31;//残りの大の月

	}
	//デフォルトコンストラクタ
	public Calendar() {}
	
//コンストラクタ
	public Calendar(int year, int month, String prefectureOrigin,String prefectureJPN) {
		
		this.year = year;
		this.month = month;
		this.prefectureOrigin = prefectureOrigin;
		this.prefectureJPN = prefectureJPN;
		this.topYoubi = topY(year, month);
		this.lastDay = lastD(year, month);
	}


	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public String getPrefectureOrigin() {
		return prefectureOrigin;
	}
	
	
	public String getPrefectureJPN() {
		return prefectureJPN;
	}
	
	public int getTopYoubi() {
		return topYoubi;
	}

	public int getLastDay() {
		return lastDay;
	}

}
