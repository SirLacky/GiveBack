<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Nadawanie uprawnień administratora</title>
</head>
<body>
<form:form method="post" modelAttribute="user">
<form:errors path="*"/><br>
    <form:hidden path="id"/>
    <form:hidden path="firstName"/>
    <form:hidden path="lastName"/>
    <form:hidden path="password"/>
    <form:hidden path="enabled"/>
    Uzytkownik: <form:input path="username"/> <br>
    Uprawnienia administratora: <br>
    <form:select path="roles">
    <form:option value="1">USER</form:option>
    <form:option value="2">ADMIN</form:option><br>
    </form:select>
    <button>Zmień</button>
</form:form>
<form action="/admin">
    <input type="submit" value="Powrót" />
</form>
</body>
</html>
