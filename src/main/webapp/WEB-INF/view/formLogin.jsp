<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Barbearia Elatanos</title>
</head>
<body>
<form action="/barbearia/controller" method="post">

Login: <input type="text" name="login"/>
Senha: <input type="password" name="senha"/>
<input type="submit" value="Login"/>

<input type="hidden" name="acao" value="Login"/>


</form>

</body>
</html>