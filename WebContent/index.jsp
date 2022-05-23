<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="./css/common.css">
		<link rel="stylesheet" type="text/css" href="./css/index.css">
	<title>トップ画面(日別合計)</title>
	</head>
	
	<body>
		<h1>しししし新型コロナウイルス新規感染者数調査</h1>
		<table class="table">
			<tr class="row">
				<td class="hako">日別合計表示</td>
				<td>&emsp;&emsp;&emsp;</td><!-- 空白確保 -->
				<td><a href="/covid19cases/monthlyindex.jsp">月別合計表示へ</a></td>
			</tr>
		</table>
		<!-- テキストボックス -->
		<form action="/covid19cases/SearchServlet" method="get">
			<p class="inputTitle">年: 
				<select name="year" class="year">
					<option value="2020">2020年</option>
					<option value="2021">2021年</option>
					<option value="2022">2022年</option>
				</select>
			</p>
			<p class="inputTitle">月: 
				<select name="month" class="month">
					<option value="01">1月</option>
					<option value="02">2月</option>
					<option value="03">3月</option>
					<option value="04">4月</option>
					<option value="05">5月</option>
					<option value="06">6月</option>
					<option value="07">7月</option>
					<option value="08">8月</option>
					<option value="09">9月</option>
					<option value="10">10月</option>
					<option value="11">11月</option>
					<option value="12">12月</option>
				</select>
			</p>
			<p class="inputTitle">都道府県： 
				<select name="prefecture" class="prefecture">
					<option value="hokkaido,北海道">北海道</option>
					<option value="aomori,青森県">青森県</option>
					<option value="iwate,岩手県">岩手県</option>
					<option value="miyagi,宮城県">宮城県</option>
					<option value="akita,秋田県<">秋田県</option>
					<option value="yamagata,山形県">山形県</option>
					<option value="fukushima,福島県">福島県</option>
					<option value="ibaraki,茨城県">茨城県</option>
					<option value="tochigi,栃木県">栃木県</option>
					<option value="gunma,群馬県">群馬県</option>
					<option value="saitama,埼玉県">埼玉県</option>
					<option value="chiba,千葉県">千葉県</option>
					<option value="tokyo,東京都">東京都</option>
					<option value="kanagawa,神奈川県">神奈川県</option>
					<option value="niigata,新潟県">新潟県</option>
					<option value="toyama,富山県">富山県</option>
					<option value="ishikawa,石川県">石川県</option>
					<option value="fukui,福井県">福井県</option>
					<option value="yamanashi,山梨県">山梨県</option>
					<option value="nagano,長野県">長野県</option>
					<option value="gifu,岐阜県">岐阜県</option>
					<option value="shizuoka,静岡県">静岡県</option>
					<option value="aichi,愛知県">愛知県</option>
					<option value="mie,三重県">三重県</option>
					<option value="shiga,滋賀県">滋賀県</option>
					<option value="kyoto,京都府">京都府</option>
					<option value="osaka,大阪府">大阪府</option>
					<option value="hyogo,兵庫県">兵庫県</option>
					<option value="nara,奈良県">奈良県</option>
					<option value="wakayama,和歌山県">和歌山県</option>
					<option value="tottori,鳥取県">鳥取県</option>
					<option value="shimane,島根県">島根県</option>
					<option value="okayama,岡山県">岡山県</option>
					<option value="hiroshima,広島県">広島県</option>
					<option value="yamaguchi,山口県">山口県</option>
					<option value="tokushima,徳島県">徳島県</option>
					<option value="kagawa,香川県">香川県</option>
					<option value="ehime,愛媛県">愛媛県</option>
					<option value="kochi,高知県">高知県</option>
					<option value="fukuoka,福岡県">福岡県</option>
					<option value="saga,佐賀県">佐賀県</option>
					<option value="nagasaki,長崎県">長崎県</option>
					<option value="kumamoto,熊本県">熊本県</option>
					<option value="oita,大分県">大分県</option>
					<option value="miyazaki,宮崎県">宮崎県</option>
					<option value="kagoshima,鹿児島県">鹿児島県</option>
					<option value="okinawa,沖縄県">沖縄県</option>
				</select>
			</p>
			<input type="submit" value="検索" class="button"><!-- 送信 -->
		</form>
	</body>
</html>	