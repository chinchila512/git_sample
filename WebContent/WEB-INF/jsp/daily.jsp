<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.CovidList,model.RegisterDailyLogic,model.SearchInput,java.util.List,model.Calendar"  %>
    
    <% CovidList covidList=(CovidList)session.getAttribute("covidList"); %>
    <% Calendar jb = (Calendar)request.getAttribute("param"); %>
    
    <% int year = jb.getYear(); %>
    <% int month = jb.getMonth(); %>
    <% String prefecture = jb.getPrefectureOrigin(); %>
    <% String prefectureJPN = jb.getPrefectureJPN(); %>
    <% int topYoubi = jb.getTopYoubi(); %>
    <% int lastDay = jb.getLastDay(); %>

<!DOCTYPE html>
<html lang="ja">
	<head>
	  <meta charset="utf-8">
	  <title><%= jb.getYear() %>年<%= jb.getMonth() %>月 新規感染者数</title>
	  <link rel="stylesheet"  href="css/common.css">
	  <link rel="stylesheet"  href="css/daily.css"> 
	</head>
	
	<body>
	    <h1><%= jb.getYear() %>年<%= jb.getMonth() %>月 <%= jb.getPrefectureJPN() %>の新規感染者数</h1>
	    <table class="box">
		    <tr class="boxrow">
			    <td class="boxdata">
				    <!-- 前月に遷移するURL -->
				    <% Integer wY = year; %>
				    <% Integer wM = month-01; %>
				    <% if ( wM < 01 ) { %>
				    	<% wY--; %>
				    	<% wM = 12; %>
				    <% } %>
				    <a class="transfer" href= "SearchServlet?year=<%=wY.toString()%>&month=<%=wM.toString()%>&prefecture=<%=prefecture%>" >前月</a>
			    </td>
			    <td class="boxdata">
				    <!-- 次月に遷移するURL -->
				    <% wY = year; %> 
				    <% wM = month+1; %>
				    <% if ( wM > 12 ) { %>
				    	<% wY++; %>
				    	<% wM = 1; %>
				    <% } %> 
			    	<a class="transfer" href="SearchServlet?year=<%=wY.toString() %>&month=<%=wM.toString()%>&prefecture=<%=prefecture%>" >翌月</a>
				</td>
			</tr>    
	    </table>
	   
	    <!-- カレンダー本体 -->
	    <table border="1" class="table">
	    	<tr>
		        <th class="youbi">日</th>
		        <th class="youbi">月</th>
		        <th class="youbi">火</th>
		        <th class="youbi">水</th>
		        <th class="youbi">木</th>
		        <th class="youbi">金</th>
		       	<th class="youbi">土</th>
		    </tr>
		    <tr>
		    <% int day = ( topYoubi -1 ) * -1; %>
		    <% do { %>
		    	<% for ( int work = 0; work < 7; work++ ) { %>
		    		<% day++; %>
		    	<td class="hiduke">
		    		<% if (1 <= day && day <= lastDay ) { %>
		    			<%= day %>
	    			<div class="cases">
	    				<% int	caseNum = covidList.getCase(day); %>
	    				<% if (caseNum >= 0)	{ %>
	    					<%= caseNum %><font size="3"> 人</font>
	    				<% } %>
	    			</div>
		    		<% } %>
		    	</td>
		    	<% } %>
		    </tr>
			<% } while ( day < lastDay ); %>
	    </table><br>
		<p class="kome">※感染者数データの無い月はカレンダー表示はされますが、新規感染者数は空白で表示されます<br>
						※新規感染者数は4桁まで対応済み、データは2020年1月16日～2021年11月24日まで</p>
		<a class="link" href="/covid19cases/index.jsp">検索へ戻る</a>
	</body>
</html>