package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Calendar2;
import model.Covid;
import model.RegisterMonthlyLogic;
import model.SearchMonthlyInput;

@WebServlet("/SearchMonthlyServlet")
public class SearchMonthlyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// リクエストパラメータ取得(画面に入力された値をとってくる)
		String year = null;
		String prefecture = null;

		year = request.getParameter("year");
		/* prefecture = request.getParameter("prefecture"); */

		String work = request.getParameter("prefecture");
		String work2[] = work.split(",");
		prefecture = work2[0];
		String prefectureJPN = work2[1];

		String Monthly = year + "%";

		// Entity初期化
		SearchMonthlyInput input = new SearchMonthlyInput(Monthly, prefecture);

		// Logic実行
		RegisterMonthlyLogic bo = new RegisterMonthlyLogic();
		List<Covid> covidlist = bo.execute(input);
		
		if (covidlist!=null) {
		// セッションコープに入力値を保存
		// ""内のスペルミス注意！！！jspのsetAttributeと同じにする
		HttpSession session = request.getSession();
		session.setAttribute("covidList", covidlist);

		// String型→int型に変換。
		// Entity初期化
		Calendar2 param = new Calendar2(Integer.parseInt(year), prefecture, prefectureJPN);

		request.setAttribute("param", param);
		

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/monthly.jsp");
			dispatcher.forward(request, response);
		}

		else if (covidlist == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/monthlyindex.jsp");
			dispatcher.forward(request, response);
		}

	}

}
