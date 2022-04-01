package model;

import java.util.ArrayList;
import java.util.List;
//カレンダーの日付とDBの日付を一致させるためのmodel
public class CovidList {
	private List<CovidDispData> myList;

	public void add(Covid src) {
		CovidDispData work=new CovidDispData(src);
		myList.add(work);
	}
	
	public CovidList( List<Covid> srcList ) {
		myList = new ArrayList<CovidDispData>();
		for(Covid aData:srcList) {
			add(aData);
		}
	}
	
	public int getCase(int day){
		for(CovidDispData aData : myList) {
			if(aData.day==day) {
				return aData.cases;
			}
		}
	
		return -1;
	}
		
}
