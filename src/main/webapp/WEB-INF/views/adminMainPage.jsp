<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity4">
<head>
    <title>Strona Administracyjna</title>
</head>
<body>
<p sec:authorize="isAuthenticated()">
<p>Zalogowany jako: <span sec:authentication="name"></span></p>
<p>Posiada role: <span sec:authentication="authorities"></span></p>
</p>
<p sec:authorize-url="/admin/">

<form action="/admin/adminAdministration">
    <input type="submit" value="Zarządzanie Administratorami" />
</form>

<form action="/admin/userAdministration">
    <input type="submit" value="Zarządzanie Użytkownikami" />
</form>

<form action="/admin/organizationsAdministration">
    <input type="submit" value="Zarządzanie Zaufanymi Instytucjami" />
</form>


</p>

</body>
</html>
