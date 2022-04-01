package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Calendar;
import model.CovidList;
import model.RegisterDailyLogic;
import model.SearchInput;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// リクエストパラメータ取得(画面に入力された値をとってくる)
		String year = null;
		String month = null;
		String prefectureOrigin = null;

		year = request.getParameter("year");
		month = request.getParameter("month");
		int intMonth = Integer.parseInt(month);
		String strMonth = String.format("%02d", intMonth); /* %02d...2桁(02)で日付(d)を表示 */
		System.out.println("変換したデータは[" + strMonth + "]"); /* チェック */

		/* prefecture = request.getParameter("prefecture"); */

		prefectureOrigin = request.getParameter("prefecture");
		String work[] = prefectureOrigin.split(",");
		String prefectureENG = work[0];
		String prefectureJPN = work[1];

		String hiduke = year + "-" + strMonth + "%";

		// Entity初期化
		SearchInput input = new SearchInput(hiduke, prefectureENG);

		// Logic実行
		RegisterDailyLogic bo = new RegisterDailyLogic();
		CovidList covidlist = bo.execute(input);

		// セッションコープに入力値を保存
		// ""内のスペルミス注意！！！jspのsetAttributeと同じにする
		HttpSession session = request.getSession();
		session.setAttribute("covidList", covidlist);

		//// Entity初期化
		// String型→int型に変換。
		Calendar param = new Calendar(Integer.parseInt(year), Integer.parseInt(month), prefectureOrigin, prefectureJPN);

		request.setAttribute("param", param);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/daily.jsp");
		dispatcher.forward(request, response);
	}

}
