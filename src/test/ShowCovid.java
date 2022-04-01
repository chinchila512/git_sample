package test;

import java.util.ArrayList;
import java.util.List;

import model.Covid;
import model.CovidList;
import model.RegisterMonthlyLogic;
import model.SearchMonthlyInput;

public class ShowCovid {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("月別表示");
		// test1();
		// test2();
		test3();

	}

	

	public static void test2() {
			System.out.println("test2:");
		
			SearchMonthlyInput input = new SearchMonthlyInput("2020%", "hokkaido"); //

			RegisterMonthlyLogic bo = new RegisterMonthlyLogic();
			List<Covid> covidList = bo.execute(input);
			
			if (covidList == null) {
				System.out.println("条件に一致するものが見つかりませんでした");
			} else {
				for (int i = 0; i < covidList.size(); i++) {
					System.out.print(covidList.get(i).getHiduke() + ",");
					System.out.print(covidList.get(i).getPrefecture() + ",");
					System.out.print(covidList.get(i).getCases() + ",");
		
		
				}
			}
		
		}

	public static void test3() {
		System.out.println("test3:");
		
		List<Covid> sel = new ArrayList<Covid>();
		for (int i = 16; i <= 31; i++) {
			String hiduke = "2020-01-" + i;
			sel.add(new Covid(hiduke, "hokkaido", i + 2));
		}

		CovidList list = new CovidList(sel);

		for ( int i = 1; i <= 31; i++ ) {
			System.out.println( i + ":" + list.getCase(i));
		}
		
	}
}