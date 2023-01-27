<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Barbearia</title>
</head>
<body>
Agenda: 
<br><br><br>

<c:forEach items="${listaAgenda }" var="lista">

<ul>
Data: ${lista.data }
Horário: ${lista.horario }

<a href="/barbearia/controller?acao=MostraAgendamento&id=${lista.id }">Editar</a>
<a href="/barbearia/controller?acao=RemoveAgendamento&id=${lista.id }">Remover</a>
</ul>
</c:forEach>

</body>
</html>