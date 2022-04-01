package model;

public class CovidDailyData {

	public int		nichi;
	public int		cases;
	
	public CovidDailyData( Covid src ) {
		String[] work = src.getHiduke().split("-");
		nichi = Integer.parseInt(work[2]);
		cases = src.getCases();
	}
}
