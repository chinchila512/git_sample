<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.Covid,model.RegisterDailyLogic,model.SearchInput,model.SearchMonthlyInput,java.util.List,model.Calendar2"  %>
    <% List<Covid> covidList=(List<Covid>)session.getAttribute("covidList"); %>
    <% SearchMonthlyInput input = (SearchMonthlyInput) session.getAttribute("input");%>
    <% Calendar2 jb = (Calendar2)request.getAttribute("param"); %>
    
    <% int year = jb.getYear(); %>
    <% String prefecture = jb.getPrefecture(); %>
    <% String prefectureJPN = jb.getPrefectureJPN(); %>
    
<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="UTF-8">
	 	<link rel="stylesheet"  href="css/common.css">
	 	<link rel="stylesheet" type="text/css" href="./css/monthly.css">
		<title><%= jb.getYear() %>年 <%= jb.getPrefectureJPN() %> 月別新規感染者数</title>
	</head>
	
	<body>
		<h1><%= jb.getYear() %>年 <%= jb.getPrefectureJPN() %>の月別新規感染者数</h1>
		<div class="table">
			<table class="out_table">
				<!-- 4か月ごとにtrでくくっている -->
				<tr><!--1行目 1月～4月 -->
					<td>
						<table class="in_table">
							<tr><th class="head">1月</th></tr>
							<tr><td> 
		                    	<% for(int i = 0; i < covidList.size(); i++){ %>
			                    	<% if ( i+1==1 ) { %>
			                    		<%= covidList.get(i).getCases() %><font size="4"> 人</font>
				    				<% } %>
			    				<% } %>
			    			</td></tr>
						</table>
					</td>
					<td>
						<table class="in_table">
							<tr><th class="head">2月</th></tr>
							<tr><td>
								<% for(int i = 0; i < covidList.size(); i++){%>
			                    	<% if ( i+1==2 ) { %>
			                    		<%= covidList.get(i).getCases() %><font size="4"> 人</font>
				    				<% } %>
				    			<% } %>
				    		</td></tr>
						</table>
					</td>
					<td>
						<table class="in_table">
							<tr><th class="head">3月</th></tr>
							<tr><td>
								<% for(int i = 0; i < covidList.size(); i++){%>
									<% if ( i+1==3 ) { %>
			                    		<%= covidList.get(i).getCases() %><font size="4"> 人</font>
				    				<% } %>
				    			<% } %>
			    			</td></tr>
						</table>
					</td>
					<td>
						<table class="in_table">
							<tr><th class="head">4月</th></tr>
							<tr><td>
								<% for(int i = 0; i < covidList.size(); i++){%>
									<% if ( i+1==4 ) { %>
			                    		<%= covidList.get(i).getCases() %><font size="4"> 人</font>
				    				<% } %>
				    			<% } %>
			    			</td></tr>
						</table>
					</td>
				<tr><!--2行目 5～8月 -->
					<td>
						<table class="in_table">
							<tr><th class="head">5月</th></tr>
							<tr><td>
								<% for(int i = 0; i < covidList.size(); i++){%>
									<% if ( i+1==5 ) { %>
			                    		<%= covidList.get(i).getCases() %><font size="4"> 人</font>
				    				<% } %>
				    			<% } %>
			    			</td></tr>
						</table>
					</td>
					<td>
						<table class="in_table">
							<tr><th class="head">6月</th></tr>
							<tr><td>
								<% for(int i = 0; i < covidList.size(); i++){%>
									<% if ( i+1==6 ) { %>
				                    	<%= covidList.get(i).getCases() %><font size="4"> 人</font>
					    			<% } %>
			    				<% } %>
			    			</td></tr>
						</table>
					</td>
					<td>
						<table class="in_table">
							<tr><th class="head">7月</th></tr>
							<tr><td>
								<% for(int i = 0; i < covidList.size(); i++){%>
									<% if ( i+1==7	) { %>
			                    		<%=covidList.get(i).getCases() %><font size="4"> 人</font>
				    				<% } %>
			    				<% } %>
			    			</td></tr>
						</table>
					</td>
					<td>
						<table class="in_table">
							<tr><th class="head">8月</th></tr>
							<tr><td>
								<% for(int i = 0; i < covidList.size(); i++){%>
									<% if ( i+1==8	) { %>
				                    	<%=	covidList.get(i).getCases() %><font size="4"> 人</font>
				    				<% } %>
			    				<% } %>
			    			</td></tr>
						</table>
					</td>
				</tr>
				<tr><!--3行目 9～12月 -->
					<td>
						<table class="in_table">
							<tr><th class="head">9月</th></tr>
							<tr><td>
								<% for(int i = 0; i < covidList.size(); i++){%>
									<% if ( i+1==9	) { %>
			                    		<%=	covidList.get(i).getCases() %><font size="4"> 人</font>
				    				<% } %>
			    				<% } %>
			    				</td></tr>
						</table>
					</td>
					<td>
						<table class="in_table">
							<tr><th class="head">10月</th></tr>
							<tr><td>
								<% for(int i = 0; i < covidList.size(); i++){%>
									<% if ( i+1==10 ) { %>
		                    			<%= covidList.get(i).getCases() %><font size="4"> 人</font>
			    					<% } %>
			    				<% } %>
			    			</td></tr>
						</table>
					</td>
					<td>
						<table class="in_table">
							<tr><th class="head">11月</th></tr>
							<tr><td>
								<% for(int i = 0; i < covidList.size(); i++){%>
									<% if ( i+1==11 ) { %>
		                    			<%= covidList.get(i).getCases() %><font size="4"> 人</font>
			    					<% } %>
			    				<% } %>
			    			</td></tr>
						</table>
					</td>
					<td>
						<table class="in_table">
							<tr><th class="head">12月</th></tr>
							<tr><td>
								<% for(int i = 0; i < covidList.size(); i++){%>
									<% if ( i+1==12 ) { %>
		                    			<%= covidList.get(i).getCases() %><font size="4"> 人</font>
			    					<% } %>
			    				<% } %>
			    			</td></tr>
						</table>
					</td>
				</tr>
			</table>
		</div><br>
		<p class="kome">※感染者数データの無い月はテーブル表示はされますが、新規感染者数は空白で表示されます<br>
						※新規感染者数は6桁まで対応済み、データは2020年1月16日～2021年11月24日まで</p>
	
	   <a  class="link" href="/covid19cases/monthlyindex.jsp">検索へ戻る</a>
	</body>
</html>