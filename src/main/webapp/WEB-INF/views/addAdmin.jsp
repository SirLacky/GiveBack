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
    Uzytkownik: <form:input path="username"/> <br>
    Uprawnienia administratora: <form:input path="roles"/> <br>
    <button>Zmień</button>
</form:form>

</body>
</html>
