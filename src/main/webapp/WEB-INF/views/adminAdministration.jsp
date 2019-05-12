<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Admin CRUD</title>
</head>
<body>

<c:forEach items="${userslist}" var="users">
    Uzytkownik: <c:out value="${users.username}"/> <br>
    Imie: <c:out value="${users.firstName}"/> <br>
    Nazwisko: <c:out value="${users.lastName}"/><br>
    Uprawnienia administratora (1=N,2=T): <c:out value="${users.role}"/><br>
    <a href="/user/delete?id=${users.id}">USUŃ</a>
    <a href="/user/edit?id=${users.id}">EDYTUJ</a>
    <hr>
</c:forEach>
<br>
<a href="/logout">Wyloguj</a>
</body>
</html>
