<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Admin CRUD</title>
</head>
<body>

<h1>Zarządzanie Administratorami</h1><br>
    <c:forEach items="${userslist}" var="users">
    Uzytkownik: <c:out value="${users.username}"/> <br>
    Rola użytkownika: <c:out value="${users.roles}"/><br>
    <a href="/admin/adminAdministration/edit?id=${users.id}">EDYTUJ</a>
<hr>
</c:forEach>

</p>
<br>
<form action="/admin">
    <input type="submit" value="Powrót" />
</form>

</body>
</html>
