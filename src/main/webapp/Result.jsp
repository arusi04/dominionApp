<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  ArrayList<String> output = new ArrayList<>();
output = (ArrayList<String>)request.getAttribute("playCard[]");
for(int i = 0; i < output.size();i++){
	
	
%>
<%=output.get(i) %><br>		
<%} %>
<form method="get" action="Select.jsp">
<input type="submit" value="戻る">
</form>
</body>

</html>