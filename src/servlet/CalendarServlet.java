/*
 * package servlet;
 * 
 * import java.io.IOException;
 * 
 * import javax.servlet.RequestDispatcher; import
 * javax.servlet.ServletException; import javax.servlet.annotation.WebServlet;
 * import javax.servlet.http.HttpServlet; import
 * javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import model.Calendar;
 * 
 * @WebServlet("/CalendarServlet") public class CalendarServlet extends
 * HttpServlet { private static final long serialVersionUID = 1L;
 * 
 * protected void doGet(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException {
 * 
 * String year = null; String month = null; String prefecture = null;
 * 
 * request.setCharacterEncoding("UTF-8"); year = request.getParameter("year");
 * month = request.getParameter("month"); prefecture =
 * request.getParameter("prefecture");
 * 
 * // String型→int型に変換。 Calendar param= new Calendar(Integer.parseInt(year),
 * Integer.parseInt(month), prefecture,prefectureJPN);
 * 
 * request.setAttribute("param", param);
 * 
 * //フォワード RequestDispatcher
 * disp=request.getRequestDispatcher("/WEB-INF/jsp/daily.jsp");
 * disp.forward(request,response);
 * 
 * }
 * 
 * protected void doPost(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException {
 * 
 * String year = null; String month = null; String prefecture = null;
 * 
 * request.setCharacterEncoding("UTF-8"); year = request.getParameter("year");
 * month = request.getParameter("month"); prefecture =
 * request.getParameter("prefecture");
 * 
 * //ここから↓ // String型→int型に変換。 Calendar param= new
 * Calendar(Integer.parseInt(year), Integer.parseInt(month),prefecture);
 * 
 * request.setAttribute("param", param); //ここまで↑、カレンダーの処理。
 * 
 * 
 * //フォワード RequestDispatcher
 * disp=request.getRequestDispatcher("/WEB-INF/jsp/daily.jsp");
 * disp.forward(request,response);
 * 
 * }
 * 
 * }
 */
