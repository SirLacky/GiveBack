<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Dane użytkownika</title>
</head>
<body>
<h2>
    Użytkownik: ${loggedUser.username} <br>
    Hasło: ***** <br>
    Imię: ${loggedUser.firstName} <br>
    Nazwisko: ${loggedUser.lastName} <br>
</h2>
    <a href="/profile/edit?id=${loggedUser.id}">EDYTUJ DANE PERSONALNE</a>
<br>
<form action="/usermain">
    <input type="submit" value="Powrót" />
</form>
</body>
</html>
