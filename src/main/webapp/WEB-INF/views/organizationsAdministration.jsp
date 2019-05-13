<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Lista Zaufanych Instytucji</title>
</head>
<body>
<h1>Witaj na stronie zarządzania organizacjami</h1>

<form action="/admin/organizationAdministration/add">
    <input type="submit" value="DODAJ ORGANIZACJE" />
</form>

<hr>

<c:forEach items="${companylist}" var="company">
    Nazwa Organizacji: <c:out value="${company.name}"/> <br>
    Adres: <c:out value="${company.adress}"/><br>
    <a href="/admin/organizationAdministration/edit?id=${company.id}">EDYTUJ</a>
    <a href="/admin/organizationAdministration/delete?id=${company.id}">USUŃ</a>
    <hr>
</c:forEach>

<form action="/admin">
    <input type="submit" value="Powrót" />
</form>

</body>
</html>
