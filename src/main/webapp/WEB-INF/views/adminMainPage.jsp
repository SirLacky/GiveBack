<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Strona Administracyjna</title>
</head>
<body>
<h1> Witaj na stronie Administracyjnej</h1><br>
<form action="/admin/adminAdministration">
    <input type="submit" value="Zarządzanie Administratorami" />
</form>

<form action="/admin/userAdministration">
    <input type="submit" value="Zarządzanie Użytkownikami" />
</form>

<form action="/admin/organizationAdministration">
    <input type="submit" value="Zarządzanie Zaufanymi Instytucjami" />
</form>
<br>
<br>
<form action="/usermain">
    <input type="submit" value="Przejdź do serwisu" />
</form>

<form action="/logout">
    <input type="submit" value="Wyloguj" />
</form>
</p>

</body>
</html>
