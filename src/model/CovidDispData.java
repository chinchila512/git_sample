package model;

public class CovidDispData {
	//カレンダーの日付とDBの日付を一致させるためのmodel
	int day;
	int cases;

	public CovidDispData() {
	}

	public CovidDispData(Covid src) {
		String[] work = src.getHiduke().split("-");
		day = Integer.parseInt(work[2]);
		cases = src.getCases();

	}

}
