<%@ page import="vo.Jojinho"%>
<%@page import="ctr.JojinhosProcess" %>
<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Jojinhos</title>
</head>
<body>
		<%
		JojinhosProcess.testes();
		out.print("<table>");
			for(Jojinho j: JojinhosProcess.jogos) {
					out.print(j.toHTML());
			}
		out.print("</table>");
		%>
</body>
</html>