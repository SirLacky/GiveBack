<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity4">
<head>
    <title>Admin CRUD</title>
</head>
<body>

<%--<p sec:authorize-url="/admin/">--%>
<h1>Zarządzanie Administratorami</h1><br>
    <c:forEach items="${userslist}" var="users">
    Uzytkownik: <c:out value="${users.username}"/> <br>
    Uprawnienia administratora: <c:out value="${users.roles}"/><br>
    <a href="/admin/administration/edit?id=${users.id}">EDYTUJ</a>
<hr>
</c:forEach>

</p>
<br>
<form action="/admin">
    <input type="submit" value="Powrót" />
</form>

</body>
</html>
