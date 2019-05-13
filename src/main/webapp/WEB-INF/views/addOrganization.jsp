<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Dodaj Zaufana Instytucje</title>
</head>
<body>

<form:form method="post" modelAttribute="company">
    Nazwa Organizacji: <form:input path="name"/>  <br>
    Adres: <form:input path="adress"/><br>
    <button type="submit">DODAJ!</button>
</form:form>
<hr>
<form action="/admin">
    <input type="submit" value="Anuluj" />
</form>
</body>
</html>
