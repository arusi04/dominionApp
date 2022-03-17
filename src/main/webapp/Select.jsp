<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
使用するカードにチェックを入れてください
<form method="POST" action="/dominionApp/ResultServlet">
<input type="checkbox" name="playCard[]" value="村,3" checked>村</input><br>
<input type="checkbox" name="playCard[]" value="市場,5"checked>市場</input><br>
<input type="checkbox" name="playCard[]" value="礼拝堂,2"checked>礼拝堂</input><br>
<input type="checkbox" name="playCard[]" value="堀,2"checked>堀</input><br>
<input type="checkbox" name="playCard[]" value="家臣,3"checked>家臣</input><br>
<input type="checkbox" name="playCard[]" value="工房,3"checked>工房</input><br>
<input type="checkbox" name="playCard[]" value="商人,3"checked>商人</input><br>
<input type="checkbox" name="playCard[]" value="前駆者,3"checked>前駆者</input><br>
<input type="checkbox" name="playCard[]" value="改築,4"checked>改築</input><br>
<input type="checkbox" name="playCard[]" value="鍛冶屋,4"checked>鍛冶屋</input><br>
<input type="checkbox" name="playCard[]" value="金貸し,4"checked>金貸し</input><br>
<input type="checkbox" name="playCard[]" value="玉座の間,4"checked>玉座の間</input><br>
<input type="checkbox" name="playCard[]" value="密猟者,4"checked>密猟者</input><br>
<input type="checkbox" name="playCard[]" value="民兵,4"checked>民兵</input><br>
<input type="checkbox" name="playCard[]" value="役人,4"checked>役人</input><br>
<input type="checkbox" name="playCard[]" value="庭園,4"checked>庭園</input><br>
<input type="checkbox" name="playCard[]" value="衛兵,5"checked>衛兵</input><br>
<input type="checkbox" name="playCard[]" value="議事堂,5"checked>議事堂</input><br>
<input type="checkbox" name="playCard[]" value="研究所,5"checked>研究所</input><br>
<input type="checkbox" name="playCard[]" value="鉱山,5"checked>鉱山</input><br>
<input type="checkbox" name="playCard[]" value="祝祭,5"checked>祝祭</input><br>
<input type="checkbox" name="playCard[]" value="書庫,5"checked>書庫</input><br>
<input type="checkbox" name="playCard[]" value="山賊,5"checked>山賊</input><br>
<input type="checkbox" name="playCard[]" value="魔女,5"checked>魔女</input><br>
<input type="checkbox" name="playCard[]" value="職人,6"checked>職人</input><br>


<input type="submit" value="送信する">
</form>
</body>
</html>














































