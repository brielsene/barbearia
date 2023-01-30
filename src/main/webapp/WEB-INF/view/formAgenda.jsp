<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Barbearia Elatanos</title>
</head>
<body>
<c:import url="logout-parcial.jsp"/>
<form action="/barbearia/controller" method="post">


Data: <input type="text" name="data"/>
Horario: <input type="text" name="horario"/>
<input type="submit" value="Marcar"/>

<input type="hidden" name="acao" value="NovoAgendamento"/>


</form>

</body>
</html>